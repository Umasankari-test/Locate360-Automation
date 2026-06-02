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

	// vendorOnaboarding module

	@FindBy(xpath = "//button[text()='Vendor Onboarding']")
	WebElement vendorOnboarding;

	@FindBy(xpath = "//input[@id='vendorName']")
	WebElement vendorName;

	@FindBy(xpath="//input[@name='phoneNumber']")
	WebElement phoneNumber;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement submit;

	// login module

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

	// VendorOnboarding module

	public WebElement getVendorOnboarding() {
		return vendorOnboarding;
	}

	public WebElement getVendorName() {
		return vendorName;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getNextButton() {
		return submit;
	}

}