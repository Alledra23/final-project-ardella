@web
Feature: User shopping flow on Demoblaze

  @login
  Scenario: User logs in with the signed up account
    Given user is on the demoblaze homepage
    When user clicks Log in button
    And user enters username "test_account_01"
    And user enters password "password01!"
    And user submits the login form
    Then user should see their username displayed on homepage
