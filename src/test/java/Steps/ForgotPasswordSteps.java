package Steps;

import net.thucydides.core.steps.ScenarioSteps;
import Pages.ForgotPasswordPage;

public class ForgotPasswordSteps extends ScenarioSteps {
    ForgotPasswordPage forgotPasswordPage;

    public void forgotPass() {
        forgotPasswordPage.forgotPassLink();
    }

    public void resetPass() {
        forgotPasswordPage.forgotPasswordPage();
    }
}
