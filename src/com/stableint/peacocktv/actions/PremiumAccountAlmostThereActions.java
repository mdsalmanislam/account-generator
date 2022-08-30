package com.stableint.peacocktv.actions;

import org.openqa.selenium.support.PageFactory;

import com.stableint.peacocktv.locators.PremiumAccountAlmostThereLocators;
import com.stableint.peacocktv.setupdriver.SetupDriver;

public class PremiumAccountAlmostThereActions extends SetupDriver{

	PremiumAccountAlmostThereLocators paatl;

	public PremiumAccountAlmostThereActions() {
		paatl = new PremiumAccountAlmostThereLocators();
		PageFactory.initElements(driver, paatl);
	}

	public void almostThere() throws InterruptedException {
		paatl.payNow.click();
		Thread.sleep(5000);
	}
}
