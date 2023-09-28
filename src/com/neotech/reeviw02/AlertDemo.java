package com.neotech.reeviw02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass1;

public class AlertDemo extends BaseClass1{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		//When alert is open we can not interact with the 
		driver.findElement(By.name("confirmalertbox")).click();
		Alert Comfirmalert=driver.switchTo().alert();
		
		System.out.println("The text of the Alert "+ Comfirmalert.getText());
		
		 //Comfirmalert.dismiss();
		
		 Comfirmalert.accept();
		//Comfirmalert.sendKeys("alert is working");
		 
		//driver.findElement(By.name("promptalertbox1234")).click();boyle bir alerte cevap vermeden ikinci alerti yazamazsin
		
		 driver.findElement(By.name("promptalertbox1234")).click();
		Alert swich=driver.switchTo().alert();
	System.out.println("Accept the alert "+ swich.getText());
		swich.sendKeys("Yes");
		swich.accept();
		
		Thread.sleep(2000);
		tearDown();
		
		
	}
	
	
}
