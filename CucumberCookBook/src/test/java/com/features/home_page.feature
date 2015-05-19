Feature: Home Page
  In order to test Home Page of application
  As a Registered user
  I want to specify the features of home page

  # Chapter 1, Recipe 5
  #Background: flow till home page
  #Given user is on Application home page
  #When user enters username
  #And user enters password
  #And user clicks on login button
  #Then user is on Application home page
  
  
  # Chapter 1, Recipe 4
  Scenario: Home Page Default content
    Given user is on Github home page
    Then user gets a GitHub bootcamp section
    And username is also displayed on right corner

  # Chapter 1, Recipe 4
  Scenario: GitHub Bootcamp Section
    Given user is on GitHub home page
    When user focuses on GitHub Bootcamp Section
    Then user gets an option to setup git
    And user gets an option to create repository
    And user gets an option to Fork Repository
    And user gets an option to work together

  # Chapter 1, Recipe 4
  Scenario: Top Banner content
    Given user is on GitHub home page
    When user focuses on Top Banner
    Then user gets an option of home page
    And user gets an option to search
    And user gets settings options
    And user gets an option to logout
