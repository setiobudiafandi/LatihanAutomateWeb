package Test;

import Steps.FindColleagueSteps;
import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class FindColleague extends SerenityStory {
    @Steps
    FindColleagueSteps findColleagueSteps;

    @When("I input first name and last name")
    public void inputFirstNameLastName() {
        findColleagueSteps.InputFirstLastName();
    }

    @When("click button 'Search'")
    public void clickSearch() {
        findColleagueSteps.searchButton();
    }

    @Then("I got list of colleague with the specified name")
    public void gotListOfColleague() {
        findColleagueSteps.gotListSuccess();
    }
}
