package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.base_class.BaseClass;
import com.pom_class.PomClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActivityLog extends BaseClass {

	PomClass pom;

	@Given("User is on Daily Activity Log page")
	public void user_is_on_daily_activity_log_page() throws InterruptedException {

		browserLaunch();

		launchUrl("https://drctuaap3xvtm.cloudfront.net/");

		pom = new PomClass(driver);

		pom.getEmail().sendKeys("shankarguru.kiaq@gmail.com");

		pom.getPassword().sendKeys("Shankar@123");

		pom.getSignin().click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOf(pom.getBusinessDetails()));

		Thread.sleep(5000);

		pom.getActivityLog().click();

		System.out.println("Current URL = " + driver.getCurrentUrl());

		System.out.println("Daily Activity Log Page Opened");
	}

	@When("User enters valid date")
	public void user_enters_valid_date() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOf(pom.getActivityDate()));

		pom.getActivityDate().sendKeys("10-06-2026");
	}

	@When("User enters activity type")
	public void user_enters_activity_type() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOf(pom.getActivityType()));

		pom.getActivityType().sendKeys("KYC");
	}

	@Then("Activity details should be displayed")
	public void activity_details_should_be_displayed() {

		System.out.println("Activity Details Displayed");
	}

	// negative scenario

	@When("User enters date {string} and  activityType {string}")
	public void user_enters_date_and_activity_type(String date, String activitytype) {

		if (!date.isEmpty()) {

			pom.getActivityDate().sendKeys(date);

		}

		if (!activitytype.isEmpty()) {

			pom.getActivityType().sendKeys(activitytype);
		}

	}

	@Then("No activity message should be displayed")
	public void no_activity_message_should_be_displayed() {

		System.out.println("No activity message should be displayed");

	}

}
