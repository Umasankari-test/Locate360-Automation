package StepDefinition;

import org.junit.Assert;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

import com.base_class.BaseClass;
import com.pom_class.PomClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass {

	PomClass pom;

	@Given("User launches application")

	public void user_launches_application() {
		browserLaunch();
		launchUrl("https://drctuaap3xvtm.cloudfront.net/");
		pom = new PomClass(driver);
	}

	@When("User enters credentials")

	public void user_enters_credentials() throws InterruptedException {

		pom.getEmail().sendKeys("shankarguru.kiaq@gmail.com");

		pom.getPassword().sendKeys("Shankar@123");

		Thread.sleep(2000);
	}

	@When("User clicks eye icon")

	public void user_clicks_eye_icon() throws InterruptedException {

		pom = new PomClass(driver);

		pom.getEyeIcon().click();

		Thread.sleep(2000);
	}

	@Then("Password should be visible")

	public void password_should_be_visible() {

		String type = pom.getPassword().getAttribute("type");

		Assert.assertEquals("text", type);
	}

	// invalid email

	@When("User enters {string} and {string}")

	public void user_enters_and(String email, String password) {

		pom.getEmail().sendKeys(email);

		pom.getPassword().sendKeys(password);
	}

	@When("User clicks signin button")

	public void user_clicks_signin_button() throws InterruptedException {

		pom.getSignin().click();

		Thread.sleep(3000);
		
		System.out.println();

	}

	@Then("User should navigate to field executive dashboard")

	public void user_should_navigate_to_field_executive_dashboard() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.urlContains("/dashboard"));

		String currentUrl = driver.getCurrentUrl();

		System.out.println("Current URL : " + currentUrl);

		Assert.assertEquals("https://drctuaap3xvtm.cloudfront.net/dashboard", currentUrl);

		System.out.println("Login Successful");
	}

	@Then("Error message should be displayed")

	public void error_message_should_be_displayed() {

		String currentUrl = driver.getCurrentUrl();

		System.out.println("Current URL : " + currentUrl);

		Assert.assertTrue(currentUrl.contains("cloudfront"));

		System.out.println("Error Message Displayed");
	}

	// blank email

	@When("User leaves email blank")

	public void user_leaves_email_blank() {

		pom.getEmail().sendKeys("");
	}

	// blank password

	@When("User leaves password blank")

	public void user_leaves_password_blank() {

		pom.getPassword().sendKeys("");
	}

}