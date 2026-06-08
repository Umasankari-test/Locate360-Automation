Feature: ForgotPassword Functionality

Scenario: Verify Forgot password link

Given User launches application for forgot password
When User clicks forgot password link
Then forgot password page should be displayed

Scenario: Verify forgot password with valid email

Given User launches application for forgot password
When User clicks forgot password link
And User enters valid email in forgot password
And User clicks continue button
Then Verification email should be sent successfully

Scenario Outline: Forgot Password Functionality Negative Test Cases

Given User launches application for forgot password
When User clicks forgot password link
And User enters "<email>" in forgot password
And User clicks continue button
Then Error message should be displayed

Examples:
| email                 |
| shankarguru@gmail.com |
| shankar@gmail.com     |
| shankarguru.kiaq      |
|                       |