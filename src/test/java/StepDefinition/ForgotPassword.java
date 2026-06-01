package StepDefinition;

import com.base_class.BaseClass;
import com.pom_class.PomClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;

public class ForgotPassword extends BaseClass {

    PomClass pom;
    
    @Given("User launches application for forgot password")
    public void user_launches_application_for_forgot_password() {

        browserLaunch();
        launchUrl("https://drctuaap3xvtm.cloudfront.net/");

        pom = new PomClass(driver);
    }
  
    @When("User clicks forgot password link")
    public void user_clicks_forgot_password_link() {

        pom.getForgotPassword().click();
    }

    @Then("forgot password page should be displayed")
    public void forgot_password_page_should_be_displayed() {

        System.out.println("Forgot Password Page Opened");
        System.out.println(driver.getCurrentUrl());
    }
}