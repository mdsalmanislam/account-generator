package com.stableint.peacocktv.common.actions;

import com.stableint.peacocktv.setupdriver.SetupDriver;

public class CommonVisitPageActions extends SetupDriver {

	public void visitPage(String accountType) {

		if (accountType.equals("free")) {
			driver.get("https://www.stable-int.peacocktv.com/freesignup");
		} else if (accountType.equals("premium")) {
			driver.get("https://www.stable-int.peacocktv.com/checkout?product%5B%5D=FT_D2C");
		} else if (accountType.equals("premiumPlus")) {
			driver.get(
					"https://www.stable-int.peacocktv.com/checkout?product%5B%5D=D2C_SUBSCRIPTION_MONTH&product%5B%5D=ADLITE_PDL_SUBSCRIPTION");
		}
	}
}