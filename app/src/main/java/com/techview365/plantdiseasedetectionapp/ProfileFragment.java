package com.techview365.plantdiseasedetectionapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class ProfileFragment extends Fragment {
    public ProfileFragment(){

    }
    public static ProfileFragment newInstance(){
        return new ProfileFragment();
    }
    public static ProfileFragment newInstance(String aboutButton) {
        Bundle args = new Bundle();
        args.putString("About", aboutButton);
        ProfileFragment fragment = new ProfileFragment();
        fragment.setArguments(args);
        return fragment;
    }
    private FirebaseAuth auth;
    private Button logoutButton, exploreButton, communityButton, backToMainPageButton, shareButton;
    private TextView userDetailsTextView;
    private FirebaseUser user;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        // Initialize Firebase Auth
        auth = FirebaseAuth.getInstance();

        // Get current user
        user = auth.getCurrentUser();
        // Initialize views
        logoutButton = view.findViewById(R.id.logout1);
        exploreButton = view.findViewById(R.id.button2); // For navigating to Explore
        communityButton = view.findViewById(R.id.communityButton); // For navigating to Community
        userDetailsTextView = view.findViewById(R.id.user_details);
        // Initialize the back to Crop (Main Page) button
        backToMainPageButton = view.findViewById(R.id.backToMainPageButton); // Make sure this ID matches your XML
        // Initialize the Share button
        shareButton = view.findViewById(R.id.buttonShare); // Ensure this ID matches your XML
        View aboutApp = view.findViewById(R.id.aboutButton);

        // Check if the user is logged in
        if (user == null) {
            // If not logged in, start LoginActivity
            startLoginActivity();
        } else {
            // If logged in, display the user's name and email
            String userDetails = "";
            if (user.getDisplayName() != null && !user.getDisplayName().isEmpty()) {
                userDetails += "Name: " + user.getDisplayName() + "\n";
            }
            userDetails += "Email: " + user.getEmail();
            userDetailsTextView.setText(userDetails);
        }

        // Set the logout button click listener
        logoutButton.setOnClickListener(v -> {
            // Sign out from Firebase
            auth.signOut();
            // Start LoginActivity
            startLoginActivity();
        });

        // Set the Explore button click listener
        exploreButton.setOnClickListener(v -> navigateTo(R.id.explore)); // ID from bottom_nav_menu.xml

        // Set the Community button click listener
        communityButton.setOnClickListener(v -> navigateTo(R.id.community)); // ID from bottom_nav_menu.xml
        backToMainPageButton.setOnClickListener(v -> navigateTo(R.id.crop)); // Use the ID from bottom_nav_menu.xml

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareAppLink();
            }
        });

        aboutApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._about_plant, // Replace with your actual drawable resource
                        "About\n",
                        "Discover Agriscan , your dedicated resource for cultivating a deeper understanding of plant life. Our app is more than just a tool - it's an educational companion crafted to enhance your botanical journey. Our goal is to assist farmers like you in identifying crop diseases and providing effective solutions. With our app, you'll be able to quickly diagnose diseases affecting your crops.\n\n" +
                                "Capture, Learn, Connect.\n\n" +
                                "Snap a picture and uncover the identity of your plant instantly. Experience the magic of Al-powered identification, simplifying your learning journey.\n\n" +
                                "Natural, understanding, successful.\n\n" +
                                "Dive into in-depth care covering all aspects of plant health. Help yourself with a care guide to help your green partner thrive.\n\n" +
                                "Thanks a bunch!\n\n" +
                                "Thank you for being a part of our plant-loving family. Whether you're a farmer, a gardening enthusiast, or just starting out, we're here to support you on your green journey. Wishing you abundant growth and endless joy with your plants.\n\n" +
                                " Happy farming! "
                );
                openPostFragment(postFragment);
            }
        });

        return view;
    }
    private void openPostFragment(PostFragment postFragment) {


        if (getFragmentManager() != null) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.fragment_profile, postFragment) // Ensure you use the correct container ID
                    .addToBackStack(null)
                    .commit();
        }
    }

    private void startLoginActivity() {
        Intent intent = new Intent(getActivity(), LoginActivity.class);
        startActivity(intent);
        getActivity().finish();
    }

    private void navigateTo(int itemId) {
        BottomNavigationView bottomNavigationView = getActivity().findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(itemId);
    }
    private void shareAppLink() {
        String shareMessage = "Check out this Plant Disease Detection App: https://drive.google.com/uc?export=download&id=1AfrP91Nc6vJWThgSWm9igWjIsp0cDcFx";
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);

        // Create a chooser intent
        Intent chooserIntent = Intent.createChooser(shareIntent, "Share via");
        startActivity(chooserIntent);
    }
}

