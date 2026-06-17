Feature: Lead Assignments

Scenario: Verify Lead Assignments Page

Given User is on Lead Assignments page
Then Lead Assignments page should be displayed

Scenario: Verify Search Functionality

Given User is on Lead Assignments page
When User enters lead name in search box
Then Matching lead details should be displayed

Scenario: Verify Filter Button

Given User is on Lead Assignments page
When User clicks Filter button
Then Filter options should be displayed

Scenario: Verify Start Task Button

Given User is on Lead Assignments page
When User clicks Start Task button
Then Task should start successfully

Scenario: Verify Call Button

Given User is on Lead Assignments page
When User clicks Call button
Then Call action should be initiated

Scenario: Verify Navigate Button

Given User is on Lead Assignments page
When User clicks Navigate button
Then Navigation should be opened

Scenario: Verify Mark Complete Button

Given User is on Lead Assignments page
When User clicks Mark Complete button
Then Task should be marked as completed

Scenario Outline: Verify invalid search functionality

Given User is on Lead Assignments page
When User enters "<SearchValue>" in search box
Then No matching lead details should be displayed

Examples:
| SearchValue |
| @@@@@       |
| 123456789   |
| InvalidLead |
| !@#$$%^     |

Scenario Outline: Verify invalid actions on lead

Given User is on Lead Assignments page
When User performs "<Action>" multiple times
Then System should handle the request properly

Examples:
| Action |
| Start Task |
| Call |
| Navigate |
| Mark Complete |