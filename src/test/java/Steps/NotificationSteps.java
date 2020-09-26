package Steps;

import net.thucydides.core.steps.ScenarioSteps;
import Pages.LinkedinNotification;

public class NotificationSteps extends ScenarioSteps {
    LinkedinNotification linkedinNotification;

    public void clickNotifPic() {
        linkedinNotification.clickNotifPic();
    }

    public void gotNotifPage() {
        linkedinNotification.gotNotifPage();
    }
}
