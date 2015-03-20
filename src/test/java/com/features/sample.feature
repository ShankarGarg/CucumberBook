@important
Feature: Home Page

  @sanity
  Scenario: Home Page Default content
    Given user is on Application home page
    Then user gets a github bootcamp section

  @regression
  Scenario: GitHub Bootcamp Section
    Given user is on Application home page
    When user focuses on GitHub Bootcamp Section
    Then user gets an option to setup git

  @sanity @regression
  Scenario: Top Banner content
    Given user is on Application home page
    When user focuses on Top Banner
    Then user gets an option of home page
