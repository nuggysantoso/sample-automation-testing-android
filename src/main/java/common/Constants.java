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
    public static final String DEFAULT_ANDROID_PLATFORM_VERSION = "6.0";
    public static final String DEFAULT_ANDROID_DEVICE_NAME = "AndroidM";
    public static final int DEFAULT_ANDROID_APP_WAIT = 30000;
    public static final String DEFAULT_ANDROID_APP_PACKAGE = "com.google.android.calculator";
    public static final String DEFAULT_ANDROID_WAIT_ACTIVITY = "com.android.calculator2.Calculator";
}
