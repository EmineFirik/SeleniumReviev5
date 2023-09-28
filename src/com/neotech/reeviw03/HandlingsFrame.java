package com.neotech.reeviw03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass1;

public class HandlingsFrame extends BaseClass1{
public static void main(String[] args) throws InterruptedException {
	//https://the-internet.herokuapp.com/iframe
	setUp();
	
	
	driver.switchTo().frame("mce_0_ifr");
	
	WebElement text=driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
	text.click();
	
	text.clear();
	
	text.sendKeys("Emine");
	
	driver.switchTo().defaultContent();
	
	
	
	
	Thread.sleep(2000);
	tearDown();
}
}
