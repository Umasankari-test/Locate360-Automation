Feature: Attendance & Time Tracking

Scenario: Verify Attendance Page

Given User is on Attendance page
Then Attendance page should be displayed

Scenario: Verify Check In Functionality

Given User is on Attendance page
When User clicks Check In button
Then Check Out button should be displayed

Scenario: Verify Today Tab

Given User is on Attendance page
When User clicks Today tab
Then Today details should be displayed

Scenario: Verify History Tab

Given User is on Attendance page
When User clicks History tab
Then History details should be displayed

Scenario: Verify Calendar Tab

Given User is on Attendance page
When User clicks Calendar tab
Then Calendar view should be displayed

Scenario: Verify Report Tab

Given User is on Attendance page
When User clicks Report tab
Then Attendance report should be displayed