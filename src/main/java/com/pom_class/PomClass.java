package com.pom_class;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {

	WebDriver driver;

	public PomClass(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Email Text Box
	@FindBy(xpath = "//input[@placeholder='Enter email ID']")
	WebElement email;

	@FindBy(xpath = "//input[@placeholder='Enter Password']")
	WebElement password;

	// Sign In Button
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signin;

	// eyeIcon

	@FindBy(xpath = "(//span[contains(@class,'cursor-pointer')])[1]")
	WebElement eyeIcon;

	// forgotPassword

	@FindBy(xpath = "//span[@class=' hover:underline cursor-pointer']")
	WebElement forgotPassword;

	@FindBy(name = "email")
	WebElement forgotEmail;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement continueButton;

	// vendorOnaboarding module

	@FindBy(xpath = "//*[contains(text(),'Vendor Onboarding')]")
	WebElement vendorOnboarding;

	@FindBy(xpath = "//input[@name='vendorName']")
	WebElement vendorName;

	@FindBy(xpath = "//input[@name='phoneNumber']")
	WebElement phoneNumber;

	@FindBy(xpath = "//button[contains(text(),'Next')]")
	WebElement submit;

	// VendorBusinessinfoValidation
	@FindBy(xpath = "//input[@name='businessName']")
	WebElement businessName;

	@FindBy(xpath = "//input[@name='businessType']")
	WebElement businessType;

	@FindBy(xpath = "//input[@id='react-select-2-input']")
	WebElement serviceCategory;

	// VendorAddressdetails
	@FindBy(xpath = "//textarea[@placeholder='Address']")
	WebElement Address;

	@FindBy(xpath = "//input[@name ='pincode']")
	WebElement pincode;

	@FindBy(xpath = "//input[@name ='city']")
	WebElement city;

	@FindBy(xpath = "//input[@name ='state']")
	WebElement state;

	// BusinessDetails
	@FindBy(xpath = "//*[contains(text(),'Business Details')]")
	WebElement BusinessDetails;

	// Operating Hours

	@FindBy(xpath = "//input[@name='weekdaysOpen']")
	WebElement weekdayOpeningTime;

	@FindBy(xpath = "//input[@name='weekdaysClose']")
	WebElement weekdayClosingTime;

	@FindBy(xpath = "//input[@name='saturdayOpen']")
	WebElement saturdayOpeningTime;

	@FindBy(xpath = "//input[@name='saturdayClose']")
	WebElement saturdayClosingTime;

	// Team Details

	@FindBy(xpath = "//input[@name='totalStaff']")
	WebElement totalStaff;

	@FindBy(xpath = "//input[@name='technicians']")
	WebElement technicians;

	@FindBy(xpath = "//input[@name='supportStaff']")
	WebElement supportStaff;

	// Service Information

	@FindBy(xpath = "//textarea[@type='textarea']")
	WebElement servicesOffered;

	@FindBy(xpath = "//input[@placeholder='Emergency Plumbing, Commercial Projects']")
	WebElement specialization;

	@FindBy(xpath = "//input[@placeholder='ISI Certified, Licensed Plumber']")
	WebElement certification;

	@FindBy(xpath = "//input[@name='yearsOfExperience']")
	WebElement yearsOfExperience;

	// Pricing Information

	@FindBy(xpath = "//input[@name='priceRange']")
	WebElement priceRange;

	@FindBy(xpath = "//input[contains(@name,'call')]")
	WebElement callOutCharges;

	@FindBy(xpath = "//input[contains(@name,'min')]")
	WebElement minServiceCharge;

	// Service Coverage

	@FindBy(xpath = "//input[@name='serviceRadius']")
	WebElement serviceRadius;

	@FindBy(xpath = "//input[@name='pincode']")
	WebElement coveragePincode;

	@FindBy(xpath = "//input[@name='areaName']")
	WebElement areaName;

	// Payment Method

	@FindBy(xpath = "//*[text()='UPI']")
	WebElement upi;

	@FindBy(xpath = "//*[text()='Cash']")
	WebElement cash;

	@FindBy(xpath = "//*[text()='Card']")
	WebElement card;

	@FindBy(xpath = "//*[text()='Bank Transfer']")
	WebElement bankTransfer;

	// Save Button

	@FindBy(xpath = "//button[contains(text(),'Save Business Details')]")
	WebElement saveBusinessDetails;

	// Daily Activity Log

	@FindBy(xpath = "//*[contains(text(),'Activity Log')]")
	WebElement activityLog;

	@FindBy(xpath = "//input[@name='date']")
	WebElement activityDate;

	@FindBy(xpath = "//input[@name='activityType']")
	WebElement activityType;

	// Daily Summary

	@FindBy(xpath = "//h3[text()='Vendors Visited']")
	WebElement vendorsvisited;

	@FindBy(xpath = "//h3[text()='Total Activities']")
	WebElement totalactivities;

	@FindBy(xpath = "//h3[text()='First Activity']")
	WebElement firstactivity;

	@FindBy(xpath = "//h3[text()='Last Activity']")
	WebElement lastactivity;

	// Attendance Module

	@FindBy(xpath = "//button[contains(text(),'Attendance')]")
	WebElement attendance;

	@FindBy(xpath = "//button[contains(text(),'Check In')]")
	WebElement checkInButton;

//	@FindBy(xpath = "//button[text()='Check Out']")
//	WebElement checkOutStatus;

	@FindBy(xpath = "//button[text()='Today']")
	WebElement today;

	@FindBy(xpath = "//button[text()='History']")
	WebElement history;

	@FindBy(xpath = "//button[text()='Calendar']")
	WebElement calendar;

	@FindBy(xpath = "//button[text()='Report']")
	WebElement report;

	// Map Navigation

	@FindBy(xpath = "//button[text()='Map Navigation']")
	WebElement mapnavigation;

	@FindBy(xpath = "//h3[text()='Optimal Route']")
	WebElement optimalroute;

	@FindBy(xpath = "//h3[text()='Priority Based']")
	WebElement prioritybased;

	@FindBy(xpath = "//h3[text()='Custom Order']")
	WebElement customorder;

	@FindBy(xpath = "//button[text()='Open In Google Maps']")
	WebElement openmap;

	@FindBy(xpath = "//button[text()='Start Navigation']")
	WebElement startnavigation;

	@FindBy(xpath = "//button[text()='Navigate']")
	List<WebElement> navigateButtons;

	// login module

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEyeIcon() {
		return eyeIcon;
	}

	public WebElement getForgotPassword() {
		return forgotPassword;
	}

	public WebElement getForgotEmail() {
		return forgotEmail;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	// VendorOnboarding module

	public WebElement getVendorOnboarding() {
		return vendorOnboarding;
	}

	public WebElement getVendorName() {
		return vendorName;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getNextButton() {
		return submit;
	}

	// VendorBusinessinfoValidation
	public WebElement getbusinessName() {
		return businessName;
	}

	public WebElement getbusinessType() {
		return businessType;
	}

	public WebElement getserviceCategory() {
		return serviceCategory;
	}

	// VendorAddressdetails
	public WebElement getAddress() {
		return Address;
	}

	public WebElement getpincode() {
		return pincode;
	}

	public WebElement getcity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	// BusinessDetails

	public WebElement getBusinessDetails() {
		return BusinessDetails;
	}

	public WebElement getWeekdayOpeningTime() {
		return weekdayOpeningTime;
	}

	public WebElement getWeekdayClosingTime() {
		return weekdayClosingTime;
	}

	public WebElement getSaturdayOpeningTime() {
		return saturdayOpeningTime;
	}

	public WebElement getSaturdayClosingTime() {
		return saturdayClosingTime;
	}

	public WebElement getTotalStaff() {
		return totalStaff;
	}

	public WebElement getTechnicians() {
		return technicians;
	}

	public WebElement getSupportStaff() {
		return supportStaff;
	}

	public WebElement getServicesOffered() {
		return servicesOffered;
	}

	public WebElement getSpecialization() {
		return specialization;
	}

	public WebElement getCertification() {
		return certification;
	}

	public WebElement getYearsOfExperience() {
		return yearsOfExperience;
	}

	public WebElement getPriceRange() {
		return priceRange;
	}

	public WebElement getCallOutCharges() {
		return callOutCharges;
	}

	public WebElement getMinServiceCharge() {
		return minServiceCharge;
	}

	public WebElement getServiceRadius() {
		return serviceRadius;
	}

	public WebElement getCoveragePincode() {
		return coveragePincode;
	}

	public WebElement getAreaName() {
		return areaName;
	}

	public WebElement getUPI() {
		return upi;
	}

	public WebElement getSaveBusinessDetails() {
		return saveBusinessDetails;
	}

	// Daily Activity Log

	public WebElement getActivityLog() {
		return activityLog;
	}

	public WebElement getActivityDate() {
		return activityDate;
	}

	public WebElement getActivityType() {
		return activityType;
	}
	// Daily Summary

	public WebElement getVendorsVisited() {
		return vendorsvisited;
	}

	public WebElement getTotalActivities() {
		return totalactivities;
	}

	public WebElement getFirstActivity() {
		return firstactivity;
	}

	public WebElement getLastActivity() {
		return lastactivity;
	}

	// Attendance Module

	public WebElement getAttendance() {
		return attendance;
	}

	public WebElement getcheckInButton() {
		return checkInButton;
	}

//	public WebElement getcheckOutStatus() {
//		return checkOutStatus;
//	}

	public WebElement getToday() {
		return today;
	}

	public WebElement getHistory() {
		return history;
	}

	public WebElement getCalendar() {
		return calendar;
	}

	public WebElement getReport() {
		return report;
	}
	
	//Map Navigation
	
	public WebElement getMapNavigation() {
		return mapnavigation;
	}
	
	public WebElement getOptimalRoute() {
		return optimalroute;
	}
	
	public WebElement getPriorityBased() {
		return prioritybased;
	}
	
	public WebElement getCustomOrder() {
		return customorder;
	}
	
	public WebElement getOpenInGoogleMaps() {
		return openmap;
	}
	
	public WebElement getStartNavigation() {
		return startnavigation;
	}
	
	public List<WebElement> getNavigateButtons() {
	    return navigateButtons;
	}
}