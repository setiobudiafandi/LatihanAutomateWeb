package Pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedinNotification extends PageObject {
    @FindBy(id="notifications-tab-icon")
    WebElement notifButton;
    public void clickNotifPic() {
        notifButton.click();
    }

    @FindBy(className="nt-content")
    WebElement notifPage;
    public void gotNotifPage() {
        Assert.assertTrue(notifPage.isDisplayed());
    }
}
