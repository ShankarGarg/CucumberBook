Feature: optional/non optional Capture Groups

  #Chapter 2: Recipe 4
  Scenario: optional capture groups/Alternation
    #positive
    Then I see following dollars in my account
    #negative
    Then I do not see following dollars in my account

  #Chapter 2: Recipe 4
  Scenario: optional non-capture groups
    Given I have following dollars in my account
    Given He has following dollars in my account
    Given User has following dollars in my account
