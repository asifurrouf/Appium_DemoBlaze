package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import utils.DriverSetup;

public class Hooks {
    AppiumDriver driver;

    public Hooks(DriverSetup driverSetup){
        this.driver = driverSetup.driver;
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
