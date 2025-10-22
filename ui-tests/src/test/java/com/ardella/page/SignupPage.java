//package com.ardella.page;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import static org.junit.Assert.assertTrue;
//
//public class SignupPage {
//    WebDriver driver;
//
//
//    By signupHome = By.id("signin2");
//    By usernameInputTextSignup = By.id("sign-username");
//    By passwordInputTextSignup = By.id("sign-password");
//    By signupButton = By.xpath("//button[text()='Sign up']");
//
//    public SignupPage (WebDriver driver) {this.driver = driver;}
//
//    public void userClicksSignUpButton() {
//        driver.findElement(signupHome).click();
//    }
//
//    public void userEntersUsername(String username) {
//        driver.findElement(usernameInputTextSignup).sendKeys(username);
//    }
//
//    public void userEntersPassword(String password) {
//        driver.findElement(passwordInputTextSignup).sendKeys(password);
//    }
//
//    public void userSubmitsTheSignUpForm() {
//        driver.findElement(signupButton).click();
//    }
//
//    public void aSignUpSuccessAlertShouldAppear(String successMessage) {
//        assertTrue(driver.getPageSource().contains(successMessage));
//
//    }
//}

package com.ardella.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class SignupPage {
    WebDriver driver;
    WebDriverWait wait;

    By signupHome = By.id("signin2");
    By usernameInputTextSignup = By.id("sign-username");
    By passwordInputTextSignup = By.id("sign-password");
    By signupButton = By.xpath("//button[text()='Sign up']");

    public SignupPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // explicit wait
    }

    public void userClicksSignUpButton() {
        driver.findElement(signupHome).click();
        // Tunggu sampai modal sign up muncul dan input username bisa diketik
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameInputTextSignup));
    }

    public void userEntersUsername(String username) {
        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(usernameInputTextSignup));
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void userEntersPassword(String password) {
        WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(passwordInputTextSignup));
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void userSubmitsTheSignUpForm() {
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(signupButton));
        button.click();
    }

    public void aSignUpSuccessAlertShouldAppear(String successMessage) {
        // Tunggu alert muncul
        wait.until(ExpectedConditions.alertIsPresent());
        String alertText = driver.switchTo().alert().getText();
        assertTrue(alertText.contains(successMessage));
        driver.switchTo().alert().accept();
    }
}

