Feature: Daily Activity Log

Scenario: Verify daily Activity Log page

Given User is on Daily Activity Log page
When  User enters valid date
And User enters activity type
Then Activity details should be displayed

Scenario Outline: Verify Daily Activity Log Negative Test Cases

Given User is on Daily Activity Log page
When User enters date "<date>" and  activityType "<activityType>"
Then No activity message should be displayed

Examples:

| date           | activityType |
|                |  KYC         |
| 10-06-2026     |              |
|                |              |
| 33-98-8976     |  KYC         |