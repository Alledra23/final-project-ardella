@web
Feature: User shopping flow on Demoblaze

  @login
  Scenario: User logs in with the signed up account
    Given user is on the demoblaze homepage
    When user clicks Log in button
    And user input username "demob1@demob1.demob1"
    And user input password "demob1!"
    And user submits the login form
    Then user should see "Welcome demob1@demob1.demob1" displayed on homepage
