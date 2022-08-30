package com.stableint.peacocktv.common.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonRegistrationLocators {

	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	public WebElement consentContinue;

	@FindBy(xpath = "//input[@name='email']")
	public WebElement email;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement password;

	@FindBy(xpath = "//input[@name='confirmPassword']")
	public WebElement repassword;

	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement fname;

	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement lname;

	@FindBy(xpath = "//select[@name='gender']")
	public WebElement gender;

	@FindBy(xpath = "//select[@name='birthYear']")
	public WebElement birthYear;

	@FindBy(xpath = "//input[@name='zipCode']")
	public WebElement zipCode;

	@FindBy(xpath = "//button[contains(text(),'Create Account')]")
	public WebElement submitButton;

}
