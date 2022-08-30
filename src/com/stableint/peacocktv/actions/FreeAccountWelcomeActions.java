package com.stableint.peacocktv.actions;

import org.openqa.selenium.support.PageFactory;

import com.stableint.peacocktv.locators.FreeAccountWelcomeLocators;
import com.stableint.peacocktv.setupdriver.SetupDriver;

public class FreeAccountWelcomeActions extends SetupDriver {

//	SetupDriver setupDriver = new SetupDriver();
//	WebDriver driver = SetupDriver.driver;
	FreeAccountWelcomeLocators faswl;

	public FreeAccountWelcomeActions() {
		faswl = new FreeAccountWelcomeLocators();
		PageFactory.initElements(driver, faswl);
	}

	public void startWatching() throws InterruptedException {
		faswl.startWatching.click();
		Thread.sleep(5000);
	}
	
	public void signOutMethod() throws InterruptedException {
		faswl.profPic.click();
		faswl.signOut.click();
	}
}
