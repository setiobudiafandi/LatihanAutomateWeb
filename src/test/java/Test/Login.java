package Test;

import Steps.LoginSteps;
import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class Login extends SerenityStory {
    @Steps
    LoginSteps loginSteps;

    @Given("I open Linkedin login page")
    public void givenIOpenLinkedinLoginPage() {
        loginSteps.OpenLinkedinPage();
    }

    @When("I input email $email and password correctly")
    public void whenIInputEmailPassword(String email) {
        loginSteps.InputEmailAndPassword(email);
    }

    @When("click button 'Sign in'")
    public void whenClickSignin() {
        loginSteps.ClickSignin();
    }

    @Then("I got to my news feed")
    public void gotToMyNewsFeed()
    {
        loginSteps.ShouldSigninSuccess();
    }

    @When("I input email $email and wrong password")
    public void whenInputEmailAndWrongPassword(String email) {
        loginSteps.inputEmailAndWrongPassword(email);
    }

    @Then("I got Try Again page")
    public void iGotTryAgainPage() {
        loginSteps.tryAgainPage();
    }
}
