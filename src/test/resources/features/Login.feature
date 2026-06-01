Feature: Login Functionality

Scenario: Valid Login

Given User launches application
When User enters credentials
And User clicks signin button
Then User should navigate to field executive dashboard

Scenario: Login with invalid email
Given User launches application
When User enters invalid email
And User enters valid password
And User clicks signin button
Then Error message should be displayed

Scenario: Login with invalid password
Given User launches application
When User enters valid email
And User enters invalid password
And User clicks signin button
Then Error message should be displayed

