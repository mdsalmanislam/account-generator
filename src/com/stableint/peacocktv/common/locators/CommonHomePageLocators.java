package com.stableint.peacocktv.common.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonHomePageLocators {

	@FindBy(xpath = "//span[contains(text(),'Sign Up For Peacock')]")
	public WebElement freeSignUp;

	@FindBy(xpath = "//a[contains(text(),'Join Peacock')]")
	public WebElement premiumSignUp;
	
	@FindBy(xpath = "//span[contains(text(),'Get Premium Plus')]")
	public WebElement premiumPlusSignUp;

}
