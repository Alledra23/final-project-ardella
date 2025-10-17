package com.ardella.steps;

import com.ardella.BaseTest;
import com.ardella.page.SignupPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SignupSteps extends BaseTest {

    protected SignupPage signupPage;

    @When("user clicks Sign up button")
    public void userClicksSignUpButton() {
        signupPage = new SignupPage(driver);
        signupPage.userClicksSignUpButton();
    }

    @And("user enters username {string}")
    public void userEntersUsername(String username) {signupPage.userEntersUsername(username);
    }

    @And("user enters password {string}")
    public void userEntersPassword(String password) {signupPage.userEntersPassword(password);
    }

    @And("user submits the sign up form")
    public void userSubmitsTheSignUpForm() {
    }

    @Then("a sign up success alert {string} should appear")
    public void aSignUpSuccessAlertShouldAppear(String successMessage) {
        signupPage.aSignUpSuccessAlertShouldAppea(successMessage);
    }
}
