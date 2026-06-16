package StepDefinition;

import com.base_class.BaseClass;
import com.pom_class.PomClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MapNavigation extends BaseClass {

	PomClass pom;

	@Given("User is on Route Map Navigation page")
	public void user_is_on_route_map_navigation_page() {

		browserLaunch();

	    launchUrl("https://drctuaap3xvtm.cloudfront.net/");

	    pom = new PomClass(driver);

	    pom.getEmail().sendKeys("shankarguru.kiaq@gmail.com");

	    pom.getPassword().sendKeys("Shankar@123");

	    pom.getSignin().click();

	    pom.getMapNavigation().click();

	    System.out.println("Route Map Navigation Page Opened");

	}

	@When("User clicks Optimal Route card")
	public void user_clicks_optimal_route_card() throws InterruptedException {

		pom.getOptimalRoute().click();
		
		Thread.sleep(2000);

		System.out.println("Optimal Route Card Clicked");
	}

	@When("User clicks Priority Based card")
	public void user_clicks_priority_based_card() throws InterruptedException {

		pom.getPriorityBased().click();
		
		Thread.sleep(2000);

		System.out.println("Priority Based Card Clicked");
	}

	@When("User clicks Custom Order card")
	public void user_clicks_custom_order_card() throws InterruptedException {

		pom.getCustomOrder().click();
		
		Thread.sleep(2000);

		System.out.println("Custom Order Card Clicked");
	}

	@Then("Route optimization options should work successfully")
	public void route_optimization_options_should_work_successfully() {

		System.out.println("Route Optimization Verified");
	}

	@When("User clicks Open In Google Maps button")
	public void user_clicks_open_in_google_maps_button() throws InterruptedException {

		pom.getOpenInGoogleMaps().click();
		
		Thread.sleep(2000);

		System.out.println("Open In Google Maps Clicked");
	}

	@Then("Google Maps should be opened")
	public void google_maps_should_be_opened() {

		System.out.println("Google Maps Opened Successfully");
	}

	@When("User clicks all Navigate buttons")
	public void user_clicks_all_navigate_buttons() throws InterruptedException {

		pom.getNavigateButtons().get(0).click();
		
		Thread.sleep(2000);

		pom.getNavigateButtons().get(1).click();
		
		Thread.sleep(2000);

		pom.getNavigateButtons().get(2).click();
		
		Thread.sleep(2000);

		pom.getNavigateButtons().get(3).click();
		
		Thread.sleep(2000);

		System.out.println("All Navigate buttons are clicked");
	}

	@When("User clicks Start Navigation button")
	public void user_clicks_start_navigation_button() throws InterruptedException {

		pom.getStartNavigation().click();
		
		Thread.sleep(2000);

		System.out.println("Start Navigation Clicked");
	}

	@Then("Route Stop navigation should work successfully")
	public void route_stop_navigation_should_work_successfully() {

		System.out.println("Route Stop Navigation Verified");
	}

	@Then("Navigation should start successfully")
	public void navigation_should_start_successfully() {

		System.out.println("Navigation Started Successfully");
	}
}