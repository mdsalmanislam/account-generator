package com.stableint.peacocktv.testdatamanager.model;

import com.stableint.peacocktv.testdatamanager.CommonRegDataManager;

public class CommonRegistrationModel {

	public CommonRegDataManager crdm;

	public String Email;
	public String EmailExtension;
	public String Password;
	public String RePassword;
	public String FirstName;
	public String LastName;
	public String Gender;
	public String BirthYear;
	public String ZipCode;

	public CommonRegistrationModel() {

		crdm = new CommonRegDataManager();
		Email = crdm.getMapData("Email");
		EmailExtension = crdm.getMapData("EmailExtension");
		Password = crdm.getMapData("Password");
		RePassword = crdm.getMapData("RePassword");
		FirstName = crdm.getMapData("FirstName");
		LastName = crdm.getMapData("LastName");
		Gender = crdm.getMapData("Gender");
		BirthYear = crdm.getMapData("BirthYear");
		ZipCode = crdm.getMapData("ZipCode");

	}

}
