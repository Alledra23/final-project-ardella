package com.ardella.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps {
//    @When("user login")
//    public void userLogin() {
//    }

    @And("user clicks {string} product")
    public void userClicksProduct(String samsungGalaxy) {
    }

    @And("user clicks {string}")
    public void userClicks(String addToCart) {
    }

    @Then("the cart should contain {string}")
    public void theCartShouldContain(String samsungGalaxyS6) {
    }
}
