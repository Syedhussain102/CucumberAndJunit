
Feature: Facebook login feature


  Scenario: providing correct username and password user will be allowed to login.
    Given Facebook website
    When I provide email
    And password 
    Then i get to see the user home page
    And quite the browser 

  