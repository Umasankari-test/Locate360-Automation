Feature: Route & Map Navigation

Scenario: Verify Route Optimization Options

Given User is on Route Map Navigation page
When User clicks Optimal Route card
And User clicks Priority Based card
And User clicks Custom Order card
Then Route optimization options should work successfully

Scenario: Verify Open In Google Maps

Given User is on Route Map Navigation page
When User clicks Open In Google Maps button
Then Google Maps should be opened

Scenario: Verify Route Stop Navigation

Given User is on Route Map Navigation page
When User clicks all Navigate buttons
And User clicks Start Navigation button
Then Route Stop navigation should work successfully

Scenario: Verify Start Navigation

Given User is on Route Map Navigation page
When User clicks Start Navigation button
Then Navigation should start successfully

