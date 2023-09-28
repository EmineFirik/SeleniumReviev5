package com.neotech.reeviw01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TDBank {
	public static void main(String[] args) throws InterruptedException {
		
		

		WebDriver driver=new ChromeDriver();
		
		String url="https://www.td.com/us/en/personal-banking";
		driver.get(url);
		
		driver.findElement(By.className("cmp-button__text")).click();
		Thread.sleep(1000);
		driver.quit();
		
		driver.findElement(By.xpath("//input[@id='psudoUsername']")).sendKeys("firikemine");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("1234emi");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("")).click();
		Thread.sleep(1000);
		
	}

}
