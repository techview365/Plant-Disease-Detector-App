package com.techview365.plantdiseasedetectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Instead of clearing all preferences, make sure you only clear what's necessary.
        // For now, this block is commented out to preserve language settings.
        /*
        SharedPreferences preferences = getSharedPreferences("LanguageSettings", MODE_PRIVATE);
        boolean isLoggedIn = preferences.getBoolean("isLoggedIn", false);
        if (!isLoggedIn) {
            SharedPreferences.Editor editor = preferences.edit();
            // editor.clear(); // Be specific about what to clear if needed.
            // editor.apply();
        }
        */




        setContentView(R.layout.activity_main);
        // Load the language preference and check if the language has been selected.
        SharedPreferences preferences = getSharedPreferences("LanguageSettings", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear(); // This clears all SharedPreferences data. Use with caution.
        editor.apply();
        boolean hasSelectedLanguage = preferences.getBoolean("HAS_SELECTED_LANGUAGE", false);

        new Handler().postDelayed(() -> {
            if (!hasSelectedLanguage) {
                startActivity(new Intent(MainActivity.this, LanguageSelectionActivity.class));
            } else {
                // Check if the user is logged in and navigate accordingly.
                boolean isLoggedIn = preferences.getBoolean("isLoggedIn", false);
                if (isLoggedIn) {
                    // User is logged in, proceed to the main part of your app.
                    // startActivity(new Intent(MainActivity.this, HomeActivity.class));
                } else {
                    // User is not logged in, proceed to the login screen.
                    startActivity(new Intent(MainActivity.this, LoginActivity.class));
                }
            }
            finish();
        }, 2000);
    }
}
