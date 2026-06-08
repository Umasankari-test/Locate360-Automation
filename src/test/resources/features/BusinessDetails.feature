Feature: Business Details Collection

Scenario: Verify Business Details with valid data

Given User is on Business Details page
When User enters valid Operating Hours details
And User enters valid Team Details
And User enters valid Service Information
And User enters valid Pricing Information
And User enters valid Service Coverage details
And User selects Payment Method
And User clicks Save Business Details button
Then Business Details should be saved successfully