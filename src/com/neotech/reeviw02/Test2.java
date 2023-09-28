package com.neotech.reeviw02;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass1;
import com.neotech.utils.ConfigsReader;

public class Test2 extends BaseClass1 {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		
		BaseClass1.driver.findElement(By.id("email")).sendKeys(ConfigsReader.getProperty("username"));
		Thread.sleep(2000);
		
		BaseClass1.driver.findElement(By.id("pass")).sendKeys(ConfigsReader.getProperty("password"));
		Thread.sleep(2000);
		
		BaseClass1.driver.findElement(By.name("login")).click();
		Thread.sleep(6000);
		
		
		String ecpectURL="https://www.facebook.com/";
		String actualUrl=driver.getCurrentUrl();
		if( ecpectURL.equalsIgnoreCase(actualUrl)) {
			System.out.println("Test is pass");
		}else {
			System.out.println("Test is fail");
		}
		
		tearDown();
		
	}

}
