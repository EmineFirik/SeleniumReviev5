package com.neotech.reeviw01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchCss {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();

		String url="https://www.amazon.com/";
		driver.get(url);
		
		
		WebElement textSearch=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		textSearch.sendKeys("Messi Jersey");
		Thread.sleep(1000);
		
		WebElement serchButton=driver.findElement(By.cssSelector("input[id='nav-search-submit-button']"));
		serchButton.click();
		Thread.sleep(1000);
	

		WebElement shopping=driver.findElement(By.cssSelector("span#nav-cart-count"));
		shopping.click();
		Thread.sleep(1000);
		driver.quit();
	}

}
