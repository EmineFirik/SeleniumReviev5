package com.neotech.reeviw02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass1;

public class LoginSIS  extends BaseClass1{
	
	public static void main(String[] args) throws InterruptedException {
		
		
		setUp();
		
		WebElement userName=driver.findElement(By.id("tUsername"));
		userName.sendKeys("Admin");
		
		
		WebElement password=driver.findElement(By.id("tPassword"));
		password.sendKeys("Neotech$123");
		
		
		WebElement dropDown=driver.findElement(By.id("dAcademicYear_list"));
		dropDown.click();
		
		
		List<WebElement>options=driver.findElements(By.xpath("//select[@id='dAcademicYear_list']/option"));
		
		for( WebElement op:options) {
			op.click();
			Thread.sleep(1000);
		}
			
		
		WebElement login=driver.findElement(By.id("bLogin"));
		
		
		login.click();
		String expectUrl="http://neotechacademy-sis.com:9000/Test/AD/Main/MainPage.aspx";
		String actualUrl=driver.getCurrentUrl();
		if( expectUrl.equalsIgnoreCase(actualUrl)) {
			System.out.println("Test is pass");
		}else {
			System.out.println("Test is fail");
		}
		
		Thread.sleep(8000);
		tearDown();
	}
	

}
