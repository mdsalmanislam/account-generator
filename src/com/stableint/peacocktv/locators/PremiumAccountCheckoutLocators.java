package com.stableint.peacocktv.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PremiumAccountCheckoutLocators {

	@FindBy(xpath = "//input[@name='addresseeFirstName']")
	public WebElement firstName;

	@FindBy(xpath = "//input[@name='addresseeLastName']")
	public WebElement lastName;

	@FindBy(xpath = "//input[@name='addressLine3']")
	public WebElement addressLine1;

	@FindBy(xpath = "//input[@name='addressLine1']")
	public WebElement addressLine2;

	@FindBy(xpath = "//input[@name='town']")
	public WebElement city;

	@FindBy(xpath = "//select[@name='county']")
	public WebElement state;

	@FindBy(xpath = "//input[@name='postcode']")
	public WebElement zipcode;

	//a[starts-with(@href, "mylink")]
	@FindBy(xpath = "//iframe[starts-with(@id, 'spreedly-number-frame')]")
	public WebElement cardNumberIframe;

	@FindBy(xpath = "//input[@name='card_number']")
	public WebElement cardNumber;

	@FindBy(xpath = "//input[@name='expiry']")
	public WebElement cardExpiry;

	@FindBy(xpath = "//iframe[starts-with(@id, 'spreedly-cvv-frame')]")
	public WebElement cardCVVIframe;

	@FindBy(xpath = "//*[@id=\"cvv\"]")
	public WebElement cvv;

	@FindBy(xpath = "//button[contains(text(),'Pay Now')]")
	public WebElement payNow;

	@FindBy(xpath = "//*[@id=\"menu-my-account\"]")
	public WebElement profpicPremium;
	
	@FindBy(xpath = "//*[@id=\"subMenu-9fb603b2-c25a-11e9-bae2-0ff1472b9c0f\"]/li[3]/a")
	public WebElement signoutPremium;
}
