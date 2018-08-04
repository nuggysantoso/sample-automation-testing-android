package common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

/**
 * Created by Nuggy Santoso on 8/4/2018
 */
public class DriverBuilder {
    private static AppiumDriver appiumDriver = null;
    private static DesiredCapabilities desiredCapabilities;

    public static void setAppiumDriver() throws Exception{
        appiumDriver = createAndroidDriver();
    }

    public static AppiumDriver getAppiumDriver(){
        return appiumDriver;
    }

    public static AppiumDriver createAndroidDriver() throws Exception{
        File appDir = new File(Constants.DEFAULT_APP_PATH);
        File app = new File(appDir, Constants.DEFAULT_ANDROID_APP_NAME);
        desiredCapabilities = new DesiredCapabilities().android();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, Constants.DEFAULT_ANDROID_PLATFORM_VERSION);
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, Constants.DEFAULT_ANDROID_DEVICE_NAME);
        desiredCapabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 520000);
        desiredCapabilities.setCapability("--session-override", true);
        desiredCapabilities.setCapability("avd", Constants.DEFAULT_ANDROID_DEVICE_NAME);
        desiredCapabilities.setCapability("appWaitDuration", Constants.DEFAULT_ANDROID_APP_WAIT);
        desiredCapabilities.setCapability("appPackage", Constants.DEFAULT_ANDROID_APP_PACKAGE);
        desiredCapabilities.setCapability("appWaitActivity", Constants.DEFAULT_ANDROID_WAIT_ACTIVITY);
        return new AndroidDriver(new URL(Constants.DEFAULT_WD_URL), desiredCapabilities);
    }
}
