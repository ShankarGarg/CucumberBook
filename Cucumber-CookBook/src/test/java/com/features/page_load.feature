Feature: Test Git web Application
  In order to Test Git web Application
  As a user
  I want to specify the application flow

  # Chapter 1, Recipe 1
  Scenario: Web Site loads
    application page load should be quick

    Given application URL is ready with the user
    When user enters the URL in browser
    Then application page loads

  # Chapter 1, Recipe 2
  #Chapter 2, Recipe 1, Recipe 2
  Scenario: checking pre-condition, action and results
    Given user is on Application landing page
    When user clicks Sign in button
    Then user is on login screen
