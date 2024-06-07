package com.techview365.plantdiseasedetectionapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
                        LocalizationUtil.getLocalizedString(getContext(), R.string.AppleTitle),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.Apple_Description)

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
                        LocalizationUtil.getLocalizedString(getContext(), R.string.explore_title_banana),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.explore_description_banana)

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
                        LocalizationUtil.getLocalizedString(getContext(), R.string.explore_title_capsicum),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.explore_description_capsicum)
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
                        LocalizationUtil.getLocalizedString(getContext(), R.string.explore_title_cotton),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.explore_description_cotton)
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
                        LocalizationUtil.getLocalizedString(getContext(), R.string.explore_title_cowpea),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.explore_description_cowpea)
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
                        LocalizationUtil.getLocalizedString(getContext(), R.string.explore_title_cumin),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.explore_description_cumin)
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
                        LocalizationUtil.getLocalizedString(getContext(), R.string.explore_title_fenugreek),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.explore_description_fenugreek)
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
                        LocalizationUtil.getLocalizedString(getContext(), R.string.explore_title_ginger),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.explore_description_ginger)
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