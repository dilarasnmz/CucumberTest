Feature: Register
Scenario: Register Functionality
Given user navigates to the website appv2test.artiwise.cloud/register
And there user logs in through Login Window by using Email as "EMAIL" and Password as "PASSWORD"
Then register must be successful.