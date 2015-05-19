Feature: login Page
  In order to test login page
  As a Registered user
  I want to specify the login conditions

  Scenario: login flow
    login should be quick and easy

    # Chapter 1: Recipe 3, 6
    # Chapter 2: Recipe 3
    Given user is on Application landing page
    And Sign in button is present on screen
    When user clicks on Sign in button
    Then user is displayed login screen
    When user enters "ShankarGarg" in username field
    And user enters "123456" in password field
    And user clicks Sign in button
    Then user is on home page
    And title of home page is "GitHub"
    But Sign in button is not present

  # Chapter 1: Recipe 6
  Scenario: New User Registration
    Given user is on Application landing page
    When user enters "ShankarGarg" in username field
    And user enters "sgarg@gmail.com" in password field
    And user enters "123456" in password field
    And user clicks on Signup for GitHub button
    Then user is successfully registered

  # Chapter 1: Recipe 7
  # Chapter 2: Recipe 5
  Scenario: Existing user Verification
    Given user is on Application landing page
    Then we verify following user exists
      | Name    | Email           | Phone |
      | Shankar | sgarg@email.com | 999   |
      | Ram     | ram@email.com   | 888   |
      | Sham    | sham@email.org  | 666   |

  # Chapter 1: Recipe 8
  Scenario Outline: Login fail - possible combinations
    Given user is on Application landing page
    When user clicks on Sign in button
    Then user is displayed login screen
    When user enters "<UserName>" in username field
    And user enters "<Password>" in password field
    And user clicks Sign in button
    Then user gets login failed error message

    Examples: 
      | UserName      | Password      |
      | wrongusername | 123456        |
      | ShankarGarg   | wrongpassword |
      | wrongusername | wrongpassword |

  # Chapter 2: Recipe 6
  Scenario: Table Diff
    Given user send a get request to "localhost:8080/e"
    Then user gets following response
      | username | age |
      | sham     | 25  |
      | ram      | 26  |

  # Chapter 2: Recipe 7
  Scenario: Doc String
    Given a book named "cucumber cookbook" with following body
      """
      Title – Cucumber cookbook
      Author of this book is first time writer so please excuse the naïve mistakes. But he will definitely improve with chapters he writes.  
      """

  # Chapter 2: Recipe 8
  Scenario Outline: Email content verification
    Given I have a user account with <Role> rights
    Then I should receive an email with the body:
      """
      Dear user,
      You have been granted <Role> rights.  You are <details>. Please be     
      responsible.
      -The Admins
      """

    Examples: 
      | Role    | details                                       |
      | Manager | now able to manage your employee accounts     |
      | Admin   | able to manage any user account on the system |
    
    # Chapter 2: Recipe 9  
   Scenario: Date Format
   Given My Birthday is on “29-12-1986”
