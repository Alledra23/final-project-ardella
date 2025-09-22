package com.example.steps;

import com.example.BaseTest;
import com.example.page.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps extends BaseTest {

    protected loginPage LoginPage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        LoginPage = new loginPage(driver);
        LoginPage.userIsOnLoginPage();
    }

    @And("user input email {string}")
    public void userInputEmail(String username) {
        LoginPage.userInputEmail(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        LoginPage.userInputPassword(password);
    }

    @When("user click on Login button")
    public void userClickOnLoginButton() {
        LoginPage.userClickOnLoginButton();
    }

    @Then("user will see error message {string}")
    public void userWillSeeErrorMessage(String errorMessage) {
        LoginPage.userWillSeeErrorMessage(errorMessage);
    }
}
