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
        View pestsCard1 = view.findViewById(R.id.pestsCard1);
        pestsCard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._apple_scab,
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_apple_scab),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_apple_scab)
                );
                openPostFragment(postFragment);
            }
        });

        // pestsCard2
        View pestsCard2 = view.findViewById(R.id.pestsCard2);
        pestsCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._cedar_apple_rust,
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_cedar_apple_rust),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_cedar_apple_rust)
                );
                openPostFragment(postFragment);
            }
        });

        // pestsCard3
        View pestsCard3 = view.findViewById(R.id.pestsCard3);
        pestsCard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._downy_mildew,
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_downy_mildew),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_downy_mildew)
                );
                openPostFragment(postFragment);
            }
        });

        // pestsCard4
        View pestsCard4 = view.findViewById(R.id.pestsCard4);
        pestsCard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._fire_blight,
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_fire_blight),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_fire_blight)
                );
                openPostFragment(postFragment);
            }
        });

        // pestsCard5
        View pestsCard5 = view.findViewById(R.id.pestsCard5);
        pestsCard5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._powdery_mildew,
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_powdery_mildew),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_powdery_mildew)
                );
                openPostFragment(postFragment);
            }
        });

        // pestsCard6
        View pestsCard6 = view.findViewById(R.id.pestsCard6);
        pestsCard6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable.leaf_scorch,
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_leaf_scorch),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_leaf_scorch)
                );
                openPostFragment(postFragment);
            }
        });

        // pestsCard7
        View pestsCard7 = view.findViewById(R.id.pestsCard7);
        pestsCard7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._anthracnose,
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_strawberry_anthracnose),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_strawberry_anthracnose)
                );
                openPostFragment(postFragment);
            }
        });
        // pestsCard8
        View pestsCard8 = view.findViewById(R.id.pestsCard8);
        pestsCard8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._cercospora_leaf_spot,
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_cercospora_leaf_spot),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_cercospora_leaf_spot)
                );
                openPostFragment(postFragment);
            }
        });

// pestsCard9
        View pestsCard9 = view.findViewById(R.id.pestsCard9);
        pestsCard9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._corn_common_rust,
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_corn_common_rust),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_corn_common_rust)
                );
                openPostFragment(postFragment);
            }
        });

// pestsCard10
        View pestsCard10 = view.findViewById(R.id.pestsCard10);
        pestsCard10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._northern_leaf_blight,
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_northern_leaf_blight),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_northern_leaf_blight)
                );
                openPostFragment(postFragment);
            }
        });

// pestsCard11
        View pestsCard11 = view.findViewById(R.id.pestsCard11);
        pestsCard11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._grape_black_rot,
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_grape_black_rot),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_grape_black_rot)
                );
                openPostFragment(postFragment);
            }
        });

// pestsCard12
        View pestsCard12 = view.findViewById(R.id.pestsCard12);
        pestsCard12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._esca,
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_esca),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_esca)
                );
                openPostFragment(postFragment);
            }
        });

// pestsCard13
        View pestsCard13 = view.findViewById(R.id.pestsCard13);
        pestsCard13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._leaf_blight_grape,
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_leaf_blight_grape),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_leaf_blight_grape)
                );
                openPostFragment(postFragment);
            }
        });

// pestsCard14
        View pestsCard14 = view.findViewById(R.id.pestsCard14);
        pestsCard14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._huanglongbing_orange,
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_huanglongbing_orange),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_huanglongbing_orange)
                );
                openPostFragment(postFragment);
            }
        });

// pestsCard15
        View pestsCard15 = view.findViewById(R.id.pestsCard15);
        pestsCard15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._peach_bacterial_spot,
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_peach_bacterial_spot),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_peach_bacterial_spot)
                );
                openPostFragment(postFragment);
            }
        });

// pestsCard16
        View pestsCard16 = view.findViewById(R.id.pestsCard16);
        pestsCard16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._bell_bacerial_spot,
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_bell_bacterial_spot),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_bell_bacterial_spot)
                );
                openPostFragment(postFragment);
            }
        });

// pestsCard17
        View pestsCard17 = view.findViewById(R.id.pestsCard17);
        pestsCard17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._potato_early_blight,
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_potato_early_blight),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_potato_early_blight)
                );
                openPostFragment(postFragment);
            }
        });

// pestsCard18
        View pestsCard18 = view.findViewById(R.id.pestsCard18);
        pestsCard18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._potato_late_blight,
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_potato_late_blight),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_potato_late_blight)
                );
                openPostFragment(postFragment);
            }
        });

// pestsCard19
        View pestsCard19 = view.findViewById(R.id.pestsCard19);
        pestsCard19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._tomato_leaf_mold,
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_tomato_leaf_mold),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_tomato_leaf_mold)
                );
                openPostFragment(postFragment);
            }
        });

// pestsCard20
        View pestsCard20 = view.findViewById(R.id.pestsCard20);
        pestsCard20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._septoria_leaf_spot,
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_septoria_leaf_spot),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_septoria_leaf_spot)
                );
                openPostFragment(postFragment);
            }
        });

// pestsCard21
        View pestsCard21 = view.findViewById(R.id.pestsCard21);
        pestsCard21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._tomato_target_spot,
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_tomato_target_spot),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_tomato_target_spot)
                );
                openPostFragment(postFragment);
            }
        });

// pestsCard22
        View pestsCard22 = view.findViewById(R.id.pestsCard22);
        pestsCard22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostFragment postFragment = PostFragment.newInstance(
                        R.drawable._tomato_mosaic_virus,
                        LocalizationUtil.getLocalizedString(getContext(), R.string.title_tomato_mosaic_virus),
                        LocalizationUtil.getLocalizedString(getContext(), R.string.desc_tomato_mosaic_virus)
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