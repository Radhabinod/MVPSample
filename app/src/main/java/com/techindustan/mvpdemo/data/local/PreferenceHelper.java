package com.techindustan.mvpdemo.data.local;

import android.content.Context;
import android.content.SharedPreferences;


import com.techindustan.mvpdemo.di.Qualifiers.ApplicationContextQualifier;

import javax.inject.Inject;

/**
 * Created by shruti on 10/1/18.
 */


public class PreferenceHelper {


    private static final String PREF_FILE_NAME = "pref_file";
    SharedPreferences prefs;

    @Inject
    public PreferenceHelper(@ApplicationContextQualifier Context context) {
        prefs = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
    }


    public void updateStringPref(String key, String value) {
        prefs.edit().putString(key, value).apply();
    }

    public String getStringPref(String key) {
        return prefs.getString(key, "");
    }

    public void clearAllPrefs() {
        prefs.edit().clear().apply();
    }


}
