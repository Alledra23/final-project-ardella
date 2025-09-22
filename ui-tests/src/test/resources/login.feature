@login
Feature: Login

  @valid-login
  Scenario: Login with valid credentials
    Given user is on login page
    And user input email "standard_user"
    And user input password "secret_sauce"
    When user click on Login button
    Then user will redirect to homepage

  @invalid-login
  Scenario: Login with invalid credentials
    Given user is on login page
    And user input email "standard_user"
    And user input password "WrongPassword"
    When user click on Login button
    Then user will see error message "Epic sadface: Username and password do not match any user in this service"

  @boundary-login
  Scenario: Login with empty username
    Given user is on login page
    And user input email ""
    And user input password "secret_sauce"
    When user click on Login button
    Then user will see error message "Epic sadface: Username is required"