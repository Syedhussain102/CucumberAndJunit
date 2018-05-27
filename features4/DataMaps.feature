Feature: freecrm lonig

  @tag1
  Scenario: free crm login info
    Given url
    When i put username as well as password
      | username    | password |
      | test@gmail  | abcd     |
      | test2@gmail | abcd1    |
      | test3@gmail | abcd2    |
    Then i see user homepage
