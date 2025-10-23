package com.ardella.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProductInCart {

    By productTitle = By.xpath("//tr[td[text()='Samsung galaxy s6']]");

    private WebDriver driver;

    public ProductInCart(WebDriver driver) {
        this.driver = driver;
    }

    public void theCartShouldContainTheProductName() {
        WebElement productElement = driver.findElement(productTitle);
        assertTrue(productElement.isDisplayed());
        assertEquals("Samsung galaxy s6", productElement.getText());
    }
}
