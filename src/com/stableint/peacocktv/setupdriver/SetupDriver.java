package com.stableint.peacocktv.setupdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.stableint.peacocktv.propertiesmanager.PropertiesManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDriver extends PropertiesManager {

	public static PropertiesManager pm = new PropertiesManager();
	public static WebDriver driver = getDriver();

	public static WebDriver getDriver() {

		if (pm.getBrowser().equals("chrome")) {

			ChromeOptions options = new ChromeOptions();
			//options.addArguments("--headless");

			WebDriverManager.chromedriver().setup();
			options.addArguments("--start-maximized");
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
		}

		else if (pm.getBrowser().equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (pm.getBrowser().equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		else if (pm.getBrowser().equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}

		else if (pm.getBrowser().equals("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		}
		return driver;
	}

	public static void tearDownDriver() {
		driver.quit();
	}
}
