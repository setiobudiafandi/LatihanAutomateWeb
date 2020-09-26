package Test;

import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import Steps.ForgotPasswordSteps;

public class ForgotPassword extends SerenityStory {
    @Steps
    ForgotPasswordSteps forgotPasswordSteps;

    @When("click button 'Forgot password'")
    public void clickForgotPassword() {
        forgotPasswordSteps.forgotPass();
    }

    @Then("I enter the reset password page")
    public void enterResetPasswordPage() {
        forgotPasswordSteps.resetPass();
    }
}
