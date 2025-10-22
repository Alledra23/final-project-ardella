package com.ardella.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    WebDriver driver;

    WebDriverWait wait;


    By loginHome = By.id("login2");
    By usernameInputTextLogin = By.id("loginusername");
    By passwordInputTextLogin = By.id("loginpassword");
    By loginButton = By.xpath("//button[text()='Log in']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // explicit wait
    }

    public void userClicksLogInButton() {
        driver.findElement(loginHome).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameInputTextLogin));
    }

    public void userInputUsername(String username) {
//        driver.findElement(usernameInputTextLogin).sendKeys(username);
        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(usernameInputTextLogin));
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void userInputPassword(String password) {
//        driver.findElement(passwordInputTextLogin).sendKeys(password);
        WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(passwordInputTextLogin));
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void userSubmitsTheLoginButton() {
//        driver.findElement(loginButton).click();
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        button.click();
    }

    public void userShouldSeeDisplayedOnHomepage(String accountName) {
//        assertTrue(driver.getPageSource().contains(accountName));
        wait.until(ExpectedConditions.alertIsPresent());
        String alertText = driver.switchTo().alert().getText();
        assertTrue(alertText.contains(accountName));
        driver.switchTo().alert().accept();
    }
}
