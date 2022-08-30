package com.stableint.peacocktv.common.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.stableint.peacocktv.apicalls.GlobalAccess;
import com.stableint.peacocktv.common.locators.CommonRegistrationLocators;
import com.stableint.peacocktv.outputmanager.WriteExcelSheetManager;
import com.stableint.peacocktv.setupdriver.SetupDriver;
import com.stableint.peacocktv.testdatamanager.model.CommonRegistrationModel;

public class CommonRegistrationFormsActions extends SetupDriver {

	CommonRegistrationLocators crl;
	CommonRegistrationModel crm;
	GlobalAccess ga;
	WriteExcelSheetManager wesm;

	public CommonRegistrationFormsActions() {
		ga = new GlobalAccess();
		crm = new CommonRegistrationModel();
		crl = new CommonRegistrationLocators();
		wesm = new WriteExcelSheetManager();
		PageFactory.initElements(driver, crl);
	}

	public void CommonfillOutForm(int i, String accType) throws Exception {
		Thread.sleep(5000);
		try {
			crl.consentContinue.click();
		} catch (Exception e) {
		}
		crl.email.sendKeys(crm.Email + "+" + i + crm.EmailExtension);
		crl.password.sendKeys(crm.Password);
		//crl.repassword.sendKeys(crm.RePassword);
		crl.fname.sendKeys(crm.FirstName);
		crl.lname.sendKeys(crm.LastName);
		Select genderdropdown = new Select(crl.gender);
		genderdropdown.selectByVisibleText(crm.Gender);

		Select birtyeardropdown = new Select(crl.birthYear);
		birtyeardropdown.selectByVisibleText(crm.BirthYear);

		crl.zipCode.sendKeys(crm.ZipCode);
		// crl.agreeCheckBox.click();
		crl.submitButton.click();
		Thread.sleep(7000);

//		System.out.println(crm.Email + "+" + i + crm.EmailExtension);
//		System.out.println(crm.Password);

		// Enable Global Access
		ga.enableGlobalAccess(ga.getProfileID(crm.Email + "+" + i + crm.EmailExtension));

		// Write Excel Sheet
		wesm.writeDataMethod(crm.Email + "+" + i + crm.EmailExtension, crm.Password,
				ga.getProfileID(crm.Email + "+" + i + crm.EmailExtension),
				ga.enableGlobalAccess(ga.getProfileID(crm.Email + "+" + i + crm.EmailExtension)), accType);
	}
}
