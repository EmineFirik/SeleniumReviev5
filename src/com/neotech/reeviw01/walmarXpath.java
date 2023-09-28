package com.neotech.reeviw01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class walmarXpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		String url="https://www.costco.com/";
		driver.get(url);
		
		WebElement search=driver.findElement(By.cssSelector("input#search-field"));
		search.sendKeys("dining table set");
		Thread.sleep(3000);
		
		WebElement register=driver.findElement(By.cssSelector("a#header_order_and_returns"));
		register.click();
		Thread.sleep(3000);
		
		WebElement email=driver.findElement(By.cssSelector("input#signInName"));
		email.sendKeys("tunaemine@hotmail.com");
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.cssSelector("input#password"));
		password.sendKeys("1234ef");
		Thread.sleep(3000);
		
		WebElement forgotpassword=driver.findElement(By.cssSelector("button#PasswordResetUsingEmailAddressExchange"));
		forgotpassword.click();
		Thread.sleep(3000);
		
		WebElement signIn=driver.findElement(By.cssSelector("button#next"));
		signIn.click();
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
	}

}
