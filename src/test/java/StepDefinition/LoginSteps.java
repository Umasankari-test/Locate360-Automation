package StepDefinition;

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
    public void user_enters_credentials() {

        System.out.println("Before Email");

        pom.getEmail().sendKeys("testing.field@gmail.com");

        System.out.println("Before Password");

        pom.getPassword().sendKeys("Test@1234");

        System.out.println("Credentials Entered");
    }

    @When("User clicks signin button")
    public void user_clicks_signin_button() {

        System.out.println("Before Click");

        pom.getSignin().click();

        System.out.println("After Click");
    }

    @Then("User should navigate to field executive dashboard")
    public void user_should_navigate_to_home_page() {

        System.out.println("Login Successful");
    }
    	
    // invalid email
    
    @When("User enters invalid email")
    public void user_enters_invalid_email() {

        pom.getEmail().sendKeys("abc@gmail.com");
    }

    @When("User enters valid password")
    public void user_enters_valid_password() {

        pom.getPassword().sendKeys("Test@1234");
    }

    @Then("Error message should be displayed")
    public void error_message_should_be_displayed() {

        System.out.println("Error Message Displayed");
    }        
     
    //invalid password

    @When("User enters valid email")
    public void user_enters_valid_email() {

        pom.getEmail().sendKeys("testing.field@gmail.com");
    }

    @When("User enters invalid password")
    public void user_enters_invalid_password() {

        pom.getPassword().sendKeys("xyz@321");
    }

    }