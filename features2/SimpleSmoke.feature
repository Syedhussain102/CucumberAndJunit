Feature: Test Facebook smoke scenario simple

  Scenario: Test login with valid credentials
    Given Open Chrome and start the application
    When enter valid "testuser113@gmail.com"
    And again enter valid "abcdtest11234"
    Then succesful login
