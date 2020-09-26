Meta:

Narrative:
As a user
I want to perform login on Facebook
So that I can see my news feed

Scenario: Scenario Login Success
Meta: @login success
Given I open Linkedin login page
When I input email setiobudi71@gmail.com and password correctly
When click button 'Sign in'
Then I got to my news feed

Scenario: Scenario Login Failed
Given I open Linkedin login page
When I input email setiobudi71@gmail.com and wrong password
When click button 'Sign in'
Then I got Try Again page