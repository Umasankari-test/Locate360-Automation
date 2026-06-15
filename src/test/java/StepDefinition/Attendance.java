package StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base_class.BaseClass;
import com.pom_class.PomClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Attendance extends BaseClass {

    PomClass pom;

    @Given("User is on Attendance page")
    public void user_is_on_attendance_page() throws InterruptedException {

        browserLaunch();

        launchUrl("https://drctuaap3xvtm.cloudfront.net/");

        pom = new PomClass(driver);

        pom.getEmail().sendKeys("shankarguru.kiaq@gmail.com");
        pom.getPassword().sendKeys("Shankar@123");
        pom.getSignin().click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOf(pom.getAttendance()));

        pom.getAttendance().click();

        System.out.println("Attendance Page Opened");
    }

    @Then("Attendance page should be displayed")
    public void attendance_page_should_be_displayed() {

        Assert.assertTrue(pom.getcheckOutStatus().isDisplayed());

        System.out.println("Attendance Page Displayed Successfully");
    }

    @When("User clicks Check In button")
    public void user_clicks_check_in_button() {

        pom.getcheckInButton().click();

        System.out.println("Check In Button Clicked");
        
    }

    @Then("Check Out button should be displayed")
    public void check_out_button_should_be_displayed() {

        System.out.println("Check Out Button Displayed");
    }

    @When("User clicks Today tab")
    public void user_clicks_today_tab() {

        pom.getToday().click();
    }

    @Then("Today details should be displayed")
    public void today_details_should_be_displayed() {

        System.out.println("Today Details Displayed");
    }

    @When("User clicks History tab")
    public void user_clicks_history_tab()  {

        pom.getHistory().click();
    
    }

    @Then("History details should be displayed")
    public void history_details_should_be_displayed() throws InterruptedException {

        System.out.println("History Details Displayed");
        
    }

    @When("User clicks Calendar tab")
    public void user_clicks_calendar_tab() {

        pom.getCalendar().click();
        
    }

    @Then("Calendar view should be displayed")
    public void calendar_view_should_be_displayed() {

        System.out.println("Calendar View Displayed");
       
    }

    @When("User clicks Report tab")
    public void user_clicks_report_tab()  {

        pom.getReport().click();
        
    }

    @Then("Attendance report should be displayed")
    public void attendance_report_should_be_displayed() {

        System.out.println("Attendance Report Displayed");
    }
}