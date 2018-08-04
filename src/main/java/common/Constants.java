package common;

/**
 * Created by Nuggy Santoso on 8/4/2018
 */
public class Constants {
    /**
     * Default Constant value for ios and android
     */
    public static final String DEFAULT_WD_URL = "http://127.0.0.1:4723/wd/hub";
    public static final String DEFAULT_APP_PATH = System.getProperty("user.dir") + "/src/test/resources/";
    /**
     * Default Constant value for Android
     */
    public static final String DEFAULT_ANDROID_APP_NAME = "Calculator.apk";
    public static final String DEFAULT_ANDROID_PLATFORM_VERSION = "5.1.1";
    public static final String DEFAULT_ANDROID_DEVICE_NAME = "AndroidL";
    public static final int DEFAULT_ANDROID_APP_WAIT = 30000;
    public static final String DEFAULT_ANDROID_APP_PACKAGE = "com.android2.calculator3";
    public static final String DEFAULT_ANDROID_WAIT_ACTIVITY = "com.xylthe.calculator.material.Calculator";
}
