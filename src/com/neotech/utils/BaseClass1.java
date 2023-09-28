package com.neotech.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass1 {
	
	public static WebDriver driver;

	/**
	 * This method will initialize the driver
	 */

	public static void setUp() {

		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		
		switch (ConfigsReader.getProperty("browser").toLowerCase()) {

		case "chrome":
			// System.setProperty("webdriver.chrome.driver",Constants.CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
			break;

		case "firefox":
			// System.setProperty("webdriver.gecko.driver",Constants.GECKO_DRIVER_PATH);
			driver = new FirefoxDriver();
			break;
		default:
			throw new RuntimeException("Other browser are not supported!");
		}
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));
		driver.manage().window().maximize();
		driver.get(ConfigsReader.getProperty("url"));

	}

	/**
	 * This method will quite the browser
	 */
	public static void tearDown() {
		if (driver != null) 
			driver.quit();
		
	}
}
//eger safariyide eklemek istersen safariyide ekleyeceksin