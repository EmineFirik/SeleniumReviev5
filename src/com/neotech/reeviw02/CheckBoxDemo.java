package com.neotech.reeviw02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass1;

public class CheckBoxDemo extends BaseClass1 {
	// Go to https://demoqa.com/automation-practice-form
	// Check Female
	// Select all the Hobbies
	// See if they are selected after you select each of them
	public static void main(String[] args) throws InterruptedException {

		setUp();
		driver.manage().window().maximize();

		driver.findElement(By.id("firstName")).sendKeys("Emine");
		driver.findElement(By.id("lastName")).sendKeys("Firik");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='hobbiesWrapper']//label")).click();
		List<WebElement> Hobbies = driver.findElements(By.xpath("//label[@class='custom-control-label']"));
		for (WebElement hob : Hobbies) {
			hob.click();
			Thread.sleep(2000);
		}
		tearDown();

	}

}
