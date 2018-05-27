Feature: Test Facebook smoke scenario number hu

  @SmokeTest1
  Scenario: Test login with valid credentials
    Given Open Chrome
    When ent username again ent password
      | testuser13@gmail.com | abcd1234 |
    Then go to deal
    Then user enters deals details
      | test deal | 100 | 12 | 18 |
      
