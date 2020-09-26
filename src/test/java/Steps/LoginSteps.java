package Steps;

import Pages.LinkedinFeed;
import Pages.LinkedinLogin;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {
    LinkedinLogin linkedinLogin;
    LinkedinFeed linkedinFeed;

    public void OpenLinkedinPage() {
        linkedinLogin.open();
    }

    public void InputEmailAndPassword(String email) {
        linkedinLogin.InputEmail(email);
        linkedinLogin.InputPassword();
    }

    public void ClickSignin() {
        linkedinLogin.ClickButtonSignin();
    }

    public void ShouldSigninSuccess() {
        linkedinFeed.isHeaderDisplayed();
        linkedinFeed.isFeedDisplayed();
    }

    public void inputEmailAndWrongPassword(String email) {
        linkedinLogin.InputEmail(email);
        linkedinLogin.InputWrongPassword();
    }

    public void tryAgainPage() {
        linkedinFeed.tryAgainContent();
    }
}
