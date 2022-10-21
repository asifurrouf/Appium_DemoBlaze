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

public class ProductDetailsSteps {
    private AndroidDriver driver;
    private PageObjectManager pom;
    private Products products = new Products();

    public ProductDetailsSteps(DriverSetup driverSetup) {
        this.driver = (AndroidDriver) driverSetup.driver;
        this.pom = new PageObjectManager(driver);
    }

    @When("User scrolls down to Products section")
    public void userScrollsDownToProductsSection() {
        (new TouchAction(driver))
                .press(PointOption.point(729, 1530))
                .moveTo(PointOption.point(782, 432))
                .release()
                .perform();
    }

    @And("Clicks on a product from the products list")
    public void clicksOnAProductFromTheProductsList() throws InterruptedException {
        Thread.sleep(2000);
        pom.clickElement(products.firstProduct);
    }

    @Then("Product description page should be loaded")
    public void productDescriptionPageShouldBeLoaded() throws InterruptedException {
        Thread.sleep(2000);
        (new TouchAction(driver))
                .press(PointOption.point(196, 1617))
                .moveTo(PointOption.point(180, 965))
                .release()
                .perform();

        Assert.assertTrue(pom.isElementDisplayed(products.productDescription));
    }

    @And("Product image should be displayed")
    public void productImageShouldBeDisplayed() {
        Assert.assertTrue(pom.isElementDisplayed(products.productImage));
    }

    @And("Product name should be displayed")
    public void productNameShouldBeDisplayed() {
        Assert.assertTrue(pom.isElementDisplayed(products.productName));
    }

    @And("Product price should be displayed")
    public void productPriceShouldBeDisplayed() {
        Assert.assertTrue(pom.isElementDisplayed(products.productPrice));
    }
}
