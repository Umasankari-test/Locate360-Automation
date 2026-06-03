Feature: Vendor Onboarding

Scenario: Verify Vendor Onboarding navigation

Given User launches application
When User enters credentials
And User clicks signin button
And User clicks Vendor Onboarding
Then Vendor Onboarding page should be displayed


Scenario: Verify Vendor Onboarding with valid details

Given User launches application
When User enters credentials
And User clicks signin button
And User clicks Vendor Onboarding
Then Vendor Onboarding page should be displayed
When User enters valid Vendor details
And User clicks Next button
Then User should navigate to next step

Scenario Outline: Verify Vendor Onboarding Negative Test cases

Given User launches application
When User enters credentials
And User clicks signin button
And User clicks Vendor Onboarding
Then Vendor Onboarding page should be displayed

When User enters vendor details"<vendorName>" and "<phoneNumber>"
And User clicks Next button
Then Vendor Onboarding error message should be displayed

Examples:
| vendorName    |   phoneNumber |
|               |   9876543210  |
| uma           |               |
| uma           |   46745       |
|               |               |

Scenario: Verify Business Information with valid details

Given User launches application
When User enters credentials
And User clicks signin button
And User clicks Vendor Onboarding
Then Vendor Onboarding page should be displayed

When User enters valid Vendor details
And User clicks Next button

When User enters valid Business details
And User clicks Next button

Then User should navigate to Step 3


Scenario Outline: Verify Business Information Negative Test Cases

Given User launches application
When User enters credentials
And User clicks signin button
And User clicks Vendor Onboarding
Then Vendor Onboarding page should be displayed

When User enters valid Vendor details
And User clicks Next button

When User enters Business details "<businessName>" "<businessType>" "<serviceCategory>"
And User clicks Next button

Then Business Information error message should be displayed

Examples:
| businessName | businessType | serviceCategory |
|              | Private Ltd  | IT services     |
| @#$%#^       |              | Electronic      |
| XYZ Traders  | Retail       |                 |
|              |              |                 |
