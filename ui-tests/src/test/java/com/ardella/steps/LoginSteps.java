package com.ardella.steps;

import com.ardella.BaseTest;
import com.ardella.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps extends BaseTest {

    protected LoginPage loginPage;

    @When("user clicks Log in button")
    public void userClicksLogInButton() {
        loginPage = new LoginPage(driver);
        loginPage.userClicksLogInButton();
    }

    @And("user input username {string}")
    public void userInputUsername(String username) {loginPage.userInputUsername(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {loginPage.userInputPassword(password);
    }

    @And("user submits the login form")
    public void userSubmitsTheLoginButton() {loginPage.userSubmitsTheLoginButton();
    }

    @Then("user should see {string} displayed on homepage")
    public void userShouldSeeDisplayedOnHomepage(String accountName) {
        loginPage.userShouldSeeDisplayedOnHomepage(accountName);
    }


}
