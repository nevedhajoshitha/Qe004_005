Feature: Google testing

@Tag1
Scenario: Check search functionality
Given Browser is launched
When User enters a <text>
And Clicks on the search button
Then Quit browser

Examples:
|text|
|Selenium|
|Cumcumber|
