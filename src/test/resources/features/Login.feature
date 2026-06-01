Feature: Login Functionality

Scenario: Valid Login

Given User launches application
When User enters credentials
And User clicks signin button
Then User should navigate to field executive dashboard


Scenario Outline: Login Functionality Negative Test Cases

Given User launches application
When User enters "<email>" and "<password>"
And User clicks signin button
Then Error message should be displayed

Examples:
| email                    | password  |
| abc@gmail.com            | Test@1234 |
| testing.field@gmail.com  | xyz@321   |
|                          | Test@1234 |
| testing.field@gmail.com  |           |
|                          |           |