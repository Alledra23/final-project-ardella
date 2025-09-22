package com.example.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

public class loginPage {
    WebDriver driver;

    By usernameInputText = By.cssSelector("input#user-name");
    By passwordInputText = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.id("login-button");

    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void userIsOnLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void userInputEmail(String username) {
        driver.findElement(usernameInputText).sendKeys(username);
    }

    public void userInputPassword(String password) {
        driver.findElement(passwordInputText).sendKeys(password);
    }

    public void userClickOnLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void userWillSeeErrorMessage(String errorMessage) {
        assertTrue(driver.getPageSource().contains(errorMessage));
    }
}
