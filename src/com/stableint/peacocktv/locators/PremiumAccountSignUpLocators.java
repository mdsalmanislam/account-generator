package com.stableint.peacocktv.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PremiumAccountSignUpLocators {

	@FindBy(xpath = "//*[@id=\"email\"]")
	public WebElement email;

	@FindBy(xpath = "//*[@id=\"password\"]")
	public WebElement password;

	@FindBy(xpath = "//*[@id=\"confirmPassword\"]")
	public WebElement repassword;

	@FindBy(xpath = "//*[@id=\"firstName\"]")
	public WebElement fname;

	@FindBy(xpath = "//*[@id=\"lastName\"]")
	public WebElement lname;

	@FindBy(xpath = "//*[@id=\"gender\"]")
	public WebElement gender;

	@FindBy(xpath = "//*[@id=\"birthYear\"]")
	public WebElement birthYear;

	@FindBy(xpath = "//*[@id=\"zipCode\"]")
	public WebElement zipCode;

	@FindBy(xpath = "//*[@id=\"terms\"]")
	public WebElement agreeCheckBox;

	@FindBy(xpath = "/html/body/div[3]/div/main/div[2]/div/div[1]/div/button")
	public WebElement submitButton;
	
}
