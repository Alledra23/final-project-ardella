package com.ardella.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CartPage {
    WebDriver driver;

    WebDriverWait wait;

    By productHome = By.xpath("//a[text()='Samsung galaxy s6']");
    By addProductToCart = By.xpath("//a[text()='Add to cart']");
    By cart = By.id("cartur");

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // explicit wait
    }

    public void userClicksAProduct () {
        driver.findElement(productHome).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(addProductToCart));
    }

    public void userClicks(String addToCart) {
        driver.findElement(addProductToCart).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(cart));
    }

    public void userClickCart() {
        driver.findElement(cart).click();
    }
}
