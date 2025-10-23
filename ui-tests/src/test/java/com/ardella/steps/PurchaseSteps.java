package com.ardella.steps;

import com.ardella.BaseTest;
import com.ardella.page.PurchasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PurchaseSteps extends BaseTest {

    protected PurchasePage purchasePage;

    @When("user clicks button {string}")
    public void userClicksButton(String buttonText) {
        purchasePage = new PurchasePage(driver);
        purchasePage.clickButton(buttonText);
    }

    @And("user fills out the purchase form with valid details")
    public void userFillsOutThePurchaseFormWithValidDetails() {
        purchasePage.fillPurchaseForm(
                "Purchase Test",
                "Indonesia",
                "Jakarta",
                "1111",
                "January",
                "2030"
        );
    }

    @And("user clicks {string} to purchase")
    public void userClicksToPurchase(String placeOrder) {
        purchasePage.userClicksToPurchase();
    }

    @Then("user should see {string}")
    public void userShouldSee(String purchaseSuccessfull) {
        purchasePage.userShouldSee(purchaseSuccessfull);
    }


}
