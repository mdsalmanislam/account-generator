package com.stableint.peacocktv.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FreeAccountWelcomeLocators {
	@FindBy(xpath = "//a[contains(@href,'/watch/home')]")
	public WebElement startWatching;
	
	@FindBy(xpath = "//button[contains(@name,'my-account')]")
	public WebElement profPic;
	
	@FindBy(xpath = "//a[contains(@href,'/sign-out')]")
	public WebElement signOut;
	
}
