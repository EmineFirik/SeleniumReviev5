package com.neotech.reeviw03;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass1;

public class HandlengWindows extends BaseClass1{
//url=https://neotech.vercel.app/windows
	public static void main(String[] args) throws InterruptedException {
		setUp();
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.id("google")).click();
		Set<String >windowHandle=driver.getWindowHandles();
		
	Iterator<String>	it=windowHandle.iterator();
		
	String window1=it.next();
	String window2=it.next();
	System.out.println("Window1->"+ window1);
	System.out.println("Window2->"+ window2);
	
	driver.switchTo().window(window2);
	System.out.println(driver.getTitle());
	driver.findElement(By.id("APjFqb")).sendKeys("Emine");
		Thread.sleep(2000);
		tearDown();
	}
}
