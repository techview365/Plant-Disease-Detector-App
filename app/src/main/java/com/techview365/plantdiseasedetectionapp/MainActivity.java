package com.techview365.plantdiseasedetectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

import com.techview365.plantdiseasedetectionapp.databinding.ActivityLoginBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Clear SharedPreferences for testing
        SharedPreferences preferences = getSharedPreferences("LanguageSettings", MODE_PRIVATE);
        boolean isLoggedIn = preferences.getBoolean("isLoggedIn", false);
        // Only clear SharedPreferences if the user is not logged in
        if (!isLoggedIn) {
            // Clear SharedPreferences for testing
            SharedPreferences.Editor editor = preferences.edit();
            editor.clear(); // Consider what you're clearing here. Maybe clear specific keys instead?
            editor.apply(); // or editor.commit(); for synchronous operation
        }

        setContentView(R.layout.activity_main);
        boolean hasSelectedLanguage = preferences.getBoolean("HAS_SELECTED_LANGUAGE", false);



        new Handler().postDelayed(() -> {

            if (!hasSelectedLanguage) {
                startActivity(new Intent(MainActivity.this, LanguageSelectionActivity.class));
            } else {
                // Check here if user is logged in, then direct to main app functionality
                // For now, assuming user is not logged in:
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
            finish();
        }, 2000);
    }

}