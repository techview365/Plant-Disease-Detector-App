package com.techview365.plantdiseasedetectionapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PostFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class PostFragment extends Fragment {
    // Define keys for arguments
    private static final String ARG_IMAGE_RES_ID = "imageResourceId";
    private static final String ARG_TITLE = "title";
    private static final String ARG_DESCRIPTION = "description";

    // Factory method to create new instances of this fragment
    public static PostFragment newInstance(int imageResId, String title, String description) {
        PostFragment fragment = new PostFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_IMAGE_RES_ID, imageResId);
        args.putString(ARG_TITLE, title);
        args.putString(ARG_DESCRIPTION, description);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_post, container, false);

        if (getArguments() != null) {
            int imageResId = getArguments().getInt(ARG_IMAGE_RES_ID);
            String title = getArguments().getString(ARG_TITLE);
            String description = getArguments().getString(ARG_DESCRIPTION);

            // Now set these values to your views
            ImageView imageView = view.findViewById(R.id.imageViewPost);
            TextView textViewTitle = view.findViewById(R.id.titleTxt);
            TextView textViewDescription = view.findViewById(R.id.descriptionTxt);

            imageView.setImageResource(imageResId);
            textViewTitle.setText(title);
            textViewDescription.setText(description);
        }
        return view;
    }
}
