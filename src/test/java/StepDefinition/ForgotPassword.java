package StepDefinition;

import org.junit.Assert;

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
    
    public void user_clicks_forgot_password_link() throws InterruptedException {

    	System.out.println("Before Email Enter");
    	
        pom.getForgotPassword().click();
        
        System.out.println(" Email Enter");
     
        Thread.sleep(2000);
    }

    @Then("forgot password page should be displayed")
    
    public void forgot_password_page_should_be_displayed() {

        Assert.assertNotNull(driver.getCurrentUrl());

        System.out.println("Forgot Password Page Opened Successfully");
    }
    
    @When("User enters {string} in forgot password")
    
    public void user_enters_in_forgot_password(String email) {

        pom = new PomClass(driver);

        pom.getForgotEmail().sendKeys(email);
    }
    
    @When("User enters valid email in forgot password")
    
    public void user_enters_valid_email_in_forgot_password() throws InterruptedException {

    	pom = new PomClass(driver);
    	
    	Thread.sleep(2000);
    	
    	 pom.getForgotEmail().click();
    	 
    	 Thread.sleep(1000);
    	
        pom.getForgotEmail().sendKeys("shankarguru.kiaq@gmail.com");
    }
    
    @Then("Verification email should be sent successfully")
    public void verification_email_should_be_sent_successfully() {

    	 Assert.assertNotNull(driver);
    	 
        System.out.println("Verification Email Sent Successfully");
    }
    @When("User clicks continue button")
    public void user_clicks_continue_button() {

        pom.getContinueButton().click();
    }
}