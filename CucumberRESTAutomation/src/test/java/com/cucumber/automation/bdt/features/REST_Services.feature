Feature: SOA Test
  In order to test rest services
  As a Registered user
  I want to specify the rest services test conditions

  Scenario: GET Request - GIT Hub User details
    When user sends a GET request with "https://api.github.com/users/ShankarGarg"
    Then status code should be 200
    And response type should be "json"
    And response contains user name "Shankar Garg"

  Scenario: POST Request - Register a user
    When user sends a POST request to "https://selfsolve.apple.com/wcResults.do" with follwoing details
      | key    | value        |
      | sn     | C2WGC14ADRJ7 |
      | cn     |              |
      | locale |              |
      | caller |              |
      | num    | 12345        |
    Then status code should be 200
    And response type should be "html"
    And response contains user name "C2WGC14ADRJ7"
