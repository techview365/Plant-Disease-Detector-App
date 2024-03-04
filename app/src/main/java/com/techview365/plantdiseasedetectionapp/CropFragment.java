package com.techview365.plantdiseasedetectionapp;

import static android.app.Activity.RESULT_OK;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import org.tensorflow.lite.DataType;
import org.tensorflow.lite.Interpreter;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;

import android.Manifest;

public class CropFragment extends Fragment {

    private static final int REQUEST_IMAGE_CAPTURE = 1;
    private static final int REQUEST_IMAGE_PICK = 2;
    private ImageView imageView;
    private TextView resultTextView;
    private Interpreter tflite;
    private static final int PERMISSION_REQUEST_CAMERA = 1;

    private static final int NUM_CLASSES = 38; // Adjust based on your model's output
    private static final int BATCH_SIZE = 1; // Most likely 1 for real-time predictions
    private static final int IMG_HEIGHT = 224; // Height of the input images your model expects
    private static final int IMG_WIDTH = 224; // Width of the input images your model expects
    private static final int PIXEL_SIZE = 3; // Typically 3 for RGB images
    private float imageMean = 0;
    private float imageStd = 255.0f;
    private int[] inputShape;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_crop, container, false);

        // Set up the guide card click listener
        CardView guideCard = view.findViewById(R.id.guideCard); // Replace with your actual guide card ID
        guideCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace the fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                Fragment guideFragment = GuideFragment.newInstance("Water Guide"); // Create new instance of GuideFragment
                // Perform the fragment transaction to replace CropFragment with GuideFragment
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();

                fragmentTransaction.replace(R.id.fragment_crop, guideFragment); // Replace 'fragment_container' with the ID of your container
                fragmentTransaction.addToBackStack(null); // Add this transaction to the back stack
                fragmentTransaction.commit();
            }
        });

        // setup the pests and disease click listener
        CardView pestsAndDisease = view.findViewById(R.id.pestsAndDisease); // Replace with your actual pestsAndDisease card ID
        pestsAndDisease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace the fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                Fragment pestsAndDiseaseFragment = PestsAndDiseaseFragment.newInstance("Pests and Disease"); // Create new instance of GuideFragment
                // Perform the fragment transaction to replace CropFragment with GuideFragment
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();

                fragmentTransaction.replace(R.id.fragment_crop, pestsAndDiseaseFragment); // Replace 'fragment_container' with the ID of your container
                fragmentTransaction.addToBackStack(null); // Add this transaction to the back stack
                fragmentTransaction.commit();
            }
        });

        imageView = view.findViewById(R.id.uploadedImage);
        resultTextView = view.findViewById(R.id.resultTextView); // Make sure to have a TextView with this id in your layout
        // Set the initial size of the imageView to 100dp
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = dpToPx(100); // Convert 100dp to pixels
        layoutParams.height = dpToPx(100); // Convert dp to pixel for height
        imageView.setLayoutParams(layoutParams);

        view.findViewById(R.id.btn_take).setOnClickListener(v -> {
            if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                requestCameraPermission();
            } else {
                dispatchTakePictureIntent();
            }
        });

        // If you have a button to upload image from gallery, you can set its onClickListener similar to the camera button
        // and handle the gallery intent
        view.findViewById(R.id.btn_upload).setOnClickListener(v -> {
            dispatchPickPictureIntent();
        });

        // Load the TensorFlow Lite model
        loadModel();

        return view;
    }

    private int dpToPx(int dp) {
        return (int) (dp * getResources().getDisplayMetrics().density);
    }


    private void loadModel() {
        Log.d("CropFragment", "Loading model...");
        try {
            tflite = new Interpreter(loadModelFile(getActivity(), "model.tflite"));
            // Add these lines to check the model's input specifications
            inputShape = tflite.getInputTensor(0).shape(); // e.g., [1, height, width, 3]
            DataType inputDataType = tflite.getInputTensor(0).dataType();
            Log.d("ModelInput", "inputShape: " + Arrays.toString(inputShape) + ", inputDataType: " + inputDataType);
        } catch (IOException e) {
            Log.e("TFLite", "Error loading model", e);
        }

        Log.d("CropFragment", "Model loaded successfully");
    }

    private MappedByteBuffer loadModelFile(Activity activity, String modelName) throws IOException {
        AssetFileDescriptor fileDescriptor = activity.getAssets().openFd(modelName);
        FileInputStream inputStream = new FileInputStream(fileDescriptor.getFileDescriptor());
        FileChannel fileChannel = inputStream.getChannel();
        long startOffset = fileDescriptor.getStartOffset();
        long declaredLength = fileDescriptor.getDeclaredLength();
        return fileChannel.map(FileChannel.MapMode.READ_ONLY, startOffset, declaredLength);
    }

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getActivity().getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    private void dispatchPickPictureIntent() {
        Intent pickPictureIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        if (pickPictureIntent.resolveActivity(getActivity().getPackageManager()) != null) {
            startActivityForResult(pickPictureIntent, REQUEST_IMAGE_PICK);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            Bitmap imageBitmap = null;
            if (requestCode == REQUEST_IMAGE_CAPTURE) {
                Bundle extras = data.getExtras();
                imageBitmap = (Bitmap) extras.get("data");
            } else if (requestCode == REQUEST_IMAGE_PICK) {
                Uri selectedImageUri = data.getData();
                try {
                    imageBitmap = MediaStore.Images.Media.getBitmap(getActivity().getContentResolver(), selectedImageUri);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (imageBitmap != null) {
                // Preprocess the image
                Bitmap preprocessedImage = preprocessImage(imageBitmap);
                imageView.setImageBitmap(preprocessedImage);

                // TODO: Run your model inference here with the preprocessedImage
                // float[] results = runInference(preprocessedImage);
                // displayResults(results);
                // Set the size of the imageView to 150dp when a picture is captured
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.height = dpToPx(200); // Convert 150dp to pixels
                layoutParams.width = dpToPx(200); // Convert dp to pixel for height
                imageView.setLayoutParams(layoutParams);
                imageView.setImageBitmap(imageBitmap);
                imageView.setBackgroundResource(R.drawable.image_border);
                // Adjust padding to match the border width in the drawable if needed
                int paddingDp = 4; // Assuming a 2dp border and wanting some space
                int paddingPx = dpToPx(paddingDp);
                imageView.setPadding(paddingPx, paddingPx, paddingPx, paddingPx);


                // Run model inference and display results
                float[] results = runInference(preprocessedImage);
                displayResults(results);


            }
        }
    }


    private Bitmap preprocessImage(Bitmap originalBitmap) {
        // Resize the bitmap to the required input size of the model
        // For example, if your model requires 224x224 images:
        Bitmap resizedBitmap = Bitmap.createScaledBitmap(originalBitmap, 224, 224, true);

        // Additional preprocessing steps as required by your model
        // For example, normalization, converting to grayscale, etc.

        return resizedBitmap;
    }

    private float[] runInference(Bitmap preprocessedImage) {
        // Assuming you've already converted the preprocessedImage into ByteBuffer imgData
        ByteBuffer imgData = convertBitmapToByteBuffer(preprocessedImage);

        // Initialize the output array. Assuming numClasses is already defined based on your model's output.
        float[][] outputVal = new float[1][NUM_CLASSES]; // numClasses is the number of classes your model predicts

        // Run the model inference
        tflite.run(imgData, outputVal);

        float[] results = outputVal[0];
        // Process the outputVal as needed to display the results
        displayResults(results);
        return outputVal[0];
    }

    private ByteBuffer convertBitmapToByteBuffer(Bitmap bitmap) {
        if (inputShape == null) {
            // Handle the case where inputShape wasn't initialized
            Log.e("CropFragment", "Input shape is null. Model might not have been loaded properly.");
            // Consider throwing an exception or returning null
            return null;
        }
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(4 * inputShape[1] * inputShape[2] * PIXEL_SIZE);
        byteBuffer.order(ByteOrder.nativeOrder());

        // Resize the bitmap to match the model's input dimensions
        Bitmap resizedBitmap = Bitmap.createScaledBitmap(bitmap, inputShape[1], inputShape[2], true);

        int[] intValues = new int[inputShape[1] * inputShape[2]];
        resizedBitmap.getPixels(intValues, 0, resizedBitmap.getWidth(), 0, 0, resizedBitmap.getWidth(), resizedBitmap.getHeight());

        byteBuffer.rewind();
        for (int i = 0; i < inputShape[1]; ++i) {
            for (int j = 0; j < inputShape[2]; ++j) {
                int pixelValue = intValues[i * inputShape[2] + j];
                byteBuffer.putFloat(((pixelValue >> 16) & 0xFF) / 255.0f);
                byteBuffer.putFloat(((pixelValue >> 8) & 0xFF) / 255.0f);
                byteBuffer.putFloat((pixelValue & 0xFF) / 255.0f);
            }
        }
        return byteBuffer;
    }


    private void displayResults(float[] results) {
        // Assuming results contains the probabilities for each class
        // Find the index of the class with the highest probability
        int maxIndex = 0;
        for (int i = 1; i < results.length; i++) {
            if (results[i] > results[maxIndex]) maxIndex = i;
        }

        String diseaseName = getDiseaseName(maxIndex); // Implement this method based on your classes
        String remedies = getRemediesForDisease(diseaseName); // Implement based on your knowledge base

//        resultTextView.setText(String.format("Disease Detected: %s\nRemedies: %s", diseaseName, remedies));
        // Ensure UI update is run on the UI thread
        getActivity().runOnUiThread(() -> {
            resultTextView.setText(String.format("Disease Detected: %s\nRemedies: %s", diseaseName, remedies));
        });
    }

    private String getDiseaseName(int classIndex) {
        // Placeholder: Replace with your actual logic and class names
        String[] diseases = {
                "Apple___Apple_scab",
                "Apple___Black_rot",
                "Apple___Cedar_apple_rust",
                "Apple___healthy",
                "Blueberry___healthy",
                "Cherry_(including_sour)___Powdery_mildew",
                "Cherry_(including_sour)___healthy",
                "Corn_(maize)___Cercospora_leaf_spot Gray_leaf_spot",
                "Corn_(maize)___Common_rust_",
                "Corn_(maize)___Northern_Leaf_Blight",
                "Corn_(maize)___healthy",
                "Grape___Black_rot",
                "Grape___Esca_(Black_Measles)",
                "Grape___Leaf_blight_(Isariopsis_Leaf_Spot)",
                "Grape___healthy",
                "Orange___Haunglongbing_(Citrus_greening)",
                "Peach___Bacterial_spot",
                "Peach___healthy",
                "Pepper,_bell___Bacterial_spot",
                "Pepper,_bell___healthy",
                "Potato___Early_blight",
                "Potato___Late_blight",
                "Potato___healthy",
                "Raspberry___healthy",
                "Soybean___healthy",
                "Squash___Powdery_mildew",
                "Strawberry___Leaf_scorch",
                "Strawberry___healthy",
                "Tomato___Bacterial_spot",
                "Tomato___Early_blight",
                "Tomato___Late_blight",
                "Tomato___Leaf_Mold",
                "Tomato___Septoria_leaf_spot",
                "Tomato___Spider_mites Two-spotted_spider_mite",
                "Tomato___Target_Spot",
                "Tomato___Tomato_Yellow_Leaf_Curl_Virus",
                "Tomato___Tomato_mosaic_virus",
                "Tomato___healthy"
        };

        return diseases[classIndex];
    }

    private String getRemediesForDisease(String diseaseName) {
        switch (diseaseName) {
            case "Apple___Apple_scab":
                return "Apply fungicides early in the season and remove fallen leaves to reduce infection sources.";
            case "Apple___Black_rot":
                return "Prune out infected branches and apply appropriate fungicides.";
            case "Apple___Cedar_apple_rust":
                return "Remove nearby cedar trees if possible, and use fungicides to protect trees during wet spring weather.";
            case "Apple___healthy":
                return "No treatment needed for healthy plants.";
            case "Blueberry___healthy":
                return "No treatment needed for healthy plants.";
            case "Cherry_(including_sour)___Powdery_mildew":
                return "Use sulfur or potassium bicarbonate sprays to control the mildew.";
            case "Corn_(maize)___Cercospora_leaf_spot Gray_leaf_spot":
                return "Apply fungicides that are effective against Cercospora species.";
            case "Corn_(maize)___Common_rust_":
                return "Plant resistant varieties and apply fungicides if necessary.";
            case "Corn_(maize)___Northern_Leaf_Blight":
                return "Use resistant corn varieties and apply fungicides as needed.";
            case "Corn_(maize)___healthy":
                return "No treatment needed for healthy plants.";
            case "Grape___Black_rot":
                return "Apply fungicides and ensure good air circulation through pruning.";
            case "Grape___Esca_(Black_Measles)":
                return "Prune out infected wood and apply wound protectants to prevent infection.";
            case "Grape___Leaf_blight_(Isariopsis_Leaf_Spot)":
                return "Apply copper-based fungicides and ensure proper canopy management.";
            case "Grape___healthy":
                return "No treatment needed for healthy plants.";
            case "Orange___Haunglongbing_(Citrus_greening)":
                return "Remove and destroy infected trees to prevent spread and control citrus psyllid populations.";
            case "Peach___Bacterial_spot":
                return "Apply copper-based bactericides early in the season and improve tree nutrition.";
            case "Peach___healthy":
                return "No treatment needed for healthy plants.";
            case "Pepper,_bell___Bacterial_spot":
                return "Use pathogen-free seeds, apply copper sprays, and practice crop rotation.";
            case "Pepper,_bell___healthy":
                return "No treatment needed for healthy plants.";
            case "Potato___Early_blight":
                return "Use fungicide sprays and rotate crops to prevent disease.";
            case "Potato___Late_blight":
                return "Apply fungicides, practice crop rotation, and destroy infected plants.";
            case "Potato___healthy":
                return "No treatment needed for healthy plants.";
            case "Raspberry___healthy":
                return "No treatment needed for healthy plants.";
            case "Soybean___healthy":
                return "No treatment needed for healthy plants.";
            case "Squash___Powdery_mildew":
                return "Use fungicide sprays and plant resistant varieties if available.";
            case "Strawberry___Leaf_scorch":
                return "Remove infected leaves and apply fungicides to protect new foliage.";
            case "Strawberry___healthy":
                return "No treatment needed for healthy plants.";
            case "Tomato___Bacterial_spot":
                return "Use disease-free seeds, apply copper-based fungicides, and avoid overhead watering.";
            case "Tomato___Early_blight":
                return "Apply fungicides and remove affected leaves to reduce the spread.";
            case "Tomato___Late_blight":
                return "Use resistant varieties, apply fungicides, and ensure good air circulation.";
            case "Tomato___Leaf_Mold":
                return "Improve air circulation in the greenhouse and apply fungicides.";
            case "Tomato___Septoria_leaf_spot":
                return "Remove infected leaves, avoid water splash on leaves, and apply fungicides.";
            case "Tomato___Spider_mites Two-spotted_spider_mite":
                return "Use miticides or introduce predatory mites to control the spider mite population.";
            case "Tomato___Target_Spot":
                return "Rotate crops, use clean seeds, and apply fungicides as needed.";
            case "Tomato___Tomato_Yellow_Leaf_Curl_Virus":
                return "Control whitefly populations and remove infected plants.";
            case "Tomato___Tomato_mosaic_virus":
                return "Remove and destroy infected plants, disinfect gardening tools, and avoid smoking around plants.";
            case "Tomato___healthy":
                return "No treatment needed for healthy plants.";
            default:
                return "Consult a professional for accurate diagnosis and treatment.";
        }
    }


    private void requestCameraPermission() {
        requestPermissions(new String[]{Manifest.permission.CAMERA}, PERMISSION_REQUEST_CAMERA);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == PERMISSION_REQUEST_CAMERA) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                dispatchTakePictureIntent();
            } else {
                // Permission was denied. Handle the failure.
            }
        }
    }

}
