package com.techview365.plantdiseasedetectionapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


public class CommunityFragment extends Fragment {


    public CommunityFragment() {
        // Required empty public constructor
    }
    public static CommunityFragment newInstance() {
        return new CommunityFragment();
    }

    public static CommunityFragment newInstance(String communityName) {
        Bundle args = new Bundle();
        args.putString("ComunityName", communityName);
        CommunityFragment fragment = new CommunityFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_community, container, false);
        //post_content1
        View post_content1 = view.findViewById(R.id.post_content1);
        post_content1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._crop, // Replace with your actual drawable resource
                        LocalizationUtil.getLocalizedString(getContext(), R.string.community_title_1),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.community_description_1)
                );
                openPostFragment(postFragment);
            }
        });

        //post_content2
        View post_content2 = view.findViewById(R.id.post_content2);
        post_content2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._crop_growing, // Replace with your actual drawable resource
                        LocalizationUtil.getLocalizedString(getContext(), R.string.community_title_2),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.community_description_2)
                );
                openPostFragment(postFragment);
            }
        });

        //post_content3
        View post_content3 = view.findViewById(R.id.post_content3);
        post_content3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._crop_production_and_management, // Replace with your actual drawable resource
                        LocalizationUtil.getLocalizedString(getContext(), R.string.community_title_3),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.community_description_3)
                );
                openPostFragment(postFragment);
            }
        });

        //post_content4
        View post_content4 = view.findViewById(R.id.post_content4);
        post_content4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._most_profitable_crops_in_india, // Replace with your actual drawable resource
                        LocalizationUtil.getLocalizedString(getContext(), R.string.community_title_4),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.community_description_4)
                );
                openPostFragment(postFragment);
            }
        });

        //post_content5
        View post_content5 = view.findViewById(R.id.post_content5);
        post_content5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._weather_forecasts_for_agriculture, // Replace with your actual drawable resource
                        LocalizationUtil.getLocalizedString(getContext(), R.string.community_title_5),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.community_description_5)
                );
                openPostFragment(postFragment);
            }
        });
        // Inflate the layout for this fragment
        return view;
    }
    private void openPostFragment(PostFragment postFragment) {


        if (getFragmentManager() != null) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.fragment_community, postFragment) // Ensure you use the correct container ID
                    .addToBackStack(null)
                    .commit();
        }
    }
}