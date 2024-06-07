package com.techview365.plantdiseasedetectionapp;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;

public class LocalizationUtil {
    public static String getLocalizedString(Context context, int resId) {
        try {
            Resources resources = context.getResources();
            return resources.getString(resId);
        } catch (Resources.NotFoundException e) {
            Log.e("LocalizationUtil", "String resource not found", e);
            return "";
        }
    }
}
