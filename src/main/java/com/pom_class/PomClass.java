package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {

    WebDriver driver;

    public PomClass(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Email Text Box
    @FindBy(xpath = "//input[@type='email']")
    WebElement email;

    // Password Text Box
    @FindBy(xpath = "//input[@name='password']")
    WebElement password;

    // Sign In Button
    @FindBy(xpath = "//button[@type='submit']")
    WebElement signin;
    
    @FindBy(xpath = "//span[text()='Forgot Password']")
    WebElement forgotPassword;
    
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueButton;

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getSignin() {
        return signin;
    }
    public WebElement getForgotPassword() {
        return forgotPassword;
    }
 
    public WebElement getContinueButton() {
        return continueButton;
    }
    
}