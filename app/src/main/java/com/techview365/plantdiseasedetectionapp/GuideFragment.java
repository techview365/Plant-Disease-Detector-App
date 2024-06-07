package com.techview365.plantdiseasedetectionapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GuideFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GuideFragment extends Fragment {
    public GuideFragment() {
        // Required empty public constructor
    }
    public static GuideFragment newInstance() {
        return new GuideFragment();
    }

    // Optionally pass data to the fragment using newInstance pattern
    public static GuideFragment newInstance(String guideName) {
        Bundle args = new Bundle();
        args.putString("GUIDE_NAME", guideName);
        GuideFragment fragment = new GuideFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_guide, container, false);

        // Assuming you have a button or any clickable view in your fragment_guide.xml
        // For demonstration, let's assume its ID is guideCard
        // guideCard1
        View guideCard = view.findViewById(R.id.guideCard1); // Ensure you have a view with this ID in your layout
        guideCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._watering_guide, // Replace with your actual drawable resource
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_watering_guide),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_watering_guide)
                );
                openPostFragment(postFragment);
            }
        });

        // guideCard2
        View guideCard2 = view.findViewById(R.id.guideCard2); // Ensure you have a view with this ID in your layout
        guideCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._sunlight_guide, // Replace with your actual drawable resource
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_sunlight_guide),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_sunlight_guide)
                );
                openPostFragment(postFragment);
            }
        });
        // guideCard3
        View guideCard3 = view.findViewById(R.id.guideCard3); // Ensure you have a view with this ID in your layout
        guideCard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._fertilizing_guide, // Replace with your actual drawable resource
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_fertilizing_guide),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_fertilizing_guide)
                );
                openPostFragment(postFragment);
            }
        });
        // guideCard4
        View guideCard4 = view.findViewById(R.id.guideCard4); // Ensure you have a view with this ID in your layout
        guideCard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._soil_guide, // Replace with your actual drawable resource
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_soil_guide),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_soil_guide)
                );
                openPostFragment(postFragment);
            }
        });
        // guideCard5
        View guideCard5 = view.findViewById(R.id.guideCard5); // Ensure you have a view with this ID in your layout
        guideCard5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._pest_guide, // Replace with your actual drawable resource
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_pest_guide),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_pest_guide)
                );
                openPostFragment(postFragment);
            }
        });
        // guideCard6
        View guideCard6 = view.findViewById(R.id.guideCard6); // Ensure you have a view with this ID in your layout
        guideCard6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._humidity_guide, // Replace with your actual drawable resource
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_humidity_guide),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_humidity_guide)
                );
                openPostFragment(postFragment);
            }
        });
        // guideCard7
        View guideCard7 = view.findViewById(R.id.guideCard7); // Ensure you have a view with this ID in your layout
        guideCard7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._harvesting_guide, // Replace with your actual drawable resource
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_harvesting_guide),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_harvesting_guide)
                );
                openPostFragment(postFragment);
            }
        });
        // guideCard8
        View guideCard8 = view.findViewById(R.id.guideCard8); // Ensure you have a view with this ID in your layout
        guideCard8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._pruning_guide, // Replace with your actual drawable resource
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_pruning_guide),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_pruning_guide)
                );
                openPostFragment(postFragment);
            }
        });

        return view;
    }

    private void openPostFragment(PostFragment postFragment) {


        if (getFragmentManager() != null) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.fragment_guide, postFragment) // Ensure you use the correct container ID
                    .addToBackStack(null)
                    .commit();
        }
    }

    // Rest of your fragment code...
}
