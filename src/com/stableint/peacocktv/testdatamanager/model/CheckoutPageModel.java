package com.stableint.peacocktv.testdatamanager.model;

import com.stableint.peacocktv.testdatamanager.CheckoutTestDataManager;

public class CheckoutPageModel {

	public CheckoutTestDataManager ctdm;

	public String firstname;
	public String lastname;
	public String addressLine1;
	public String addressLine2;
	public String city;
	public String state;
	public String zipcode;
	public String cardnumber;
	public String expiry;
	public String cvv;

	public CheckoutPageModel() {
		ctdm = new CheckoutTestDataManager();
		firstname = ctdm.getMapData("FirstName");
		lastname = ctdm.getMapData("LastName");
		addressLine1 = ctdm.getMapData("AdressLine1");
		addressLine2 = ctdm.getMapData("AdressLine2");
		city = ctdm.getMapData("City");
		state = ctdm.getMapData("State");
		zipcode = ctdm.getMapData("ZipCode");
		cardnumber = ctdm.getMapData("CCNumber");
		expiry = ctdm.getMapData("Expiry");
		cvv = ctdm.getMapData("CVV");
	}

}
