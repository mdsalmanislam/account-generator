package com.stableint.peacocktv.common.actions;

import org.openqa.selenium.support.PageFactory;

import com.stableint.peacocktv.common.locators.CommonSignOutLocators;
import com.stableint.peacocktv.setupdriver.SetupDriver;

public class CommonSignOutActions extends SetupDriver {
	CommonSignOutLocators csol; 

	public CommonSignOutActions() {
		csol = new CommonSignOutLocators();
		PageFactory.initElements(driver, csol);
	}

	public void commonSignOutMethod() throws InterruptedException {
		csol.profPic.click();
		csol.signOut.click();
		Thread.sleep(5000);
	}
}
