package com.ardella.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

public class SignupPage {
    WebDriver driver;


    By signupHome = By.id("signin2");
    By usernameInputTextSignup = By.id("sign-username");
    By passwordInputTextSignup = By.id("sign-password");
    By signupButton = By.xpath("//button[text()='Sign up']");

    public SignupPage (WebDriver driver) {this.driver = driver;}

    public void userClicksSignUpButton() {
        driver.findElement(signupHome).click();
    }

    public void userEntersUsername(String username) {
        driver.findElement(usernameInputTextSignup).sendKeys(username);
    }

    public void userEntersPassword(String password) {
        driver.findElement(passwordInputTextSignup).sendKeys(password);
    }

    public void userSubmitsTheSignUpForm() {
        driver.findElement(signupButton).click();
    }

    public void aSignUpSuccessAlertShouldAppea(String successMessage) {
    }
}
