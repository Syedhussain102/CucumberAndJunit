Feature: Test Facebook smoke scenario number three

  @SmokeTest1
  Scenario: Test login with valid credentials
    Given Open Chrome
    When ent "<username>" again ent "<password>"
      | testuser13@gmail.com | abcd1234 |
    Then login successfully
