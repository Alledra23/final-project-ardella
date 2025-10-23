package com.ardella.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PurchasePage {

    WebDriver driver;
    WebDriverWait wait;

    // form locators
    By nameField = By.id("name");
    By countryField = By.id("country");
    By creditCardField = By.id("card");
    By cityField = By.id("city");
    By monthField = By.id("month");
    By yearField = By.id("year");

    // buttons
    By placeOrderButton = By.xpath("//button[text()='Place Order']");
    By purchaseButton = By.xpath("//button[text()='Purchase']");
//    By okButton = By.xpath("//button[text()='OK']");

    public PurchasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickButton(String buttonText) {
//        driver.findElement(placeOrderButton).click();

//        By dynamicButton = By.xpath("//button[text()='" + buttonText + "']");
        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton));
        btn.click();
    }

    public void fillPurchaseForm(String name, String country, String city, String card, String month, String year) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameField)).sendKeys(name);
        driver.findElement(countryField).sendKeys(country);
        driver.findElement(cityField).sendKeys(city);
        driver.findElement(creditCardField).sendKeys(card);
        driver.findElement(monthField).sendKeys(month);
        driver.findElement(yearField).sendKeys(year);
    }

    public void userClicksToPurchase() {
        driver.findElement(purchaseButton).click();
    }

    public void userShouldSee(String purchaseSuccessfull) {
            wait.until(ExpectedConditions.alertIsPresent());
            String alertText = driver.switchTo().alert().getText();
            assertTrue(alertText.contains(purchaseSuccessfull));
            driver.switchTo().alert().accept();
        }
}


