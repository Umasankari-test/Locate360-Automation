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
	public void user_is_on_business_details_page() throws InterruptedException {

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

}
