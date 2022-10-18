Feature: unsuccessful login attempt
  As an user
  I should not be able to login with improper credentials
  like providing wrong or empty credentials



  @login
  @negative-login
  Scenario: login without credentials
    Given User can open Ebay Home Page
    When User click on sign in link
    And user try to login with empty email credential
    Then User should see error message stating it