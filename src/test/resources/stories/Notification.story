Meta:
@notif

Narrative:
As a user
I want to open my profile
So that I can see my detail informations

Scenario: Scenario Open Notification Success
GivenStories: stories/Login.story#{login:success}
When I click notification button at the header
Then I got to my Notification Page