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
                        R.drawable._apple_scab, // Replace with your actual drawable resource
                        "Apple Scab",
                        "Symptoms:\n" +
                                "Apple scab presents as dark, olive-green to black lesions on the leaves, fruits, and stems of infected plants. These lesions often have a velvety texture. As the disease progresses, the infected leaves may turn yellow and eventually drop prematurely. Fruits may also become distorted or deformed due to scab lesions.\n" +
                                "\n" +
                                "Also Found in:\n" +
                                "Aside from apple trees, apple scab can also affect other members of the Rosaceae family, including crabapple and pear trees.\n" +
                                "Scientific Name: Venturia inaequalis.\n" +
                                "Preventive Measures:\n" +
                                "1. Plant Resistant Varieties: Choose apple cultivars that are resistant to apple scab. Many modern apple varieties have been bred for resistance to this disease.\n" +
                                "2. Maintain Good Air Circulation: Prune apple trees regularly to ensure good air circulation through the canopy. This helps to reduce humidity levels and minimize conditions favorable for fungal growth.\n" +
                                "3. Avoid Overhead Irrigation: Water apple trees at the base rather than using overhead irrigation methods, which can create conditions conducive to fungal growth by keeping foliage wet.\n" +
                                "4. Remove and Destroy Infected Debris: Practice good sanitation by removing and destroying fallen leaves and infected fruits promptly. This reduces the source of fungal spores for future infections.\n" +
                                "5. Apply Fungicides Preventively: In orchards or gardens where apple scab is a recurring problem, apply fungicides preventively according to the recommended schedule. Fungicides containing active ingredients such as captan, mancozeb, or sulfur can help control apple scab.\n" +
                                "\n" +
                                "What Causes it:\n" +
                                "Apple scab is primarily caused by the fungus Venturia inaequalis. This fungus overwinters in fallen leaves and infected plant debris left on the ground from the previous growing season. In spring, as temperatures rise and humidity increases, the fungus produces spores, which are then spread by wind and rain to infect new growth on apple trees. The spores can land on leaves, fruits, and stems, where they germinate and penetrate the plant tissue, leading to the formation of characteristic scab lesions. Warm, humid weather conditions favor the development and spread of apple scab, making it a common problem in regions with mild, wet springs and summers."
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
                        R.drawable._cedar_apple_rust, // Replace with your actual drawable resource
                        "Cedar Apple Rust",
                        "Symptoms\n" +
                                "Cedar apple rust presents with bright orange to yellow spots or lesions on the leaves of apple trees. These lesions are often accompanied by small, spore-producing structures called telia. On infected fruits, circular lesions may form, eventually leading to premature fruit drop. The disease can cause significant cosmetic damage to fruits and reduce yield.\n" +
                                "Also found in: \n" +
                                "In addition to apple trees, cedar apple rust affects cedar and other juniper species. It can also impact other apple relatives such as crabapple trees.\n" +
                                "Scientific name: Gymnosporangium juniper-virginianae\n" +
                                "Preventive Measures\n" +
                                "    1. Remove Nearby Cedar Trees: If possible, remove cedar trees in the vicinity of apple orchards or gardens to reduce the source of cedar apple rust spores. This can significantly decrease the likelihood of infection.\n" +
                                "    2. Plant Resistant Apple Varieties: Select apple cultivars that exhibit resistance or tolerance to cedar apple rust. While no apple tree is entirely immune, some varieties show greater resistance to the disease.\n" +
                                "    3. Apply Fungicides Preventively: Apply fungicides containing active ingredients such as myclobutanil or thiophanate-methyl preventively during the appropriate times of the growing season. This can help suppress cedar apple rust infections and reduce the severity of symptoms.\n" +
                                "    4. Prune to Improve Air Circulation: Prune apple trees to improve air circulation within the canopy, as this can help reduce humidity levels and create an environment less conducive to fungal growth and spread.\n" +
                                "\n" +
                                "What caused it?\n" +
                                "Cedar apple rust is caused by the fungus Gymnosporangium juniperi-virginianae. This fungus has a complex life cycle that involves two primary hosts: apple trees (or other members of the Rosaceae family) and cedar (juniper) trees. The disease typically begins on cedar trees, where fungal spores called teliospores develop in small, gelatinous structures known as cedar galls. During wet weather conditions in the spring, these teliospores are released and carried by wind to nearby apple trees. When the spores land on apple leaves, they germinate and infect the foliage, leading to the development of characteristic orange to yellow spots and lesions. Over time, additional spores are produced on the apple leaves, completing the fungal life cycle. The disease cycle continues as spores are released from infected apple leaves and carried back to cedar trees, where they reinfect the cedar host and initiate the formation of new cedar galls, thus perpetuating the cycle of infection. Effective management of cedar apple rust often involves disrupting this complex life cycle by implementing preventive measures such as removing nearby cedar trees and applying fungicides to apple trees as needed."
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
                        R.drawable._downy_mildew, // Replace with your actual drawable resource
                        "Downy Mildew",
                        "Symptoms:\n" +
                                "Downy mildew in grapes appears as yellow or pale green spots on the upper surface of leaves, accompanied by a whitish-gray fungal growth on the underside. Infected leaves may curl or twist, and severe infections can lead to defoliation. Lesions may also develop on grape clusters, causing fruit rot and reduced yield.\n" +
                                "\n" +
                                "Also Found in:\n" +
                                "Downy mildew affects various members of the Vitaceae family, including grapevines and some ornamental vines.\n" +
                                ".\n" +
                                "Scientific Name: Plasmopara viticola\n" +
                                "\n" +
                                "Preventive Measures:\n" +
                                "    1. Site Selection: Choose well-drained planting sites with good air circulation to reduce humidity and minimize conditions favorable for downy mildew development.\n" +
                                "    2. Pruning: Proper pruning practices to open up the canopy can improve air circulation and sunlight penetration, reducing humidity levels and inhibiting fungal growth.\n" +
                                "    3. Apply Fungicides: Regular application of fungicides containing active ingredients such as copper compounds or systemic fungicides can help prevent downy mildew infections. Apply according to recommended schedules and follow label instructions.\n" +
                                "    4. Remove Infected Plant Material: Remove and destroy infected leaves, shoots, and clusters promptly to reduce the inoculum of the fungus within the vineyard.\n" +
                                "    5. Practice Good Sanitation: Maintain cleanliness within the vineyard by removing fallen leaves and debris, as they can harbor fungal spores and serve as a source of infection.\n" +
                                "\n" +
                                "Causes:\n" +
                                "Downy mildew in grapes is caused by the oomycete fungus Plasmopara viticola. The fungus overwinters in infected plant material and soil, becoming active during warm and humid conditions. Spores are spread through wind, rain splash, and contact with infected plant material. Infections occur through wounds or natural openings in the plant tissue, such as stomata. "
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
                        R.drawable._fire_blight, // Replace with your actual drawable resource
                        "Fire Blight",
                        "Symptoms:\n" +
                                "Fire blight manifests primarily in the form of wilting, blackened leaves on infected branches, giving the appearance of scorched or burnt foliage. The affected leaves often remain attached to the tree, creating a striking visual contrast with healthy foliage. Additionally, infected blossoms typically turn brown and may exhibit bacterial ooze, emitting a foul odor.\n" +
                                "\n" +
                                "Also Found in:\n" +
                                "Fire blight affects various plants in the Rosaceae family, including pear, quince, and other ornamental and fruit-bearing trees and shrubs.\n" +
                                "Scientific Name: Erwinia amylovora.\n" +
                                "Preventive Measures:\n" +
                                "1. Choose Resistant Varieties: Opt for apple and pear cultivars that exhibit resistance to fire blight. While no plant is entirely immune, some varieties show greater tolerance to the disease.\n" +
                                "2. Prune Affected Branches: Prune affected branches promptly during dry weather conditions. Cut at least 8 to 12 inches below visible symptoms, sterilizing pruning tools between cuts to prevent further spread of the bacteria.\n" +
                                "3. Avoid Excessive Nitrogen Fertilization: Limit nitrogen fertilization, as excessive nitrogen can promote lush, succulent growth that is more susceptible to fire blight infection. Instead, focus on balanced fertilization to promote overall plant health.\n" +
                                "4. Apply Copper-based Sprays: Apply copper-based bactericides in early spring before bud break to reduce bacterial populations on the tree surfaces. These sprays can help suppress the spread of fire blight during periods conducive to bacterial activity."
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
                        R.drawable._powdery_mildew, // Replace with your actual drawable resource
                        "Powdery Mildew",
                        "Symptoms\n" +
                                "Powdery mildew is characterized by the development of a powdery white coating on the surfaces of infected leaves. This fungal growth can distort leaf growth, causing leaves to become misshapen or curled. In severe cases, infected leaves may prematurely drop from the plant. Additionally, some fruit-bearing plants may develop powdery growth on their fruits, which can affect their appearance and quality.\n" +
                                "\n" +
                                "Also found in: \n" +
                                "Powdery mildew affects a wide range of ornamental and fruit-bearing plants, including roses, cucumbers, squash, and various other members of the plant kingdom.\n" +
                                "Scientific name: Podosphaera leocotricha\n" +
                                "Preventive Measures\n" +
                                "    1. Choose Resistant Varieties: When possible, select plant varieties that exhibit resistance or tolerance to powdery mildew. Plant breeding efforts have produced cultivars with genetic traits that make them less susceptible to infection.\n" +
                                "    2. Provide Adequate Spacing: Ensure proper spacing between plants to promote air circulation and reduce humidity levels around foliage. Crowded plants are more susceptible to powdery mildew due to restricted airflow.\n" +
                                "    3. Prune to Improve Light Penetration: Regular pruning helps open up the plant canopy, allowing more sunlight to penetrate through and reach the lower foliage. This can create less favorable conditions for powdery mildew development, as the fungus prefers shady, humid environments.\n" +
                                "    4. Avoid Overhead Irrigation: Water plants at the base rather than using overhead irrigation methods, as wet foliage provides an ideal environment for powdery mildew spores to germinate and spread. Drip irrigation or soaker hoses are preferable.\n" +
                                "    5. Apply Fungicides Preventively: In situations where powdery mildew is a recurrent problem, apply fungicides preventively according to the recommended schedule. Fungicides containing active ingredients such as sulfur, neem oil, potassium bicarbonate, or horticultural oils can help suppress powdery mildew development.\n" +
                                "What caused it?\n" +
                                "Powdery mildew is caused by various fungi belonging to the order Erysiphales. These fungi thrive in warm, dry conditions with high humidity levels. Unlike many other fungal pathogens, powdery mildew does not require free water on the leaf surface to infect plants. Instead, it can germinate and spread solely through airborne spores, making it particularly adept at colonizing plant surfaces under conditions of moderate humidity. Overwintering structures of powdery mildew fungi can persist on infected plant debris, serving as a source"
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
                        R.drawable._root_and_foot_rot, // Replace with your actual drawable resource
                        "Root and Foot Rot(Fungus)",
                        "Symptoms:\n" +
                                "    • Brown areas at the base of the stem and roots,\n" +
                                "    • Elongated, brown-black spots on lower leaves.\n" +
                                "    • Premature bleaching of spikelets or entire head.\n" +
                                "    • Yellow colored and stunted plants.\n" +
                                "Symptoms will depend on the environmental conditions and the plant growth stage. In some cases, contaminated seeds can give rise to seedling blight, which is characterized by the appearance of dark brown areas on young plants. Early infection of mature plants may not produce symptoms, except for a decrease in leaf area and number of tillers. However, dark-brown areas may be present at the base of the stem (foot rot) or below ground, and on internodes and roots (root rot). Later on, as the pathogen progresses into the stem, elongated, brown-black spots appear on lower leaves. This is particularly evident during prolonged periods of rain. Diseased plants occur randomly or in irregular patches, and are stunted and often chlorotic. A common symptom of late infections is the premature bleaching of one or more spikelets or the entire head (head blight)."
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
                        R.drawable._wheat_leaf_rust, // Replace with your actual drawable resource
                        "Wheat Leaf Rust (fungus):",
                        "\n" +
                                "    • Small orange to brown pustules on leaves.\n" +
                                "    • Pustules surrounded by yellow margin.\n" +
                                "    • Leaf sheaths can also be affected.\n" +
                                "\n" +
                                "Leaf rust is the most common rust disease of wheat. The symptoms depend on the susceptibility of the plant affected. It is characterized by numerous small reddish orange to brown pustules scattered on both surfaces of leaves, leaf sheaths and husks. They are up to 1.5 mm in diameter, slightly raised and round to oblong. In vulnerable plants, tiny secondary pimples and a pale green or yellow halo can appear around the primary pustules. Over time, the color turns to dark brown or black. In more resistant wheat varieties, the orange pustule are usually smaller and they might be surrounded by chlorotic or necrotic areas. The infection causes damage to plant tissues, water loss, and reduced productivity. These symptoms, added to reduced floral set and grain shriveling, compromise the yield."
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
                        R.drawable._wheat_stem_rust, // Replace with your actual drawable resource
                        "Wheat Stem Rust ",
                        "Symptoms:\n" +
                                "    • Reddish, oval and powdery pustules appear on stems, leaf sheaths and occasionally on leaves.\n" +
                                "    • The pustules grow and coalesce to cover large areas, giving the plant epidermis a rough appearance\n" +
                                "    • Stems can be weakened and plants fall over in heavy winds and rain.\n" +
                                "    • Weakened plants are prone to infections by other pathogens.\n" +
                                "    • Yield losses can be serious if the disease becomes servere before the grain is completely filled.\n" +
                                "\n" +
                                "The first symptoms occur 7 to 15 days after infection. Reddish-brown, oval to elongated pustules break out of sterns, leaf sheaths, leaves and occasionally on inflorescences. Sterns and leaf sheaths are mainly affected. The powdery pustules grow and often coalesce to cover large areas. The resulting damage to the plant epidermis gives the affected parts a rough appearance. If the infection is severe, stems can be weakened and plants buckle or fall over in heavy winds and rain. The fungus hinders water and nutrient transport and causes water loss, reduced plant vigor and reduced nutrient transport to the grain. The grains are shriveled, resulting in reduced yield. The whole plant is weakened, making the risk of an infection with other pathogens high. Yield losses can be serious if the disease is well developed before the grain is completely filled."
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