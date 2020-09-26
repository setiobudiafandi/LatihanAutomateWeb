package Pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedinFeed extends PageObject {
    @FindBy(id="ember43")
    WebElement contentFeed;
    public void isFeedDisplayed() {
        Assert.assertTrue(contentFeed.isDisplayed());
    }

    @FindBy(id = "extended-nav")
    WebElement headerNavigation;
    public void isHeaderDisplayed() {
        Assert.assertTrue(headerNavigation.isDisplayed());
        element(headerNavigation).shouldBeVisible();
    }

    @FindBy(id="error-for-password")
    WebElement errorMessage;
    public void tryAgainContent() {
        Assert.assertTrue(errorMessage.isDisplayed());
    }
}
