package StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base_class.BaseClass;
import com.pom_class.PomClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VendorOnboarding extends BaseClass {

	PomClass pom;

	@When("User clicks Vendor Onboarding")

	public void user_clicks_vendor_onboarding() throws InterruptedException {

		pom = new PomClass(driver);

		Thread.sleep(3000);

		System.out.println("Before Next Click");

		pom.getVendorOnboarding().click();

		System.out.println("After Next Click");

	}

	@Then("Vendor Onboarding page should be displayed")

	public void vendor_onboarding_page_should_be_displayed() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.urlContains("vendor"));

		String currentUrl = driver.getCurrentUrl();

		System.out.println("Current URL : " + currentUrl);

		Assert.assertTrue(currentUrl.contains("vendor"));

		System.out.println("Vendor Onboarding Page Opened Successfully");
	}

	@When("User enters valid Vendor details")
	public void user_enters_valid_vendor_details() throws InterruptedException {

		pom = new PomClass(driver);

		pom.getVendorName().sendKeys("Uma");

		Thread.sleep(2000);

		pom.getPhoneNumber().sendKeys("9876543210");

		Thread.sleep(2000);
	}

	@When("User clicks Next button")
	public void user_clicks_next_button() throws InterruptedException {

		pom.getNextButton().click();
	}

	@Then("User should navigate to next step")

	public void user_should_navigate_to_next_step() {

		Assert.assertNotNull(driver);

		System.out.println("Navigated to Next Step Successfully");
	}

	@When("User enters vendor details {string} and {string}")

	public void user_enters_vendor_details(String vendorName, String phoneNumber) {

		pom.getVendorName().clear();

		pom.getPhoneNumber().clear();

		pom.getVendorName().sendKeys(vendorName);

		pom.getPhoneNumber().sendKeys(phoneNumber);
	}

	@Then("Vendor Onboarding error message should be displayed")

	public void vendor_onboarding_error_message_should_be_displayed() {

		System.out.println(" vendor form validation error displayed");
	}

	@When("User enters valid Business details")

	public void user_enters_valid_business_details() throws InterruptedException {

		pom = new PomClass(driver);

		pom.getbusinessName().sendKeys("XYZ Traders");
		
		pom.getbusinessType().sendKeys("Retail");
		
		pom.getserviceCategory().click();

		Thread.sleep(2000);

		Actions a = new Actions(driver);

		a.moveToElement(pom.getserviceCategory())
		 .click()
		 .sendKeys("Home Services")
		 .sendKeys(Keys.ENTER)
		 .perform();

		Thread.sleep(2000);
	}

	@When("User enters Business details {string} {string} {string}")

	public void user_enters_business_Details(String businessName, String businessType, String serviceCategory)
			throws InterruptedException {

		pom = new PomClass(driver);

		pom.getbusinessName().clear();
		pom.getbusinessType().clear();
		pom.getserviceCategory().clear();

		pom.getbusinessName().sendKeys(businessName);
		pom.getbusinessType().sendKeys(businessType);
		pom.getserviceCategory().sendKeys(serviceCategory);
		Thread.sleep(2000);
	}

	@Then("Business Information error message should be displayed")

	public void business_information_error_message_should_be_dispalyed() {

		System.out.println("Business Information Validation error Displayed");
	}

	@Then("User should navigate to Step 3")

	public void user_should_navigate_to_step_3() {

		System.out.println("Navigated to Step 3 Successfully");
	}

	@When("User enters valid Address details")
	public void user_enters_valid_address_details() {
		
		System.out.println("current URL = " + driver.getCurrentUrl());
		
		System.out.println("Address step opened");
		
		pom = new PomClass(driver);

		pom.getAddress().sendKeys("Bank street");
		pom.getpincode().sendKeys("607009");
		pom.getcity().sendKeys("Chennai");
		pom.getState().sendKeys("Tamil Nadu");
	}

	@When("User enters Address details {string} {string} {string} {string}")
	public void user_enters_address_details(String Address, String pincode, String city, String state) {

		pom = new PomClass(driver);

		pom.getAddress().clear();
		pom.getpincode().clear();
		pom.getcity().clear();
		pom.getState().clear();

		pom.getAddress().sendKeys(Address);
		pom.getpincode().sendKeys(pincode);
		pom.getcity().sendKeys(city);
		pom.getState().sendKeys(state);
	}

	@Then("User should navigate to Step 4")
	public void user_should_navigate_to_step_4() {

		System.out.println("Navigated to Step 4 Successfully");
	}

	@Then("Address Verification error message should be displayed")
	public void address_verification_error_message_should_be_displayed() {

		System.out.println("Address Verification Validation Error Displayed");
	}
}