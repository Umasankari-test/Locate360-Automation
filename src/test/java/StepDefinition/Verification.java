package StepDefinition;

import com.base_class.BaseClass;
import com.pom_class.PomClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verification extends BaseClass {

	PomClass pom;

	@Given("User is on Dashboard page")
	public void user_is_on_dashboard_page() {

		browserLaunch();

		launchUrl("https://drctuaap3xvtm.cloudfront.net/");

		pom = new PomClass(driver);

		pom.getEmail().sendKeys("shankarguru.kiaq@gmail.com");

		pom.getPassword().sendKeys("Shankar@123");

		pom.getSignin().click();

	}

	@When("User clicks Verification button")
	public void user_clicks_verificcation_button() throws InterruptedException {

		pom.getVerificationSubmit().click();

		Thread.sleep(1000);

	}

	@Then("Verification Submit Page should be displayed")
	public void verification_submit_page_should_be_displayed() {

		System.out.println("Verification Submit Page should be displayed");
	}

	@When("User clicks Total card")
	public void user_clicks_total_card() throws InterruptedException {

		pom.getTotal().click();

		Thread.sleep(2000);
	}

	@Then("All verification records should be displayed")
	public void all_verification_records_should_be_displayed() {

		System.out.println("All verification records should be displayed");
	}

	@When("User clicks Pending card")
	public void user_clicks_pending_card() throws InterruptedException {

		pom.getPending().click();

		Thread.sleep(2000);

	}

	@Then("Only Pending verification records should be displayed")
	public void only_pending_verification_records_should_be_displayed() {

		System.out.println("Only Pending verification records should be displayed");
	}

	@When("User clicks Review card")
	public void user_clicks_review_card() throws InterruptedException {

		pom.getInReview().click();

		Thread.sleep(2000);
	}

	@Then("Only Review verification records should be displayed")
	public void only_review_verification_records_should_be_displayed() {

		System.out.println("Only Review verification records should be displayed");
	}

	@When("User clicks Submitted card")
	public void user_clicks_submitted_card() {

		pom.getSubmitted().click();
	}

	@Then("Only Submitted verification records should be displayed")
	public void only_submitted_verification_records_should_be_displayed() {

		System.out.println("Only Submitted verification records should be displayed");
	}

	@When("User clicks Approved card")
	public void user_clicks_approved_card() throws InterruptedException {

		pom.getApproved().click();

		Thread.sleep(2000);
	}

	@Then("Only Approved verification records should be displayed")
	public void only_approved_verification_records_should_be_displayed() {

		System.out.println("Only Approved verification records should be displayed");
	}

	@When("User enters valid business name in search field")
	public void user_enters_valid_business_name_in_search_field() throws InterruptedException {

		pom.getSearch().click();

		Thread.sleep(2000);
	}

	@Then("Matching verification record should be displayed")
	public void matching_verification_record_should_be_displayed() {

		System.out.println("Matching verification record should be displayed");
	}

	@When("User clicks Submit button")
	public void user_clicks_submit_button() throws InterruptedException {

		pom.getSubmit().click();

		Thread.sleep(2000);
	}

	@Then("Submit verification popup should be displayed")
	public void submit_verification_popup_should_be_displayed() {

		System.out.println("Submit verification popup should be displayed");
	}

}
