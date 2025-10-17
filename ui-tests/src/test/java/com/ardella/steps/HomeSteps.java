package com.ardella.steps;

import com.ardella.BaseTest;
import com.ardella.page.homePage;
import io.cucumber.java.en.Then;

public class HomeSteps extends BaseTest {

    @Then("user will redirect to homepage")
    public void userWillRedirectToHomepage() {
        homePage HomePage = new homePage(driver);
        HomePage.userWillRedirectToHomepage();
    }
}
