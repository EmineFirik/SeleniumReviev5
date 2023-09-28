package com.neotech.reeviw03;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass1;

public class task2  extends BaseClass1{
	public static void main(String[] args) throws InterruptedException {
		//url=https://neotech.vercel.app/windows
		setUp();
		
		System.out.println("First window handles: " + driver.getWindowHandle());
		System.out.println("Title ->" + driver.getTitle());

		driver.findElement(By.id("neo")).click();
		driver.findElement(By.id("tinyWindow")).click();
		Set<String> allHandles = driver.getWindowHandles();
		
		
		Iterator<String>it=allHandles.iterator();
		
		String window1=it.next();
		
		String window2=it.next();
		String window3=it.next();
		System.out.println(window1+ " "+window2+ " "+ window3);
		
		for( int i=1; i<=10; i++) {
			driver.switchTo().window(window1);
			Thread.sleep(4000);
			driver.switchTo().window(window2);
			
			Thread.sleep(4000);
		}
		driver.close();
		
		
		
		tearDown();
	}
	
	
	
	

}
