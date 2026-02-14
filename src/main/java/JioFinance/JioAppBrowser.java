package JioFinance;


import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class JioAppBrowser {
    public static void main(String[] args) throws MalformedURLException, Throwable {
        UiAutomator2Options options = new UiAutomator2Options();

        // BrowserStack device details
        options.setPlatformName("Android");
        options.setDeviceName("Samsung Galaxy S25");
        options.setPlatformVersion("15.0");

        // If you uploaded the app to BrowserStack
        options.setApp("bs://2ce16c10c5510e1c7c7651e5bc052decfbcd6e3a");

        // BrowserStack capabilities
        options.setCapability("project", "JioFinance Automation");
        options.setCapability("build", "JioFinance Build 1");
        options.setCapability("name", "JioFinance App Launch Test");

        // Connect to BrowserStack
        URL url = new URL("https://vishalsingh_stlbM3:hEMvPsFfrqCTXbg1FQP2@hub-cloud.browserstack.com/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, options);

        System.out.println("JioFinance app launched successfully on BrowserStack!");
        driver.wait(1000);
        driver.quit();
    }
}
