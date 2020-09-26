package Pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedinColleague extends PageObject {
    @FindBy(xpath = "//*[@id=\"layout-main\"]/div/div[3]/form/input[1]")
    WebElement firstName;
    public void inputFirstName() {
        firstName.sendKeys("Setio");
    }

    @FindBy(xpath = "//*[@id=\"layout-main\"]/div/div[3]/form/input[2]")
    WebElement lastName;
    public void inputLastName() {
        lastName.sendKeys("Budi");
    }

    @FindBy(className = "submit-btn")
    WebElement searchButton;
    public void buttonSearch() {
        searchButton.click();
    }

    @FindBy(id = "wrapper")
    WebElement searchColleagueSuccess;
    public void listSuccess() {
        Assert.assertTrue(searchColleagueSuccess.isDisplayed());
    }
}
