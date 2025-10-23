package com.ardella.steps;

import com.ardella.BaseTest;
import com.ardella.page.CartPage;
import com.ardella.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps extends BaseTest {

    protected CartPage cartPage;

    @And("user clicks a product")
    public void userClicksAProduct() {
        cartPage = new CartPage(driver);
        cartPage.userClicksAProduct();
    }

    @And("user clicks {string}")
    public void userClicks(String addToCart) {
        cartPage.userClicks(addToCart);
    }

    @And("user clicks cart")
    public void userClicksCart() {
        cartPage.userClickCart();
    }

    @Then("the cart should contain the product name")
    public void theCartShouldContainTheProductName() {
    }


}
