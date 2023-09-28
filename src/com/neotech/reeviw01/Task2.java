package com.neotech.reeviw01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();

		String url="https://demoQa.com/text-box";
		driver.get(url);
		
		
		driver.findElement(By.cssSelector("input#userName")).sendKeys("Emine Firik");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("emine@gmail.com");
		
		//Even there are 2 elements use this formula
		driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("14433paradise");
		
		///find element with multiple atributes
		driver.findElement(By.cssSelector("textarea[class='form-control'][id='currentAddress']")).sendKeys("Home");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button#submit")).click();
		
		Thread.sleep(1000);
		driver.quit();
		
	}

}
