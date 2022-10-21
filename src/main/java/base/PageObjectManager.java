package base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class PageObjectManager {
    protected WebDriver driver;
    protected Wait wait;
    protected int Timeout = 30;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * click an element
     *
     * @param locator : element's locator
     */
    public void clickElement(By locator) {
        waitElementToBeClickAble(locator);
        driver.findElement(locator).click();
    }

    /**
     * click an element
     *
     * @param locator : element's locator
     */
    public boolean isElementDisplayed(By locator) {
        waitElementToBeDisplayed(locator);
        return driver.findElement(locator).isDisplayed();
    }

    public void waitElementToBeDisplayed(By locator) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(Timeout));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /**
     * type an element
     *
     * @param locator : element's locator
     * @param input   : String input to insert into input field
     */
    public void SendKeysToInputField(By locator, String input) {
        driver.findElement(locator).sendKeys(input);
    }

    /**
     * @param locator : element's locator
     */
    public void waitElementToBeClickAble(By locator) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(Timeout));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    /**
     * click an element
     *
     * @param locator : element's locator
     */
    public List<WebElement> getListOfElements(By locator) {
        waitElementToBeClickAble(locator);
        return driver.findElements(locator);
    }

    /**
     * click an element
     *
     * @param locator : element's locator
     */
    public WebElement getElement(By locator) {
        waitElementToBeClickAble(locator);
        return driver.findElement(locator);
    }

    /**
     * get text of an element
     *
     * @param locator : element's locator
     */
    public String getTextString(By locator) {
        return driver.findElement(locator).getText();
    }

    /**
     * get text of an element
     *
     * @param locator : element's locator
     */
    public void javaScriptClick(By locator){
        WebElement element = driver.findElement(locator);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
}
