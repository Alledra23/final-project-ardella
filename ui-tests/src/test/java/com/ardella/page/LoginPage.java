package com.ardella.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

public class LoginPage {
    WebDriver driver;

    By loginHome = By.id("login2");
    By usernameInputTextLogin = By.id("loginusername");
    By passwordInputTextLogin = By.id("loginpassword");
    By loginButton = By.xpath("//button[text()='Log in']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void userClickOnLoginButton() {
        driver.findElement(loginHome).click();
    }

    public void userEntersUsername(String username) {
        driver.findElement(usernameInputTextLogin).sendKeys(username);
    }

    public void userEntersPassword(String password) {
        driver.findElement(passwordInputTextLogin).sendKeys(password);
    }

    public void userSubmitsTheSignUpForm() {
        driver.findElement(loginButton).click();
    }
}
