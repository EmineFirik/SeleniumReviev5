package com.neotech.reeviw01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmaczonSearchXpath {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver=new ChromeDriver();
		
		String url="https://www.amazon.com/";
		driver.get(url);
		
		
		WebElement searchtext=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchtext.sendKeys("Messi jersey");
		Thread.sleep(1000);
		
		WebElement searhButton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searhButton.click();
		Thread.sleep(3000);
		
		WebElement tshirt=driver.findElement(By.xpath("//img[@class='s-image']"));
		tshirt.click();
		Thread.sleep(1000);
		driver.quit();
	}

}
