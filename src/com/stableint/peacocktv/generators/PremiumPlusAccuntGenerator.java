package com.stableint.peacocktv.generators;

import org.testng.annotations.Test;

import com.stableint.peacocktv.actions.PremiumAccountAlmostThereActions;
import com.stableint.peacocktv.actions.PremiumAccountCheckoutActions;
import com.stableint.peacocktv.common.actions.CommonHomePageActions;
import com.stableint.peacocktv.common.actions.CommonRegistrationFormsActions;
import com.stableint.peacocktv.common.actions.CommonSignOutActions;
import com.stableint.peacocktv.common.actions.CommonVisitPageActions;
import com.stableint.peacocktv.setupdriver.SetupDriver;

public class PremiumPlusAccuntGenerator extends SetupDriver {
	static PremiumAccountCheckoutActions paca;
	static CommonVisitPageActions cvpa;
	static CommonRegistrationFormsActions crfa;
	static PremiumAccountAlmostThereActions paata;
	static CommonSignOutActions csoa;
	static CommonHomePageActions chpa;

	PremiumPlusAccuntGenerator() {
		paca = new PremiumAccountCheckoutActions();
		cvpa = new CommonVisitPageActions();
		crfa = new CommonRegistrationFormsActions();
		paata = new PremiumAccountAlmostThereActions();
		csoa = new CommonSignOutActions();
		chpa = new CommonHomePageActions();
	}

	@Test(priority = 1)
	public void openBrowser() throws Exception {
		cvpa.visitPage("premiumPlus");
	}

	int i = 8080;

	@Test(priority = 2, invocationCount = 2, timeOut = 99999999)
	public void premiumAccountTest() throws Exception {
		crfa.CommonfillOutForm(i,"Premium Plus");
		i++;
		paca.premiumAccountCheckoutForm();
		//paata.almostThere();
		csoa.commonSignOutMethod();
		chpa.commonPremiumPlusSignupMethod();
	}

	@Test(priority = 3)
	public void closeDriver() throws Exception {
		//tearDownDriver();
	}
}
