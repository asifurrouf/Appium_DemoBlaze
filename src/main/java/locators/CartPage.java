package locators;

import org.openqa.selenium.By;

public class CartPage {
   public By addToCartButton = By.xpath("//a[contains(text(), 'Add to cart')]");
   public By confirmationAlert = By.id("com.android.chrome:id/js_modal_dialog_message");

   //Scenario: Purchase
   public By okButton = By.id("android:id/button1");
   public By cartTab = By.id("cartur");
   public By cartTable = By.xpath("//div[@class=\"table-responsive\"]");
   public By placeOrderButton = By.xpath("//button[contains(text(), 'Place Order')]");
   public By placeOrderForm = By.xpath("//h5[contains(text(), 'Place order')]");
   public By nameField = By.id("name");
   public By countryField = By.id("country");
   public By cityField = By.id("city");
   public By cardField = By.id("card");
   public By monthField = By.id("month");
   public By yearField = By.id("year");
   public By purchaseButton = By.xpath("//button[contains(text(), 'Purchase')]");
   public By purchaseAlertOkButton = By.xpath("//android.widget.Button[@text='OK']");
}