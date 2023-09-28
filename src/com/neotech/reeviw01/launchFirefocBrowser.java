package com.neotech.reeviw01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchFirefocBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		
		//System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver");
		WebDriver driver=new FirefoxDriver();
		
		
		
		String url="https://www.nytimes.com/games/wordle/index.html"
				+ "";
		driver.get(url);
		
		Thread.sleep(1000);
		String curentURL=driver.getCurrentUrl();
		if( url.equals(curentURL)) {
			System.out.println("Url is are same");
		}else {
			System.out.println("Url is difrent");
		}
		
		String title=driver.getTitle();
		System.out.println(title);
		//System.out.println(url);
		//System.out.println(curentURL);
		
		driver.quit();
		
	}

}
