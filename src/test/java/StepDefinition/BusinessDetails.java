package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base_class.BaseClass;
import com.pom_class.PomClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BusinessDetails extends BaseClass {

	PomClass pom;

	@Given("User is on Business Details page")
	public void user_is_on_business_details_page() {

		browserLaunch();

		launchUrl("https://drctuaap3xvtm.cloudfront.net/");

		pom = new PomClass(driver);

		pom.getEmail().sendKeys("shankarguru.kiaq@gmail.com");

		pom.getPassword().sendKeys("Shankar@123");

		pom.getSignin().click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOf(pom.getBusinessDetails()));

		pom.getBusinessDetails().click();

		System.out.println("Business Details Page Opened");
	}

	@When("User enters valid Operating Hours details")
	public void user_enters_valid_operating_hours_details() throws InterruptedException {

		pom.getWeekdayOpeningTime().sendKeys("09:00 AM");

		Thread.sleep(2000);

		pom.getWeekdayClosingTime().sendKeys("06:00 PM");

		Thread.sleep(2000);

		pom.getSaturdayOpeningTime().sendKeys("09:00 AM");

		Thread.sleep(2000);

		pom.getSaturdayClosingTime().sendKeys("01:00 PM");

		Thread.sleep(2000);
	}

	@When("User enters valid Team Details")
	public void user_enters_valid_team_details() throws InterruptedException {

		pom.getTotalStaff().sendKeys("10");

		Thread.sleep(2000);

		pom.getTechnicians().sendKeys("6");

		Thread.sleep(2000);

		pom.getSupportStaff().sendKeys("4");

		Thread.sleep(2000);

	}

	@When("User enters valid Service Information")
	public void user_enters_valid_service_information() throws InterruptedException {

		pom.getServicesOffered().sendKeys("Plumbing");

		Thread.sleep(2000);

		pom.getSpecialization().sendKeys("Emergency Plumbing");

		Thread.sleep(2000);

		pom.getCertification().sendKeys("Licensed Plumber");

		Thread.sleep(2000);

		pom.getYearsOfExperience().sendKeys("10");

		Thread.sleep(2000);

	}

	@When("User enters valid Pricing Information")
	public void user_enters_valid_pricing_information() throws InterruptedException {

		pom.getPriceRange().sendKeys("500");

		Thread.sleep(2000);

		pom.getCallOutCharges().sendKeys("100");

		Thread.sleep(2000);

		pom.getMinServiceCharge().sendKeys("300");

		Thread.sleep(2000);
	}

	@When("User enters valid Service Coverage details")
	public void user_enters_valid_service_coverage_details() throws InterruptedException {

		pom.getServiceRadius().sendKeys("20");

		Thread.sleep(2000);

		pom.getCoveragePincode().sendKeys("600001");

		Thread.sleep(2000);

		pom.getAreaName().sendKeys("Chennai");

		Thread.sleep(2000);

	}

	@When("User selects Payment Method")
	public void user_selects_payment_method() throws InterruptedException {

		pom.getUPI().click();

		Thread.sleep(2000);
	}

	@When("User clicks Save Business Details button")
	public void user_clicks_save_business_details_button() throws InterruptedException {

		pom.getSaveBusinessDetails().click();

		Thread.sleep(2000);
	}

	@Then("Business Details should be saved successfully")
	public void business_details_should_be_saved_successfully() {

		System.out.println("Business Details Saved Successfully");
	}

	@Then("Business Details validation error message should be displayed")
	public void business_details_validation_error_message_should_be_displayed() {

		System.out.println("Business Details Validation Error Displayed");
	}

	@When("User enters {string} {string} {string} {string} operating hours")
	public void user_enters_operating_hours(String weekdayOpen, String weekdayClose, String saturdayOpen,
			String saturdayClose) throws InterruptedException {

		pom.getWeekdayOpeningTime().sendKeys(weekdayOpen);

		pom.getWeekdayClosingTime().sendKeys(weekdayClose);

		pom.getSaturdayOpeningTime().sendKeys(saturdayOpen);

		pom.getSaturdayClosingTime().sendKeys(saturdayClose);
		
		Thread.sleep(2000);

	}

	@When("User enters {string} {string} {string} team details")
	public void user_enters_team_details(String totalStaff, String technicians, String supportStaff) throws InterruptedException {

		pom.getTotalStaff().sendKeys(totalStaff);

		pom.getTechnicians().sendKeys(technicians);

		pom.getSupportStaff().sendKeys(supportStaff);
		
		Thread.sleep(2000);

	}

	@When("User enters {string} {string} {string} service information")
	public void user_enters_service_information(String services, String specialization, String experience) throws InterruptedException {

		pom.getServicesOffered().sendKeys(services);

		pom.getSpecialization().sendKeys(specialization);

		pom.getYearsOfExperience().sendKeys(experience);

		Thread.sleep(2000);
	}

	@When("User enters {string} {string} pricing information")
	public void user_enters_pricing_information(String priceRange, String minServiceCharge) throws InterruptedException {

		pom.getPriceRange().sendKeys(priceRange);

		pom.getMinServiceCharge().sendKeys(minServiceCharge);

		Thread.sleep(2000);
	}

	@When("User enters {string} {string} {string} service coverage details")
	public void user_enters_service_coverage_details(String serviceRadius, String pincode, String areaName) throws InterruptedException {

		pom.getServiceRadius().sendKeys(serviceRadius);

		pom.getCoveragePincode().sendKeys(pincode);

		pom.getAreaName().sendKeys(areaName);
		
		Thread.sleep(2000);

	}
}
