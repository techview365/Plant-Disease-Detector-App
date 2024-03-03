package com.techview365.plantdiseasedetectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    CropFragment cropFragment = new CropFragment();
    CommunityFragment communityFragment = new CommunityFragment();
    ExploreFragment exploreFragment = new ExploreFragment();
    ProfileFragment profileFragment = new ProfileFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView  = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,cropFragment).commit();


        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.crop) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, cropFragment).commit();
                    return true;
                } else if (itemId == R.id.community) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, communityFragment).commit();
                    return true;
                } else if (itemId == R.id.explore) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, exploreFragment).commit();
                    return true;
                } else if (itemId == R.id.profile) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, profileFragment).commit();
                    return true;
                }

                return false;
            }
        });

    }
}
