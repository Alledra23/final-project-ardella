package com.example.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class homePage {

    By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");

    private WebDriver driver;

    public homePage(WebDriver driver) {
        this.driver = driver;
    }

    public void userWillRedirectToHomepage() {
        WebElement productElement = driver.findElement(productTitle);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }

}
