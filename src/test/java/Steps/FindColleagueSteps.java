package Steps;

import Pages.LinkedinColleague;
import net.thucydides.core.steps.ScenarioSteps;

public class FindColleagueSteps extends ScenarioSteps {
    LinkedinColleague linkedinColleague;

    public void InputFirstLastName() {
        linkedinColleague.inputFirstName();
        linkedinColleague.inputLastName();
    }

    public void searchButton() {
        linkedinColleague.buttonSearch();
    }

    public void gotListSuccess() {
        linkedinColleague.listSuccess();
    }
}
