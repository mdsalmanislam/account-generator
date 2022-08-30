package com.stableint.peacocktv.common.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.stableint.peacocktv.common.locators.CommonHomePageLocators;
import com.stableint.peacocktv.setupdriver.SetupDriver;

public class CommonHomePageActions extends SetupDriver {

	CommonHomePageLocators chpl;

	public CommonHomePageActions() {
		chpl = new CommonHomePageLocators();
		PageFactory.initElements(driver, chpl);
	}

	public void commonMoveToFreeSignUp() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)", "");
		Thread.sleep(3000);
	}

	public void commonFreeSignUpMethod() throws InterruptedException {
		chpl.freeSignUp.click();
	}

	public void commonPremiumSignupMethod() throws InterruptedException {
		chpl.premiumSignUp.click();
		Thread.sleep(7000);
	}
	
	public void commonPremiumPlusSignupMethod() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1900)", "");
		Thread.sleep(3000);
		chpl.premiumPlusSignUp.click();
		Thread.sleep(7000);
	}

}
