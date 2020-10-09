Feature: Arithmetic Calculations

Background:
	Given Initialize browser with chrome
	And Navigate to "http://output.jsbin.com/hudape/1/" site

Scenario: Add two numbers
	When User selects <number1> <operator> and <number 2>
	And Clicks on <equals>
	Then Result should be 7

Scenario: Multiply two numbers
	When User selects "55" "*" "20" "/" "2" "*" "1"
	And Clicks on <equals>
	Then Result should be 550

Scenario: Multiple Operations
	When User selects "3" "+" "5" "*" "3"
	And Clicks on <equals>
	Then Result should be 38

Scenario: Subtract two numbers
	When User selects "150" "-" "9"
	And Clicks on <equals>
	Then Result should be 61

Scenario: Use of Delete Button
	When User selects numbers
	And Clicks on <delete> button

Scenario: Use of Delete Button
	When User enters invalid input
	And Clicks on <equals>
	Then User gets error message 