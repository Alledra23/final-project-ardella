package com.ardella.steps;

import com.ardella.BaseTest;
import com.ardella.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps extends BaseTest {

    protected LoginPage loginPage;

    @When("user click on Login button")
    public void userClickOnLoginButton() {
        loginPage = new LoginPage(driver);
        loginPage.userClickOnLoginButton();
    }

    @And("user input email {string}")
    public void userInputEmail(String username) {loginPage.userEntersUsername(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {loginPage.userEntersUsername(password);
    }

    @And("user submits the login form")
    public void userSubmitsTheLoginForm() {
    }

    @Then("user should see their username displayed on homepage")
    public void userShouldSeeTheirUsernameDisplayedOnHomepage() {
    }
}
