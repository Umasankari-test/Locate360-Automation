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
    
    public void user_enters_credentials() {       
        pom.getEmail().sendKeys("testing.field@gmail.com");
        pom.getPassword().sendKeys("Test@1234");        
    }
    
    //invalid email
    
    @When("User enters {string} and {string}")
    public void user_enters_and(String email, String password) {

        pom.getEmail().sendKeys(email);
        pom.getPassword().sendKeys(password);
    }

    @When("User clicks signin button")
    
    public void user_clicks_signin_button() {
        pom.getSignin().click();     
    }
    
    @Then("User should navigate to field executive dashboard")
    public void user_should_navigate_to_home_page() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.urlContains("/dashboard"));

        String currentUrl = driver.getCurrentUrl();

        System.out.println("Current URL : " + currentUrl);

        Assert.assertEquals(
            "https://drctuaap3xvtm.cloudfront.net/dashboard",
            currentUrl
        );

        System.out.println("Login Successful");
    }
    

    @Then("Error message should be displayed")
    public void error_message_should_be_displayed() {

        String currentUrl = driver.getCurrentUrl();

        System.out.println("Current URL : " + currentUrl);

        Assert.assertTrue(currentUrl.contains("cloudfront"));

        System.out.println("Error Message Displayed");
    }
     
    //blank email
    
    @When("User leaves email blank")
    public void user_leaves_email_blank() {
        pom.getEmail().sendKeys("");
    }
    
    //blank password
    
    @When("User leaves password blank")
    public void user_leaves_password_blank() {
        pom.getPassword().sendKeys("");
    }
    }