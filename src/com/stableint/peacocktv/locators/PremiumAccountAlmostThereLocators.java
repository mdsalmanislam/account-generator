package com.stableint.peacocktv.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PremiumAccountAlmostThereLocators {
	@FindBy(xpath = "//button[contains(text(),'Pay Now')]")
	public WebElement payNow;
}
