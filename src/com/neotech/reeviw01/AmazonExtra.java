package com.neotech.reeviw01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonExtra {
	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		
		String url="https://demoqa.com/text-box";
		driver.get(url);
		
		
		
		driver.findElement(By.cssSelector("input#userName")).sendKeys("Emine Firik");
		
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("firikemine82@gmail.com");
		
		
		driver.findElement(By.cssSelector(".form-control[id='currentAddress']")).sendKeys("144 paradise tree");
		driver.findElement(By.cssSelector(".form-control[id='permanentAddress']")).sendKeys("Avalon");
		driver.findElement(By.cssSelector("#submit")).click();
		Thread.sleep(6000);
		driver.quit();
		
		
		
		
	}

}
