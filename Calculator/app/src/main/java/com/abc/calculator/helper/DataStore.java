package com.abc.calculator.helper;

import android.content.Context;
import android.content.SharedPreferences.Editor;

import com.abc.calculator.BuildConfig;

public class DataStore {
    public static final String AUTH_TOKEN = "authToken";
    public static final String CONTACT_NUM = "contactNumber";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_LOGGED_IN = "keyLoggedIn";
    public static final String LATITUDE = "latitude";
    public static final String LONGITUDE = "longitude";
    public static final String MY_PREFS_NAME = "CALCULATOR";
    public static final String PROFILE_PIC = "profile";
    public static final String USERNAME = "userName";

    public static void setProfilePic(Context context, String value) {
        setString(context, PROFILE_PIC, value);
    }

    public static String getProfilePic(Context context, String key) {
        return getString(context, key);
    }

    public static void setLatitude(Context context, String value) {
        setString(context, LATITUDE, value);
    }

    public static String getLatitude(Context context, String key) {
        return getString(context, key);
    }

    public static void setLongitude(Context context, String value) {
        setString(context, LONGITUDE, value);
    }

    public static String getLongitude(Context context, String key) {
        return getString(context, key);
    }

    public static void setContactNum(Context context, String value) {
        setString(context, CONTACT_NUM, value);
    }

    public static String getContactNum(Context context, String key) {
        return getString(context, key);
    }

    public static void setAuthToken(Context context, String value) {
        setString(context, AUTH_TOKEN, value);
    }

    public static String getAuthToken(Context context, String key) {
        return getString(context, key);
    }

    public static void setUserName(Context context, String value) {
        setString(context, USERNAME, value);
    }

    public static String getUserName(Context context, String key) {
        return getString(context, key);
    }

    public static void setUserEmail(Context context, String value) {
        setString(context, KEY_EMAIL, value);
    }

    public static String getUserEmail(Context context, String key) {
        return getString(context, key);
    }

    public static boolean isLoggedIn(Context context, String key) {
        return getBooleanValue(context, key);
    }

    public static void setLoggedIn(Context context, boolean value) {
        setBooleanValue(context, KEY_LOGGED_IN, value);
    }

    public static void setString(Context context, String key, String value) {
        Editor editor = context.getSharedPreferences(MY_PREFS_NAME, 0).edit();
        editor.putString(key, value);
        editor.commit();
    }

    public static String getString(Context context, String key) {
        return context.getSharedPreferences(MY_PREFS_NAME, 0).getString(key, BuildConfig.FLAVOR);
    }

    public static void setBooleanValue(Context context, String key, boolean value) {
        Editor editor = context.getSharedPreferences(MY_PREFS_NAME, 0).edit();
        editor.putBoolean(key, value);
        editor.commit();
    }

    public static boolean getBooleanValue(Context context, String key) {
        return context.getSharedPreferences(MY_PREFS_NAME, 0).getBoolean(key, false);
    }
}
