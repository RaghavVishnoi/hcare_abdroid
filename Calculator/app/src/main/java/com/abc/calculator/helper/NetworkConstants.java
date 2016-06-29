package com.abc.calculator.helper;

public class NetworkConstants {
    public static String BASE_URL;
    public static String DASHBOARD_IMAGES_URL;
    public static String GETTING_STATES_URL;
    public static String LOGIN_URL;
    public static String PROFILE_PIC_UPLOAD;
    public static String SIGNUP_URL;
    public static String TRAINER_REGISTER_URL;
    public static String WORK_URL;

    static {
        BASE_URL = "http://hcare.herokuapp.com";
        TRAINER_REGISTER_URL = BASE_URL + "/api/trainers";
        SIGNUP_URL = BASE_URL + "/api/users";
        LOGIN_URL = BASE_URL + "/api/session";
        GETTING_STATES_URL = BASE_URL + "/api/states";
        PROFILE_PIC_UPLOAD = BASE_URL + "/api/images";
        DASHBOARD_IMAGES_URL = BASE_URL + "/view_pagers";
        WORK_URL = BASE_URL + "/home_workouts";
    }
}
