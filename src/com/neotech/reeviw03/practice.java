package com.neotech.reeviw03;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass1;
import com.neotech.utils.ConfigsReader;

public class practice extends BaseClass1 {
	//1) Launch the link https://demoqa.com/browser-windows
	//2) Get the title of the main page
	//3) Click on the tabButton, windowButton and messageWindowButton
	//4) Switch the control of the webdriver to the opened windows
	//5) Print the window handle opened and close right after that
	//6) Quit the browser
	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		System.out.println(driver.getTitle());
		String mainHandleId = driver.getWindowHandle();
		
		driver.findElement(By.id("tabButton")).click();
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("messageWindowButton")).click();
		
		Set<String> vindowsHandle = driver.getWindowHandles();
		
		Iterator<String> it = vindowsHandle.iterator();
		
		while(it.hasNext()) {
			String handleId = it.next();
			if(!mainHandleId.equals(handleId)) {				
				driver.switchTo().window(handleId);
				Thread.sleep(1000);				
				System.out.println(handleId + " -> ");
				Thread.sleep(1000);
				driver.close();							
			}
		}
			
		Thread.sleep(2000);
		tearDown();
		
	}

}
