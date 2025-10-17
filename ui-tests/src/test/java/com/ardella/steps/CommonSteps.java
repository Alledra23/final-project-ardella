package com.ardella.steps;

import com.ardella.BaseTest;
import com.ardella.page.BasePage;
import io.cucumber.java.en.Given;

public class CommonSteps extends BaseTest {

    protected BasePage basePage;

    @Given("user is on the demoblaze homepage")
    public void userIsOnTheDemoblazeHomepage() {
        basePage = new BasePage(driver);
        basePage.openHomePage();
    }
}
