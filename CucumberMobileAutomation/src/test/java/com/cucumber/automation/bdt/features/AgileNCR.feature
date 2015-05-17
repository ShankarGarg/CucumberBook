Feature: Agile NCR App
	In order to look at Agile NCR Conference
	As a Registered user
	I want to specify the flow to Agenda and Speakers

Scenario: Agenda
	Given user is on AgileNCR Home Page
	Then user gets an option Agenda
	When user selects Agenda
	Then user is on Agenda Screen
	When user chooses to go back
	Then user is on AgileNCR Home Page