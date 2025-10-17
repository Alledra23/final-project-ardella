@web
Feature: User shopping flow on Demoblaze

  @signup
  Scenario: User signs up with a new account
    Given user is on the demoblaze homepage
    When user clicks Sign up button
    And user enters username "test_account_01"
    And user enters password "password01!"
    And user submits the sign up form
    Then a sign up success alert "Sign up successful." should appear