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

Scenario: Verify Business Details without selecting Payment Method

Given User is on Business Details page
When User enters valid Operating Hours details
And User enters valid Team Details
And User enters valid Service Information
And User enters valid Pricing Information
And User enters valid Service Coverage details
And User clicks Save Business Details button
Then Business Details validation error message should be displayed

Scenario Outline:
Business Details Negative Test Cases

Given User is on Business Details page
When User enters "<weedayOpen>" "<weekdayClose>" "<saturdayOpen>" "<saturdayClose>" operating hours
And User enters "<totalStaff>" "<technicians>" "<supportStaff>" team details
And User enters "<services>" "<specialization>" "<experience>" service information
And User enters "<priceRange>" "<minServiceCharge>" pricing information
And User enters "<serviceRadius>" "<pincode>" "<areaName>" service coverage details
And User clicks Save Business Details button
Then Business Details validation error message should be displayed

Examples:

| weekdayOpen | weekdayClose | saturdayOpen | saturdayClose |totalStaff |technicians| supportStaff |services |specialization |experience |priceRange |minServiceCharge |serviceRadius|pincode|areaName|
|             | 6:00 PM      | 9:00 AM      | 1:00 PM       |10         |6          | 4            |Plumbing | Emergency     |10         |500        |300              |20           |600001 |Chennai |
| 9:00 AM     | 6:00 PM      | 9:00 AM      | 1:00 PM       |           |6          | 4            |Plumbing | Emergency     |10         |500        |300              |20           |600001 |Chennai |
| 9:00 AM     | 6:00 PM      | 9:00 AM      | 1:00 PM       |10         |6          | 4            |         | Emergency     |10         |500        |300              |20           |600001 |Chennai |
| 9:00 AM     | 6:00 PM      | 9:00 AM      | 1:00 PM       |10         |6          | 4            |Plumbing | Emergency     |10         |           |300              |             |600001 |Chennai |