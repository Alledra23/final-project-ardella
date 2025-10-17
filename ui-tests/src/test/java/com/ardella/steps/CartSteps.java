package com.ardella.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps {
    @When("user login")
    public void userLogin() {
    }

    @And("user clicks {string} product")
    public void userClicksProduct(String arg0) {
    }

    @And("user clicks {string} and accepts alert")
    public void userClicksAndAcceptsAlert(String arg0) {
    }

    @Then("the cart should contain {string}")
    public void theCartShouldContain(String arg0) {
    }
}
