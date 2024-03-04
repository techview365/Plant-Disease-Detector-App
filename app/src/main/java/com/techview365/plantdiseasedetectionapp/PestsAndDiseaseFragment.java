package com.techview365.plantdiseasedetectionapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PestsAndDiseaseFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PestsAndDiseaseFragment extends Fragment {

    public PestsAndDiseaseFragment() {
        // Required empty public constructor
    }
    public static PestsAndDiseaseFragment newInstance() {
        return new PestsAndDiseaseFragment();
    }

   // Optionally pass data to the fragment using newInstance pattern
    public static PestsAndDiseaseFragment newInstance(String pestName) {
        Bundle args = new Bundle();
        args.putString("PEST_NAME", pestName);
        PestsAndDiseaseFragment fragment = new PestsAndDiseaseFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pests_and_disease, container, false);

        // pestsCard1
        View pestsCard1 = view.findViewById(R.id.pestsCard1); // Ensure you have a view with this ID in your layout
        pestsCard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._crop, // Replace with your actual drawable resource
                        "Example Title",
                        "This is an example description."
                );
                openPostFragment(postFragment);
            }
        });

        // pestsCard2
        View pestsCard2 = view.findViewById(R.id.pestsCard2); // Ensure you have a view with this ID in your layout
        pestsCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._crop, // Replace with your actual drawable resource
                        "Example Title",
                        "This is an example description."
                );
                openPostFragment(postFragment);
            }
        });
        // pestsCard3
        View pestsCard3 = view.findViewById(R.id.pestsCard3); // Ensure you have a view with this ID in your layout
        pestsCard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._crop, // Replace with your actual drawable resource
                        "Example Title",
                        "This is an example description."
                );
                openPostFragment(postFragment);
            }
        });
        // pestsCard4
        View pestsCard4 = view.findViewById(R.id.pestsCard4); // Ensure you have a view with this ID in your layout
        pestsCard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._crop, // Replace with your actual drawable resource
                        "Example Title",
                        "This is an example description."
                );
                openPostFragment(postFragment);
            }
        });
        // pestsCard5
        View pestsCard5 = view.findViewById(R.id.pestsCard5); // Ensure you have a view with this ID in your layout
        pestsCard5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._crop, // Replace with your actual drawable resource
                        "Example Title",
                        "This is an example description."
                );
                openPostFragment(postFragment);
            }
        });
        // pestsCard6
        View pestsCard6 = view.findViewById(R.id.pestsCard6); // Ensure you have a view with this ID in your layout
        pestsCard6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._crop, // Replace with your actual drawable resource
                        "Example Title",
                        "This is an example description."
                );
                openPostFragment(postFragment);
            }
        });
        // pestsCard7
        View pestsCard7 = view.findViewById(R.id.pestsCard7); // Ensure you have a view with this ID in your layout
        pestsCard7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._crop, // Replace with your actual drawable resource
                        "Example Title",
                        "This is an example description."
                );
                openPostFragment(postFragment);
            }
        });
        // pestsCard8
        View pestsCard8 = view.findViewById(R.id.pestsCard8); // Ensure you have a view with this ID in your layout
        pestsCard8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._crop, // Replace with your actual drawable resource
                        "Example Title",
                        "This is an example description."
                );
                openPostFragment(postFragment);
            }
        });

        return view;


    }

    // Rest of your fragment code...
    private void openPostFragment(PostFragment postFragment) {


        if (getFragmentManager() != null) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.fragment_pests_and_disease, postFragment) // Ensure you use the correct container ID
                    .addToBackStack(null)
                    .commit();
        }
    }
}