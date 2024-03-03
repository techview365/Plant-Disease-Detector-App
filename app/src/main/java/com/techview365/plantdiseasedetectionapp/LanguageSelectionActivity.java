package com.techview365.plantdiseasedetectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class LanguageSelectionActivity extends AppCompatActivity {
    private RadioGroup radioGroupLanguages;
    private Button buttonContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_selection);

        radioGroupLanguages = findViewById(R.id.radioGroupLanguages);
        buttonContinue = findViewById(R.id.buttonContinue);

        buttonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroupLanguages.getCheckedRadioButtonId();
                String languageCode = "en"; // Default to English

                if (selectedId == R.id.hindiButton) {
                    languageCode = "hi";
                } else if (selectedId == R.id.marathiButton) {
                    languageCode = "mr";
                }

                saveLanguagePreference(languageCode);
                Intent intent = new Intent(LanguageSelectionActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    private void saveLanguagePreference(String lang) {
        SharedPreferences preferences = getSharedPreferences("LanguageSettings", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("SELECTED_LANGUAGE", lang);
        editor.putBoolean("HAS_SELECTED_LANGUAGE", true); // Add this line
        editor.apply();
    }
}