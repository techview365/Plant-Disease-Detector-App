package com.techview365.plantdiseasedetectionapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ExploreFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ExploreFragment extends Fragment {

    public ExploreFragment() {
        // Required empty public constructor
    }
    public static ExploreFragment newInstance() {
        return new ExploreFragment();
    }

    // Optionally pass data to the fragment using newInstance pattern
    public static ExploreFragment newInstance(String exploreName) {
        Bundle args = new Bundle();
        args.putString("GUIDE_NAME", exploreName);
        ExploreFragment fragment = new ExploreFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_explore, container, false);

        // Assuming you have a button or any clickable view in your fragment_guide.xml
        // For demonstration, let's assume its ID is guideCard
        // exploreCard1
        View exploreCard1 = view.findViewById(R.id.exploreCard1); // Ensure you have a view with this ID in your layout
        exploreCard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._apple, // Replace with your actual drawable resource
                        "Apple",
                        " - Category: Fruit\n" +
                                " - Family: Rosaceae\n" +
                                " - Common Name: Apple\n" +
                                " - Description: Deciduous tree with sweet fruit\n" +
                                " - Watering: Regular, moderate\n" +
                                " - Temperature: Cool to cold climate\n" +
                                " - Sunlight: Full sun\n" +
                                " - Soil: Well-drained, loamy soil\n" +
                                " - Edible: Yes\n" +
                                " - Fertilizer: Balanced\n" +
                                " - Humidity: Moderate\n" +
                                " - Misting: Occasionally"
                );
                openPostFragment(postFragment);
            }
        });

        // exploreCard2
        View exploreCard2 = view.findViewById(R.id.exploreCard2); // Ensure you have a view with this ID in your layout
        exploreCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._banana, // Replace with your actual drawable resource
                        "Banana",
                        " - Category: Fruit\n" +
                                " - Family: Musaceae\n" +
                                " - Common Name: Banana\n" +
                                " - Description: Herbaceous plant with large, elongated leaves and clusters of fruits.\n" +
                                " - Watering: Regular watering, keep soil consistently moist.\n" +
                                " - Temperature: Thrives in warm climates.\n" +
                                " - Sunlight: Full sunlight.\n" +
                                " - Soil: Well-draining soil.\n" +
                                " - Edible: Yes.\n" +
                                " - Fertilizer: Balanced fertilizer during growing season.\n" +
                                " - Humidity: Prefers high humidity.\n" +
                                " - Misting: Occasionally mist leaves"
                );
                openPostFragment(postFragment);
            }
        });
        // exploreCard3
        View exploreCard3 = view.findViewById(R.id.exploreCard3); // Ensure you have a view with this ID in your layout
        exploreCard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._capsiccum, // Replace with your actual drawable resource
                        "Capsiccum",
                        "Family: Solanaceae\n" +
                                "- Common Name: Bell Pepper, Chili Pepper\n" +
                                "- Description: Capsicum species are flowering plants known for their fruit, which are used worldwide as vegetables, spices, or in medicine. The fruit can range from sweet to very hot, depending on the variety.\n" +
                                "- Watering: Regular, consistent watering needed, ensuring the soil is moist but not waterlogged.\n" +
                                "- Temperature: Prefers warm conditions, with temperatures between 70-85°F (21-29°C).\n" +
                                "- Sunlight: Requires full sun for optimal growth and fruit production.\n" +
                                "- Soil: Fertile, well-draining soil with a pH between 6.0 and 6.8.\n" +
                                "- Edible: Yes, all parts of the fruit are edible and widely used in cooking for their flavor and heat.\n" +
                                "- Fertilizer: Apply a balanced fertilizer every 4-6 weeks during the growing season.\n" +
                                "- Humidity: Prefers moderate humidity but can tolerate a wide range.\n" +
                                "- Misting: Not typically required unless grown in very dry conditions.\n" +
                                "- Rotation: Rotate crops annually to prevent disease and maintain soil health."
                );
                openPostFragment(postFragment);
            }
        });
        // exploreCard4
        View exploreCard4 = view.findViewById(R.id.exploreCard4); // Ensure you have a view with this ID in your layout
        exploreCard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._cotton, // Replace with your actual drawable resource
                        "Cotton",
                        "Category: Fiber Crop\n" +
                                " - Family: Malvaceae\n" +
                                " - Common Name: Cotton\n" +
                                " - Description: Fibrous plants used for textile production.\n" +
                                " - Watering: Moderate, avoid waterlogging.\n" +
                                " - Temperature: Warm climate preferred.\n" +
                                " - Sunlight: Full sun.\n" +
                                " - Soil: Well-draining soil.\n" +
                                " - Edible: No.\n" +
                                " - Fertilizer: Balanced fertilizer during growing season.\n" +
                                " - Humidity: Moderate.\n" +
                                " - Misting: Not required.\n" +
                                " - Rotation: Rotate crops to prevent disease"
                );
                openPostFragment(postFragment);
            }
        });
        // exploreCard5
        View exploreCard5 = view.findViewById(R.id.exploreCard5); // Ensure you have a view with this ID in your layout
        exploreCard5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._cowpea, // Replace with your actual drawable resource
                        "Cowpea",
                        " - Category: Legume\n" +
                                " - Family: Fabaceae\n" +
                                " - Common Name: Cowpea or Black-eyed Pea\n" +
                                " - Description: Edible beans, often with a black spot on the hilum.\n" +
                                " - Watering: Moderate watering, well-drained soil.\n" +
                                " - Temperature: Warm temperatures, drought-tolerant.\n" +
                                " - Sunlight: Full sunlight.\n" +
                                " - Soil: Well-drained soil.\n" +
                                " - Edible: Yes, seeds are used for cooking.\n" +
                                " - Fertilizer: Balanced fertilizer during the growing season.\n" +
                                " - Humidity: Tolerates various humidity levels.\n" +
                                " - Misting: Not required.\n" +
                                " - Rotation: Rotate crops for soil health."
                );
                openPostFragment(postFragment);
            }
        });
        // exploreCard6
        View exploreCard6 = view.findViewById(R.id.exploreCard6); // Ensure you have a view with this ID in your layout
        exploreCard6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._cumin, // Replace with your actual drawable resource
                        "Cumin",
                        "- Category: Herb\n" +
                                "- Family: Apiaceae\n" +
                                "- Common Name: Cumin\n" +
                                "- Description: Small flowering herb with aromatic seeds.\n" +
                                "- Watering: Allow soil to dry between watering.\n" +
                                "- Temperature: Thrives in warm temperatures.\n" +
                                "- Sunlight: Full sun.\n" +
                                "- Soil: Well-draining soil.\n" +
                                "- Edible: Seeds used as a spice.\n" +
                                "- Fertilizer: Light feeding during the growing season.\n" +
                                "- Humidity: Tolerates low to moderate humidity.\n" +
                                "- Misting: Not required.\n" +
                                "- Rotation: Not applicable; grown as an annual."
                );
                openPostFragment(postFragment);
            }
        });
        // exploreCard7
        View exploreCard7 = view.findViewById(R.id.exploreCard7); // Ensure you have a view with this ID in your layout
        exploreCard7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._fenugreek, // Replace with your actual drawable resource
                        "Fenugreek",
                        "- Category: Herb\n" +
                                "- Family: Fabaceae\n" +
                                "- Common Name: Fenugreek\n" +
                                "- Description: Annual herb with trifoliate leaves.\n" +
                                "- Watering: Keep soil consistently moist.\n" +
                                "- Temperature: Prefers cooler temperatures.\n" +
                                "- Sunlight: Full sun to partial shade.\n" +
                                "- Soil: Well-draining, loamy soil.\n" +
                                "- Edible: Leaves and seeds used in cooking.\n" +
                                "- Fertilizer: Balanced fertilizer during growth.\n" +
                                "- Humidity: Moderate humidity preferred.\n" +
                                "- Misting: Occasionally for humidity.\n" +
                                "- Rotation: Not necessary for this annual herb."
                );
                openPostFragment(postFragment);
            }
        });
        // exploreCard8
        View exploreCard8 = view.findViewById(R.id.exploreCard8); // Ensure you have a view with this ID in your layout
        exploreCard8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._ginger, // Replace with your actual drawable resource
                        "Ginger",
                        " - Category: Rhizome\n" +
                                " - Family: Zingiberaceae\n" +
                                " - Common Name: Ginger\n" +
                                " - Description: Underground rhizome with a spicy flavor.\n" +
                                " - Watering: Regular, keeping soil consistently moist.\n" +
                                " - Temperature: Warm environment, around 75-85°F (24-29°C).\n" +
                                " - Sunlight: Partial shade.\n" +
                                " - Soil: Well-draining soil rich in organic matter.\n" +
                                " - Edible: Yes\n" +
                                " - Fertilizer: Balanced fertilizer during the growing season.\n" +
                                " - Humidity: Prefers high humidity."
                );
                openPostFragment(postFragment);
            }
        });

        return view;
    }

    private void openPostFragment(PostFragment postFragment) {


        if (getFragmentManager() != null) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.fragment_explore, postFragment) // Ensure you use the correct container ID
                    .addToBackStack(null)
                    .commit();
        }
    }

    // Rest of your fragment code...
}