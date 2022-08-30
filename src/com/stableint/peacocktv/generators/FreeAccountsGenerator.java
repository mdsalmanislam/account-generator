package com.stableint.peacocktv.generators;

import org.testng.annotations.Test;

import com.stableint.peacocktv.actions.FreeAccountWelcomeActions;
import com.stableint.peacocktv.common.actions.CommonHomePageActions;
import com.stableint.peacocktv.common.actions.CommonRegistrationFormsActions;
import com.stableint.peacocktv.common.actions.CommonSignOutActions;
import com.stableint.peacocktv.common.actions.CommonVisitPageActions;
import com.stableint.peacocktv.setupdriver.SetupDriver;

public class FreeAccountsGenerator extends SetupDriver {

	static CommonVisitPageActions cvpa;
	static CommonRegistrationFormsActions crfa;
	static CommonSignOutActions csoa;
	static FreeAccountWelcomeActions fawa;
	static CommonHomePageActions chpa;

	FreeAccountsGenerator() {
		cvpa = new CommonVisitPageActions();
		crfa = new CommonRegistrationFormsActions();
		csoa = new CommonSignOutActions();
		fawa = new FreeAccountWelcomeActions();
		chpa = new CommonHomePageActions();
	}

	@Test(priority = 1)
	public void openBrowser() throws Exception {
		cvpa.visitPage("free");
	}

	int i = 11010;

	// threadPoolSize = 1, invocationCount = 5, timeOut = 5000
	@Test(priority = 2, invocationCount = 2, timeOut = 99999999)
	public void freeAccountTest() throws Exception {
		crfa.CommonfillOutForm(i,"Free");
		i++;
		csoa.commonSignOutMethod();
		chpa.commonMoveToFreeSignUp();
		chpa.commonFreeSignUpMethod();
	}

	@Test(priority = 3)
	public void closeDriver() {
		//tearDownDriver();
	}
}