Meta:

Narrative:
As a user
I want to find a person with a specific name
So that I can get the expected person easily

Scenario: Scenario Find Colleague Success
Meta: @colleague
Given I open Linkedin login page
When I input first name and last name
When click button 'Search'
Then I got list of colleague with the specified name