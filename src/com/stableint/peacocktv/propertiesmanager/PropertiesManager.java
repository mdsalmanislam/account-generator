package com.stableint.peacocktv.propertiesmanager;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesManager {

	public static Properties prop;
	public static InputStream ins;
	public String browserName;

	public static String browser;

	public PropertiesManager() {
		getBrowser();
	}

	public void loadConfig() {
		prop = new Properties();
		String projectPath = System.getProperty("user.dir");
		try {
			ins = new FileInputStream(projectPath + "/properties/configuration.properties");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getBrowser() {
		loadConfig();
		try {
			prop.load(ins);
		} catch (IOException e) {
			e.printStackTrace();
		}
		browser = prop.getProperty("browser");
		return browser;
	}

}
