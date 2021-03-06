package common;

import org.junit.After;
import org.junit.Before;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Nuggy Santoso on 8/4/2018
 */
public class BaseAndroidTest extends DriverBuilder {
    private DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private Date date = new Date();

    @After()
    public void tearDown(){
        getAppiumDriver().quit();
    }

    @Before()
    public void setUp() throws Exception{
        super.setAppiumDriver();
        System.out.println("=========================================================");
        System.out.println("Project      : Sample Automation Testing Andoid");
        System.out.println("Date         : "+ dateFormat.format(date));
        System.out.println("App          : "+ Constants.DEFAULT_ANDROID_APP_NAME);
        System.out.println("Device Name  : "+ Constants.DEFAULT_ANDROID_DEVICE_NAME);
        System.out.println("Device OS    : "+ Constants.DEFAULT_ANDROID_PLATFORM_VERSION);
        System.out.println("=========================================================");
    }
}
