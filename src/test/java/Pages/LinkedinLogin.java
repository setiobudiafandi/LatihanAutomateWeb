package Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedinLogin extends PageObject {
    @FindBy(id="login-email")
    WebElement fieldEmail;
    public void InputEmail(String email) { fieldEmail.sendKeys(email); }

    @FindBy(id="login-password")
    WebElement fieldPassword;
    public void InputPassword() { fieldPassword.sendKeys("metalurga"); }

    public void InputWrongPassword() {fieldPassword.sendKeys("bvkjrbvj");}

    @FindBy(id="login-submit")
    WebElement buttonLogin;
    public void ClickButtonSignin() { buttonLogin.click(); }
}