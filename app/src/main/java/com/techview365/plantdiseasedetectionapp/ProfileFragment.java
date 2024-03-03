package com.techview365.plantdiseasedetectionapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class ProfileFragment extends Fragment {
    private FirebaseAuth auth;
    private Button logoutButton;
    private TextView userDetailsTextView;
    private FirebaseUser user;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        // Initialize Firebase Auth
        auth = FirebaseAuth.getInstance();

        // Get current user
        user = auth.getCurrentUser();
        // Initialize views
        logoutButton = view.findViewById(R.id.logout1);
        userDetailsTextView = view.findViewById(R.id.user_details);
        // Check if the user is logged in
        if (user == null) {
            // If not logged in, start LoginActivity
            startLoginActivity();
        } else {
            // If logged in, display the user's email
            userDetailsTextView.setText(user.getEmail());
        }

        // Set the logout button click listener
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Sign out from Firebase
                auth.signOut();

                // Start LoginActivity
                startLoginActivity();
            }
        });

        return view;
    }
    private void startLoginActivity() {
        Intent intent = new Intent(getActivity(), LoginActivity.class);
        startActivity(intent);
        // Ensure that the user cannot go back to the profile fragment without logging in again
        getActivity().finish();
    }



}