package com.ardella.steps;

import com.ardella.BaseTest;
import com.ardella.page.ProductInCart;
import io.cucumber.java.en.Then;

public class HomeSteps extends BaseTest {

    @Then("user will redirect to homepage")
    public void theCartShouldContainTheProductName() {
        ProductInCart HomePage = new ProductInCart(driver);
        HomePage.theCartShouldContainTheProductName();
    }
}
