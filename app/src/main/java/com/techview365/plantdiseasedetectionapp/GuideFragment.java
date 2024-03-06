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
                        "WATER GUIDE\n",
                        "1. Understand the water needs: Different plants and crops have varying water requirements...\n\n" +
                                "2. Check the soil moisture:  Before watering, check the moisture level of the soil...\n\n" +
                                "3. Water deeply: When you do water, make sure to water deeply and thoroughly. This encourages the roots to grow deeper and helps plants withstand dry periods.\n\n" +
                                "4. Time of day: Water plants in the early morning or late afternoon when temperatures are cooler. This reduces water loss due to evaporation.\n\n" +
                                "5. Avoid overwatering: Overwatering can lead to root rot and other issues. Make sure not to water too frequently or excessively.\n\n" +
                                "6. Consider the weather: Adjust your watering schedule based on the weather conditions. If it has rained recently or if it's a humid day, you may not need to water as much."
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
                        "Sunlight guide",
                        "\n" +
                                "1. Know the sunlight requirements: Different plants have different sunlight needs. Some thrive in full sun, while others prefer partial shade. Research the specific sunlight requirements of the plants you are growing.\n\n" +
                                "2. Observe the sunlight patterns: Observe how the sunlight moves across your garden or growing area throughout the day. Take note of areas that receive direct sunlight, partial shade, or full shade.\n\n" +
                                "3. Place plants strategically: Based on the sunlight patterns, place your plants in areas that match their sunlight requirements. Position sun-loving plants where they can receive maximum sunlight, while shade-loving plants should be placed in areas with partial shade or full shade.\n\n" +
                                "4. Morning sun vs. afternoon sun: Morning sunlight is generally less intense than afternoon sunlight. If you live in a hot climate, consider providing some shade or protection during the hottest part of the day to prevent sunburn on sensitive plants.\n\n" +
                                "5. Monitor plant response: Pay attention to how your plants respond to the sunlight they receive. If they appear to be wilting, scorched, or not growing properly, it could be a sign that they are not getting the right amount or intensity of sunlight.\n\n" +
                                "6. Adjust as needed: If you notice any issues with your plants' growth or health, consider adjusting their placement to provide more or less sunlight as required."
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
                        "Fertilizing guide\n",
                        "1. Understand your plants' needs: Different plants have different nutrient requirements. Research the specific fertilizing needs of the plants you are growing.\n\n" +
                                "2. Choose the right fertilizer: Select a fertilizer that matches the nutrient needs of your plants. There are different types of fertilizers available, such as organic and synthetic options. Follow the instructions on the fertilizer packaging for proper usage.\n\n" +
                                "3. Timing is important: Fertilize your plants at the right time. In general, it's best to fertilize during the growing season when plants are actively growing and can benefit from the nutrients.\n\n" +
                                "4. Follow the recommended dosage: Use the recommended dosage of fertilizer as specified on the packaging. Over-fertilizing can harm your plants, so it's important to follow the instructions carefully.\n\n" +
                                "5. Apply evenly: Distribute the fertilizer evenly around the base of the plants. Avoid getting the fertilizer directly on the leaves or stems, as it may cause damage.\n\n" +
                                "6. Water after fertilizing: After applying the fertilizer, water your plants thoroughly. This helps to dissolve and distribute the nutrients into the soil, making them more accessible to the roots.\n\n" +
                                "7. Monitor plant response: Keep an eye on how your plants respond to fertilization. If they show signs of nutrient deficiencies or excesses, adjust the fertilizing schedule or dosage accordingly.\n\n" +
                                "Here are examples of organic and synthetic fertilizers:\n\n" +
                                "1. Organic fertilizer: \n\n" +
                                "- Compost: Made from decomposed organic matter like kitchen scraps, leaves, and grass clippings. It enriches the soil with nutrients and improves its structure.\n\n" +
                                "- Manure: Animal waste, such as cow or chicken manure, is rich in nutrients and can be used as a natural fertilizer.\n\n" +
                                "- Bone meal: Ground-up animal bones provide phosphorus and calcium to promote root development and overall plant growth.\n\n" +
                                "\n\n" +
                                "2. Synthetic fertilizer:\n\n" +
                                "- Nitrogen-based fertilizer: Examples include ammonium nitrate or urea. These fertilizers provide a quick boost of nitrogen, which is essential for leafy green growth.\n\n" +
                                "- Phosphorus-based fertilizer: Phosphorus helps with root development and flower production. Examples include superphosphate or triple superphosphate.\n\n" +
                                "- Potassium-based fertilizer: Potassium promotes overall plant health and disease resistance. Examples include potassium chloride or potassium sulfate.\n\n" +
                                "\n\n" +
                                "Remember to use these fertilizers according to the instructions provided on their packaging and consider the specific needs of your plants. Happy gardening!"
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
                        R.drawable._soil_guide
                        , // Replace with your actual drawable resource
                        "Soil guide\n",
                        "1. Soil type: Different plants have different soil preferences. Some prefer well-draining soil, while others thrive in clay or sandy soil. Research the specific soil requirements for the plants you want to grow.\n\n" +
                                "2. pH level: Soil pH affects nutrient availability to plants. Most plants prefer a slightly acidic to neutral pH range of 6.0 to 7.0. Test your soil's pH and adjust it if needed using amendments like lime or sulfur.\n\n" +
                                "3. Organic matter: Adding organic matter, such as compost or well-rotted manure, improves soil structure, fertility, and water-holding capacity. It also enhances beneficial microbial activity.\n\n" +
                                "4. Nutrient balance: Ensure your soil has a balanced supply of essential nutrients like nitrogen, phosphorus, and potassium (NPK). Conduct a soil test to determine nutrient deficiencies and amend accordingly.\n\n" +
                                "5. Drainage: Good drainage is crucial for healthy plant growth. Avoid waterlogged soil, as it can lead to root rot. If your soil retains too much water, consider adding organic matter or using raised beds.\n\n" +
                                "6. Mulching: Apply a layer of organic mulch, such as straw or wood chips, around plants to conserve moisture, suppress weeds, and regulate soil temperature.\n\n" +
                                "7. Crop rotation: Rotate crops each season to prevent the buildup of pests and diseases in the soil. This practice also helps maintain nutrient balance and soil health.\n\n" +
                                "8. Watering: Water plants deeply and infrequently, allowing the soil to dry slightly between waterings. This encourages deeper root growth and reduces the risk of overwatering.\n\n" +
                                "Remember, soil requirements can vary depending on the specific plants and crops you are growing.. Happy gardening!"
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
                        "Pest guide\n",
                        "1. Identify pests: Learn to identify common pests that can affect your plants, such as aphids, caterpillars, snails, or fungal diseases like powdery mildew.\n\n" +
                                "2. Regular inspection: Regularly inspect your plants for signs of pest damage, including chewed leaves, wilting, discoloration, or the presence of pests themselves.\n\n" +
                                "3. Natural predators: Encourage beneficial insects like ladybugs, lacewings, or birds that feed on pests. Planting flowers or herbs that attract these predators can help control pest populations.\n\n" +
                                "4. Companion planting: Some plants naturally repel pests or attract beneficial insects. For example, marigolds can deter aphids, and planting basil near tomatoes can help repel tomato hornworms.\n\n" +
                                "5. Physical barriers: Use physical barriers like netting or row covers to protect plants from pests like birds, rabbits, or larger insects.\n\n" +
                                "6. Organic sprays: If pest populations become problematic, consider using organic sprays like neem oil or insecticidal soap. Follow the instructions carefully and avoid spraying during hot or sunny periods.\n\n" +
                                "7. Crop rotation: Rotate crops each season to disrupt pest life cycles and reduce the risk of pest buildup in the soil.\n\n" +
                                "8. Proper sanitation: Remove and destroy any infected or infested plant material to prevent the spread of pests or diseases. Clean gardening tools regularly to avoid cross-contamination.\n\n" +
                                "9. Water and fertilize properly: Avoid overwatering or over-fertilizing, as this can attract pests. Proper watering and fertilization practices promote healthy plant growth, making them less susceptible to pests.\n\n" +
                                "10. Early intervention: Act promptly at the first sign of pest damage. The earlier you address the issue, the easier it is to control and minimize the damage.\n\n" +
                                "Remember, pest control methods can vary depending on the specific pests and plants you are dealing with. Happy gardening and pest-free crops!"
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
                        "Humidity guide",
                        "1. Understand optimal humidity levels: Different plants have varying humidity preferences. Research the ideal humidity range for your specific plants or crops.\n\n" +
                                "2. Monitor humidity levels: Use a hygrometer or a digital humidity monitor to keep track of the humidity in your growing area.\n\n" +
                                "3. Increase humidity: If the humidity is too low for your plants, you can increase it by using methods like misting the leaves with water, placing a tray of water near the plants, or using a humidifier.\n\n" +
                                "4. Decrease humidity: If the humidity is too high and causing issues like fungal diseases, you can decrease it by improving air circulation, using fans, or using a dehumidifier.\n\n" +
                                "5. Proper watering: Overwatering can lead to high humidity levels, so make sure to water your plants appropriately based on their needs. Avoid letting water sit in trays or pots for extended periods.\n\n" +
                                "6. Mulching: Applying a layer of organic mulch around the base of your plants can help regulate soil moisture and prevent excessive evaporation, which can affect humidity levels.\n\n" +
                                "7. Ventilation: Ensure proper ventilation in your growing area to prevent stagnant air and promote air movement, which can help regulate humidity levels.\n\n" +
                                "8. Time of day: Humidity levels tend to be higher during the night and early morning. Avoid watering your plants during these times to prevent excessive moisture buildup.\n\n" +
                                "9. Location considerations: Consider the natural humidity levels in your region when selecting plants for your garden. Choose varieties that are well-suited to your local climate.\n\n" +
                                "10. Regular monitoring: Continuously monitor the humidity levels and make adjustments as needed based on the specific requirements of your plants.\n\n" +
                                "Remember, maintaining proper humidity levels is crucial for the overall health and growth of your plants. By providing the right humidity conditions, you can help prevent issues like wilting, fungal diseases, or stress-related problems. Happy growing! \uD83C\uDF31\uD83C\uDF3F"
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
                        "Harvesting guide\n",
                        "1. Check for maturity: Determine the appropriate time for harvesting by checking for signs of maturity specific to each plant or crop. Look for factors like color, size, texture, and ripeness.\n\n" +
                                "2. Harvest in the morning: For most plants, it's best to harvest in the morning when the temperatures are cooler. This helps preserve the flavor, texture, and nutritional value of the produce.\n\n" +
                                "3. Use the right tools: Use appropriate tools like pruning shears, scissors, or a sharp knife to harvest your plants. Make clean cuts to minimize damage to the plant.\n\n" +
                                "4. Handle with care: Handle harvested produce gently to avoid bruising or damaging the plants. This helps maintain the quality and appearance of the crops.\n\n" +
                                "5. Remove any damaged or diseased parts: Inspect the harvested produce and remove any damaged, diseased, or rotten parts. This helps prevent the spread of diseases and ensures better quality.\n\n" +
                                "6. Sort and clean: Sort the harvested crops based on size, color, or any other relevant criteria. Clean them gently to remove any dirt, debris, or pests.\n\n" +
                                "7. Proper storage: Store the harvested crops in appropriate conditions to maintain their freshness and quality. Some crops require refrigeration, while others can be stored at room temperature. Follow specific storage recommendations for each type of plant or crop.\n\n" +
                                "8. Label and organize: If you're harvesting multiple types of plants or crops, label and organize them properly to avoid confusion. This makes it easier to use or sell them later.\n\n" +
                                "9. Enjoy the fruits of your labor: Once harvested, savor the delicious flavors and nutritious benefits of your homegrown produce. Share them with friends and family or use them in your favorite recipes.\n\n" +
                                "Remember, the timing and techniques for harvesting can vary depending on the specific plant or crop you're growing. It's always a good idea to research and understand the requirements of each plant to ensure a successful harvest. Happy harvesting!"
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
                        "Pruning guide\n",
                        "1. Assess the plant: Before pruning, assess the overall health and shape of the plant. Identify any dead, damaged, or diseased branches or stems that need to be removed.\n\n" +
                                "2. Choose the right time: Prune plants during their dormant season, typically in late winter or early spring before new growth begins. However, some plants may have specific pruning requirements, so it's essential to research the specific plant you're working with.\n\n" +
                                "3. Use the proper tools: Use clean and sharp pruning tools, such as pruning shears, loppers, or a pruning saw, depending on the size of the branches or stems you're cutting. This ensures clean cuts and minimizes damage to the plant.\n\n" +
                                "4. Remove dead or diseased branches: Start by removing any dead, damaged, or diseased branches. Cut them back to healthy tissue or to the main stem, making sure to sterilize your tools between cuts to prevent the spread of diseases.\n\n" +
                                "5. Thin out overcrowded growth: Identify branches that are crossing, rubbing against each other, or overcrowding the plant's canopy. Carefully remove these branches to improve air circulation and allow more light to reach the inner parts of the plant.\n\n" +
                                "6. Shape the plant: Prune to maintain the desired shape and size of the plant. Make cuts just above a bud or lateral branch to encourage new growth in the desired direction.\n\n" +
                                "7. Consider flowering plants: If you're pruning flowering plants, be aware of their blooming habits. Some plants produce flowers on new growth, so pruning in early spring can promote more blooms. Others flower on old wood, so prune after they bloom.\n\n" +
                                "8. Clean up and dispose of debris: Once you've finished pruning, clean up any debris and dispose of it properly. This helps prevent the spread of diseases and pests.\n\n" +
                                "9. Monitor and maintain: Regularly monitor your plants throughout the growing season and address any new growth issues or pruning needs as they arise.\n\n" +
                                "Remember, different plants have different pruning requirements, so it's crucial to research and understand the specific needs of each plant before pruning. Happy pruning!"
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
