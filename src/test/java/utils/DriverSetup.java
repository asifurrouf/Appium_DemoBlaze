package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverSetup {
    public AppiumDriver driver;

    public AppiumDriver androidSetupAppium() throws MalformedURLException {
        if (driver == null) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "9");
            capabilities.setCapability("deviceName", "Android Emulator");
            capabilities.setCapability("automationName", "UIAutomator2");
            capabilities.setCapability("chromedriverExecutable", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
            capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
            capabilities.setCapability(CapabilityType.BROWSER_VERSION, "2.44");
            capabilities.setCapability("unicodeKeyboard", true);
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        }

        return driver;
    }

    public DriverSetup() throws MalformedURLException {
        driver = androidSetupAppium();
    }
}
