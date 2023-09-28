package com.neotech.reeviw01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQATask {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		String url="https://demoqa.com/text-box";
		
		driver.get(url);
		driver.findElement(By.id("userName")).sendKeys("Emine Firik");
		Thread.sleep(2000);
		
		driver.findElement(By.id("userEmail")).sendKeys("tunaeminee@hotmail");
		Thread.sleep(2000);
		
		driver.findElement(By.id("currentAddress")).sendKeys("14433 pardise");
		Thread.sleep(2000);
		
		driver.findElement(By.id("permanentAddress")).sendKeys("1333Tanja king");
		Thread.sleep(2000);
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
