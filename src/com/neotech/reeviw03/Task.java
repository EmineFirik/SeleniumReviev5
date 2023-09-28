package com.neotech.reeviw03;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass1;

public class Task extends BaseClass1 {
	public static void main(String[] args) throws InterruptedException {
		setUp();

		System.out.println("First window handles: " + driver.getWindowHandle());
		System.out.println("Title ->" + driver.getTitle());

		driver.findElement(By.id("neo")).click();

		Set<String> windowsHandle = driver.getWindowHandles();
		
		Iterator<String> it = windowsHandle.iterator();
		String window1 = it.next();
		String window2 = it.next();
		System.out.println(window1 + " " + window2);
		driver.switchTo().window(window2);
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//a[text()='Apply Now!']")).click();
		Thread.sleep(2000);
		tearDown();
	}

}
