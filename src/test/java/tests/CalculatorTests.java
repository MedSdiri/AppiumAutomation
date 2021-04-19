package tests;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CalculatorTests {

    @Test
    public void test(){
        DesiredCapabilities dc = new DesiredCapabilities();
        //Wich framework to use for automation
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomaator2");
        //platform of device under test
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        //specify android version
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
        //specify the device name
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2");
        // app or appActivity and appPackage name
        // option 1: new apps
        // option 2: preInstalled apps, e.g. calculator
        // appActivity - path to the main class that runs program
        // appPackage - path that leads to the main class
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");

    }

}
