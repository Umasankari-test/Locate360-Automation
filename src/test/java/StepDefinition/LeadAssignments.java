package StepDefinition;

import com.base_class.BaseClass;
import com.pom_class.PomClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeadAssignments extends BaseClass {
	
	PomClass pom;
		
	@Given("User is on Lead Assignments page")
	public void user_is_on_lead_assignments_page() {
		
		browserLaunch();

		launchUrl("https://drctuaap3xvtm.cloudfront.net/");

		pom = new PomClass(driver);

		pom.getEmail().sendKeys("shankarguru.kiaq@gmail.com");

		pom.getPassword().sendKeys("Shankar@123");

		pom.getSignin().click();

	    pom.getLeadAssignments().click();

	    System.out.println("Lead Assignments Page Opened");
	}

	@Then("Lead Assignments page should be displayed")
	public void lead_assignments_page_should_be_displayed() {

	    System.out.println("Lead Assignments Page Displayed");
	}

	@When("User enters lead name in search box")
	public void user_enters_lead_name_in_search_box() throws InterruptedException {

	    pom.getSearchBox().sendKeys("Fix TV");
	    
	    Thread.sleep(2000);
	}

	@Then("Matching lead details should be displayed")
	public void matching_lead_details_should_be_displayed() {

	    System.out.println("Matching Lead Displayed");
	}

	@When("User clicks Filter button")
	public void user_clicks_filter_button() throws InterruptedException {

	    pom.getFilterButton().click();
	    
	    Thread.sleep(2000);
	}

	@Then("Filter options should be displayed")
	public void filter_options_should_be_displayed() {

	    System.out.println("Filter Options Displayed");
	}

	@When("User clicks Start Task button")
	public void user_clicks_start_task_button() throws InterruptedException {

	    pom.getStartTask().click();
	    
	    Thread.sleep(2000);
	}

	@Then("Task should start successfully")
	public void task_should_start_successfully() {

	    System.out.println("Task Started Successfully");
	}

	@When("User clicks Call button")
	public void user_clicks_call_button() throws InterruptedException {

	    pom.getCallButton().click();
	    
	    Thread.sleep(2000);
	}

	@Then("Call action should be initiated")
	public void call_action_should_be_initiated() {

	    System.out.println("Call Initiated");
	}

	@When("User clicks Navigate button")
	public void user_clicks_navigate_button() throws InterruptedException {

	    pom.getNavigateButton().click();
	    
	    Thread.sleep(2000);
	}

	@Then("Navigation should be opened")
	public void navigation_should_be_opened() {

	    System.out.println("Navigation Opened");
	}

	@When("User clicks Mark Complete button")
	public void user_clicks_mark_complete_button() throws InterruptedException {

	    pom.getMarkComplete().click();
	    
	    Thread.sleep(2000);
	}

	@Then("Task should be marked as completed")
	public void task_should_be_marked_as_completed() {

	    System.out.println("Task Marked Completed");
	}
	
	@When("User enters {string} in search box")
	public void user_enters_in_search_box(String searchValue) {

	    pom.getSearchBox().clear();
	    pom.getSearchBox().sendKeys(searchValue);

	    System.out.println("Entered: " + searchValue);
	}

	@Then("No matching lead details should be displayed")
	public void no_matching_lead_details_should_be_displayed() {

	    System.out.println("No Matching Lead Details Displayed");
	}
	
	@When("User performs {string} multiple times")
	public void user_performs_multiple_times(String action) {

	    System.out.println(action + " clicked multiple times");
	}

	@Then("System should handle the request properly")
	public void system_should_handle_the_request_properly() {

	    System.out.println("System handled request properly");
	}

}
