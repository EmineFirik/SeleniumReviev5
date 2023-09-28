package com.neotech.reeviw01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		String url="https://www.instagram.com/";
		
		driver.get(url);
		driver.navigate().to(url);
		driver.manage().window().fullscreen();
		
		driver.navigate().to("https://www.mlssoccer.com/");
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.fifa.com/");
		Thread.sleep(1000);
		
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		
		
		
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		
		
		
		
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.quit();
		
	}

}
