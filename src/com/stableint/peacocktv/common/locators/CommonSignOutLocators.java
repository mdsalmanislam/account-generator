package com.stableint.peacocktv.common.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonSignOutLocators {
//	@FindBy(xpath = "//button[contains(@name,'my-account')]")
	
	@FindBy(xpath = "//button[contains(@aria-label,'My Account')]")
	public WebElement profPic;
	
	@FindBy(xpath = "//a[contains(@href,'/sign-out')]")
	public WebElement signOut;
}
