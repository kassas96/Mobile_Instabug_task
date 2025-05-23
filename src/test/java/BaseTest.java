import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.URL;

public class BaseTest {

    public AppiumDriver driver;

    @BeforeClass(description = "Set Up Appium Driver")
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "R5CR1207J0E");
        capabilities.setCapability("version", "13");
        capabilities.setCapability("app","\"C:\\Users\\Kassas\\Downloads\\Weather forecast_82.01_APKPure.apk\"");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @AfterClass(description = "Tear Down Appium Driver", alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
    }
}