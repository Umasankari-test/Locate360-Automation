Feature: Verification Submit Module

Background: Given User is on Verification Submit page

Scenario: Verify New Verification Button functionality

Given User is on Dashboard page
When User clicks Verification button
Then Verification Submit Page should be displayed

Scenario: verify Total Card functionality
When User clicks Total card
Then All verification records should be displayed

Scenario: Verify Pending Card Functionality
When User clicks Pending card
Then Only Pending verification records should be displayed

Scenario: Verify Review Card Functionality
When User clicks Review card
Then Only Review verification records should be displayed

Scenario: Verify Submitted Card Functionality
When User clicks Submitted card
Then Only Submitted verification records should be displayed

Scenario: Verify Approved Card Functionality
When User clicks Approved card
Then Only Approved verification records should be displayed

Scenario: Verify Search Functionality
When User enters valid business name in search field
Then Matching verification record should be displayed

Scenario: Verify Submit Verification Popup
When User clicks Submit button
Then Submit verification popup should be displayed
