package Test;

import Steps.NotificationSteps;
import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class Notification extends SerenityStory {
    @Steps
    NotificationSteps notificationSteps;

    @When("I click notification button at the header")
    public void iClickNotifAtTheHeader() {
        notificationSteps.clickNotifPic();
    }

    @Then("I got to my Notification Page")
    public void iGotToNotifPage() {
        notificationSteps.gotNotifPage();
    }
}
