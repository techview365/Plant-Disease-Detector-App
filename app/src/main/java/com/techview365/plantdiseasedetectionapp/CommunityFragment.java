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
                        "Types of Crops",
                        "Food plants were historically the first to be harvested and cultivated. They are grown for human consumption. Food plants, particularly grains, are strategically important. At the same time, farmers should keep in mind that while industrial food plant cultivation has many benefits, it can also have negative environmental consequences, such as greenhouse gas (GHG) emissions.\n" +
                                "The following are the types of food crops.\n" +
                                "Cereals: wheat, rice, barley, millet, oats, rye, sorghum, and others. Grains are a rich source of starch, protein, dietary fiber, and nutrients and are an integral part of the daily diet. In particular, maize, rice, and wheat provide the most calories and protein consumed in developing countries.\n" +
                                "There’s a significant influence of crop type.\n" +
                                "\n" +
                                "Fruits: apples and pears, citrus, stone fruits, tropical and exotic fruits, berries, and other types. Fruits contain a lot of dietary fiber, vitamins, minerals, and antioxidants, such as flavonoids, which promote good health.\n" +
                                "Vegetables are high in water content and low in calories. They are also rich in dietary fiber, antioxidants, minerals, and vitamins (especially A and C). There are several types of vegetable crops:\n" +
                                "Spices fall into three types: the spices themselves (pepper, ginger), spice seeds, and herbs. Spices are used sparingly to enhance food flavour and aroma. They contain essential oils and alkaloids that aid appetite and digestion."
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
                        "Story of Seasons: A Wonderful Life - Crop Growing Guide",
                        "Here's a helpful guide to help players grow their crops successfully in Story of Seasons: A Wonderful Life \n" +
                                "Story of Seasons: A Wonderful Life is a modern take on the Harvest Moon original title. Players will enjoy familiar gameplay after moving to their dad's old farm and building it up to a profitable business. To expand the farm quickly, they must focus on earning gold, as everything important costs money. One of the best ways to do this is to grow crops to sell raw or use in more valuable meals.\n" +
                                "Growing crops takes time, effort, and dedication, as players will be responsible for planting, watering, and fertilizing daily if they want successful and high-quality produce. The best way to do this is to learn what seasons crops are grown in and plan their seasonal harvest wisely based on this schedule. They can also get machines and equipment to maximize their time spent and profits from crops. So, here's a complete Story of Seasons: A Wonderful Life crop growing guide.\n" +
                                "\n" +
                                "How to Get Crop Seeds\n" +
                                "When players start, they'll have to spend money to make money, and getting crops is no exception. When moving to Forgotten Valley, Vesta's Farm is the quickest way to get crop seeds. Vesta lives across the bridge close to the path leaving town with Cecilia and Matthew.\n" +
                                "Players can talk to any of them to purchase crop seeds and fertilizer. Vesta's prices are low, but it does start adding up if players buy animals and facilities simultaneously."
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
                        "Crop Production and Management",
                        "EARLY MAN’S FOOD\n" +
                                "Early man was primarily a hunter and a flesh-eater. He also ate fruits and seeds. He did not cultivate food. He was a food gatherer. He and his family had to go without food when the weather was rough This made him change his habit to domesticating cattle and growing of plants along his dwelling units. This enabled him to make use of food available around his home in case he could not go for hunting Since man, animals and plants require water all-round the year, people started settling near rivers, lakes and ponds. This was the beginning of food production by man.\n" +
                                "AGRICULTURE AND FARMING\n" +
                                "When man adopted to plant eating along with flesh eating, he started collecting seeds. The seeds were scattered, germinated and grew. The produce of the plants was used as food and the plant body was left as fodder for cattle. With the increase in demand for food, man became aware of taking care of plants. This was the beginning of agriculture. The word agriculture has come from two latin words, ager meaning field and culture meaning cultivation. Agriculture or farming is the cultivation of soil. It includes growing of plant crops and rearing of animals.\n" +
                                "FOOD FROM PLANTS\n" +
                                "Food from plants includes : Cereals, Pulses, Fruits, Vegetables. We also use oils and beverages as part of our food. The plants cultivated on a large scale specially for food are called food Crops.\n" +
                                "Cereals : The important cereals include Corn, Wheat and Paddy.\n" +
                                "Cereals provide us, Starch, Fibres, Minerals, Some vitamins, Proteins\n" +
                                "These are crops grown in a particular season.\n" +
                                "i) Kharif Crops\n" +
                                "The seeds of these crops sown June/July. The crops are harvested in September/October.\n" +
                                "Examples : Sorghum, Sugarcane, Pearl millet, Pulses, oil seeds, etc.\n" +
                                "ii) Rabi Crops\n" +
                                "These are also known as Winter Crops. The seeds of these crops sown October/November. The crops are harvested in March/April. Winter flowers and winter vegetables are grown.\n" +
                                "Examples : Wheat, Barley, Pea, Oats, etc.\n" +
                                "iii) Zayed Crops\n" +
                                "These are also known as Summer Crops. The seeds of these crops sown March/April. Summer flowers and Summer vegetables are grown. The crops are harvested in May /June.\n" +
                                "Examples : Cucurbita, Lagenaria, Bitter Gourd, Melons, etc.\n" +
                                "\n" +
                                " FOOD PRODUCTION AND FARM MANAGEMENT\n" +
                                "India is primarily an agricultural country. Water is one of the important requirements for growing crops. For water, farmers mainly depend on rain.\n" +
                                "Need for better Agricultural Practices\n" +
                                "Monsoons may fail at times. With the help of scientific and technology, arrangements must be made which should help the farmer with water all-round the year. Also, more and better yields from fields much be achieved.This is possible by adopting better agricultural practices and farm management. Farming. The tasks performed by a Farmer for tilling a farm and for cultivation is called Farming."
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
                        "Top 5 Most Profitable Crops in India",
                        "Agriculture has been the backbone of India’s economy for centuries, providing employment to a large portion of the population and contributing significantly to the nation’s GDP. With diverse climatic conditions and fertile land, India is blessed with the potential to cultivate a wide variety of crops. However, not all crops are equally profitable. We will explore the top 5 most profitable crops in India, taking into consideration factors like demand, market prices, and cultivation feasibility.\n" +
                                "Basmati Rice \n" +
                                "India is renowned for its aromatic and long-grain Basmati rice, which enjoys a global reputation for its quality and flavor. Basmati rice commands a premium price in both domestic and international markets. The demand for this rice variety continues to grow, especially in Middle Eastern and European countries. Punjab, Haryana, and some parts of Uttar Pradesh are the primary regions for Basmati rice cultivation. With proper farming techniques and market access, farmers can reap substantial profits from Basmati rice cultivation.\n" +
                                "Saffron \n" +
                                "Saffron, often referred to as the \"red gold,\" is one of the most expensive spices in the world. It is derived from the stigma of the Crocus sativus flower and has a strong demand in culinary and medicinal industries. The high-altitude regions of Jammu and Kashmir, particularly Pampore, are known for saffron cultivation in India. Due to its labor-intensive and delicate harvesting process, saffron commands a high price, making it a profitable crop for farmers in these regions.\n" +
                                "Vanilla\n" +
                                "Vanilla, once considered exotic, has gained popularity in the Indian market, especially in the food and beverage industry. India's tropical climate, particularly in states like Kerala and Karnataka, is suitable for vanilla cultivation. Vanilla beans are used in various food products, including ice cream, chocolates, and beverages. With the right knowledge and techniques, vanilla farming can yield impressive profits for Indian farmers.\n" +
                                "Medicinal Herbs \n" +
                                "The global demand for medicinal herbs and plants has been steadily rising due to the increased interest in alternative medicine and herbal remedies. India has a rich tradition of herbal medicine, and many medicinal plants like ashwagandha, turmeric, and amla (Indian gooseberry) are in high demand. The cultivation of these herbs is not only profitable but also sustainable, as it contributes to the preservation of traditional knowledge and biodiversity.\n" +
                                "Organic Vegetables \n" +
                                "With the growing health-consciousness among consumers, there is a surge in demand for organic vegetables. Organic farming practices, which avoid synthetic chemicals and pesticides, result in healthier produce that fetches higher prices in the market. Farmers across India are gradually transitioning to organic farming, growing vegetables like tomatoes, bell peppers, and broccoli. This trend not only benefits the environment but also leads to increased profitability for farmers who can tap into the organic market. \n" +
                                "  "
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
                        "Need for Weather Forecasts for Agriculture",
                        "Weather plays an important role in agricultural production systems through its influence on the growth, development and yields of a crop, incidence of pests and diseases, water needs and fertilizer requirements in terms of differences in nutrient mobilization due to water stresses and time lines and effectiveness of prophylactic and cultural operations on crops. Weather aberrations may cause (i) physiological under performance by the crop plants, (ii) physical damage to crops, (iii) soil erosion and (iv)may render the agricultural inputs ineffective. The quality of crop produce during movement from field to storage and transport to market depends on weather. Bad weather may affect the quality of produce while lying in the fields/indoor storages or during transport and may adversely impact the viability and vigour of seeds and planting material during storage.\n" +
                                "    2. Some Unique Aspects of Agricultural Weather Forecasts\n" +
                                "Weather forecasts for agriculture need to be distinct from general weather forecasts due to their applications for specialised operations/decisions. Preparation of field for sowing and sowing of crop with adequate availability of seed zone soil moisture requires copious rains. Rains that do not contribute to root zone soil moisture of standing crops are less effective and therefore need to be provided in quantitative terms. The adequacy of rainfall, for example, needs to be indicated in conjunction with evaporative power of the atmosphere which in turn requires forecasts for other weather variables such as temperature, humidity, wind and sun shine. While clear weather is required for sowing operations it must be preceded by antecedent seed zone soil moisture storage. Thus, forecasts of clear weather following a wet spell are crucial. Such forecasts of dry spells following a wet spell are also required for the initiation of disease control measures. There are areas where frequent thunderstorm activity precedes the arrival of rains associated with well-defined weather systems. In such cases the agronomic strategy should be to utilize pre-seasonal rains for land preparation and resort to dry sowings in anticipation of rain in the next few days. In temperate regions frost can cause severe menace to agricultural productivity. Frosts normally occur when the screen temperatures are 3-4 degrees Celsius above freezing temperature. Appropriate indications for such temperatures need to be given in the forecasts meant for agriculture use.\n" +
                                "Types of Weather forecasts\n" +
                                "Weather forecasts for a given area are categorised based on their period of validity and whether these are deterministic of probabilistic. Different types of weather forecasts and their applications in agriculture are discussed below\n" +
                                "Operational weather forecasts are traditionally classified in the following groups:\n" +
                                "    1. Now-casting (NC)\n" +
                                "    2. Very Short Range Forecast (VSRF)\n" +
                                "    3. Short Range Forecast (SRF)\n" +
                                "    4. Medium Range Forecast (MRF)\n" +
                                "    5. Long Range Forecast (LRF)\n" +
                                "Usages of weather forecasts in agriculture\n" +
                                "            Weather forecasts of different temporal scales are used in agricultural planning and operations in a variety of ways starting from planning for a particular crop/variety to post harvest operations/processing and export/import decisions\n" +
                                "The long range forecasts are used for seasonal planning on\n" +
                                "    • Type of crop/variety to be sown\n" +
                                "    • Proportion of area under different crops\n" +
                                "    • How much of land, if any, to keep fallow\n" +
                                "    • Redistribution of inputs (seed, fertilizer, pesticides etc.)\n" +
                                "    • Arranging for Power & Water Resources\n" +
                                "    • Preparation of Contingency Plans\n" +
                                "    • Post-harvest arrangements for marketing/storage/processing\n" +
                                "    • Preliminary enquiries on exports/imports\n" +
                                "    • Help make the best use of a good season and minimize the harmful impacts of the adverse one"
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