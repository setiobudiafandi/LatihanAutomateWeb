package Pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends PageObject {
    @FindBy(className = "link-forgot-password")
    WebElement linkForgot;
    public void forgotPassLink() {
        linkForgot.click();
    }

    @FindBy(id="nonfastrack")
    WebElement ResetPasswordPage;
    public void forgotPasswordPage() {
        Assert.assertTrue(ResetPasswordPage.isDisplayed());
    }
}
