Feature: Login Functionality

Scenario: Valid Login

Given User launches application
When User enters credentials
When User clicks eye icon
Then Password should be visible
And User clicks signin button
Then User should navigate to field executive dashboard

Scenario Outline: Login Functionality Negative Test Cases

Given User launches application
When User enters "<email>" and "<password>"
And User clicks signin button
Then Error message should be displayed

Examples:
| email                       | password  |
| abc@gmail.com               | abc@1234 |
| shankarguru.kiaq@gmail.com  | xyz@321   |
|                             | 1234 |
| shankarguru.kiaq@gmail.com  |           |
|                             |           |