Feature: Home Page
  In order to test Home Page of application
  As a Registered user
  I want to specify the features of home page

  Background: flow till home page
    Given user is on Application home page
    When user enters username
    And user enters password
    And user clicks on login button
    Then user is on Application home page

  Scenario: Home Page Default content
    Then user gets a github bootcamp section

  Scenario: GitHub Bootcamp Section
    When user focuses on GitHub Bootcamp Section
    Then user gets an option to setup git

  Scenario: Top Banner content
    When user focuses on Top Banner
    Then user gets an option of home page
