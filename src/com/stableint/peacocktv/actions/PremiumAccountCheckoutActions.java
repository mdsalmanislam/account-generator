package com.stableint.peacocktv.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.stableint.peacocktv.locators.PremiumAccountCheckoutLocators;
import com.stableint.peacocktv.setupdriver.SetupDriver;
import com.stableint.peacocktv.testdatamanager.model.CheckoutPageModel;

public class PremiumAccountCheckoutActions extends SetupDriver {
	PremiumAccountCheckoutLocators pacl;
	CheckoutPageModel cpm;
	
	
	public PremiumAccountCheckoutActions() {
		cpm = new CheckoutPageModel();
		pacl = new PremiumAccountCheckoutLocators();
		PageFactory.initElements(driver, pacl);
	}

	public void premiumAccountCheckoutForm() throws Exception {

		pacl.firstName.sendKeys(cpm.firstname);
		pacl.lastName.sendKeys(cpm.lastname);
		pacl.addressLine1.sendKeys(cpm.addressLine1);
		pacl.addressLine2.sendKeys(cpm.addressLine2);
		pacl.city.sendKeys(cpm.city);

		Select statedropdown = new Select(pacl.state);
		statedropdown.selectByVisibleText(cpm.state);

		pacl.zipcode.sendKeys(cpm.zipcode);
		driver.switchTo().frame(pacl.cardNumberIframe);
		Thread.sleep(2000);
		pacl.cardNumber.sendKeys(cpm.cardnumber);
		driver.switchTo().parentFrame();
		pacl.cardExpiry.sendKeys(cpm.expiry);
		driver.switchTo().frame(pacl.cardCVVIframe);
		pacl.cvv.sendKeys(cpm.cvv);
		driver.switchTo().parentFrame();
		pacl.payNow.click();
		Thread.sleep(15000);
	}
}
