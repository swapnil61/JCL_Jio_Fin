package JioFinance;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class JioAppLaunch 
{
    public static void main(String[] args) throws MalformedURLException, Throwable {
        // Use UiAutomator2Options instead of DesiredCapabilities
        UiAutomator2Options options = new UiAutomator2Options();

        // Device details
        options.setPlatformName("Android");
        options.setDeviceName("AndroidDevice");
        options.setUdid("RZ8N91VD1HX");   // your adb device ID
        options.setPlatformVersion("12"); // your phone’s Android version

        // App details
        options.setAppPackage("in.jfs.jiofinance");
        options.setAppActivity("in.jfs.jiofinance.upi.presentation.activity.MainActivity");
        options.setNoReset(true);

        // Connect to Appium server
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, options);

        System.out.println("JioFinance app launched successfully!");

        // Example interaction (uncomment when you know the element ID)
        // driver.findElement(By.id("in.jfs.jiofinance:id/loginButton")).click();
        driver.wait(1000);

        driver.quit();
    }
}