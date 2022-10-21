package stepDefinitions.products;

import base.PageObjectManager;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Products;
import org.testng.Assert;
import utils.DriverSetup;

public class FilteringProductsSteps {
    private AndroidDriver driver;
    private PageObjectManager pom;
    private Products products = new Products();

    public FilteringProductsSteps(DriverSetup driverSetup) {
        this.driver = (AndroidDriver) driverSetup.driver;
        this.pom = new PageObjectManager(driver);
    }

    @And("Categories section should be displayed")
    public void categoriesSectionShouldBeDisplayed() {
        Assert.assertTrue(pom.isElementDisplayed(products.categoriesSection));
    }

    @When("User clicks on Laptops option")
    public void userClicksOnLaptopsOption() {
        pom.clickElement(products.laptopsOption);
    }

    @Then("Laptop items should be Displayed")
    public void laptopItemsShouldBeDisplayed() {
        (new TouchAction(driver))
                .press(PointOption.point(703, 1534))
                .moveTo(PointOption.point(737, 485))
                .release()
                .perform();

        Assert.assertTrue(pom.isElementDisplayed(products.firstLaptop));
    }
}
