package com.neotech.reeviw03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass1;

public class task3 extends BaseClass1{
	public static void main(String[] args) throws InterruptedException {
		//
		setUp();
	//WebElement middleFrame=driver.findElement(By.xpath("//frame[@name='frame-left']"));
	//middleFrame.click();
	driver.switchTo().frame(0).switchTo().frame(1);
	Thread.sleep(2000);
	WebElement middle=driver.findElement(By.id("content"));
	middle.click();
	
	if(middle.isDisplayed()){
		System.out.println("Test is pass");
	}else {
		System.out.println("Test is not pas");
	}
	
		Thread.sleep(2000);
		
		
		
		
		tearDown();
	}

}
//	
//driver.switchTo().frame("frame1").switchTo().frame(0);

//WebElement insideChild=driver.findElement(By.xpath("//body/p"));

//System.out.println(insideChild.getText());	
