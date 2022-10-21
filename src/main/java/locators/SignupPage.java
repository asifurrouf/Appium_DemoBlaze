package locators;

import org.openqa.selenium.By;

public class SignupPage {
    public By signUpTab = By.id("signin2");
    public By signUpForm = By.id("signInModal");
    public By usernameField = By.id("sign-username");
    public By passwordField = By.id("sign-password");
    public By signupButton = By.xpath("//android.widget.Button[@text = 'Sign up']");
    public By confirmationAlert = By.id("com.android.chrome:id/js_modal_dialog_message");
}
