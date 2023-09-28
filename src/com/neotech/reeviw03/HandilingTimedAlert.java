package com.neotech.reeviw03;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass1;

public class HandilingTimedAlert extends BaseClass1 {
public static void main(String[] args) throws InterruptedException {
	setUp();
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
	wait.withTimeout(Duration.ofSeconds(10));
	wait.pollingEvery(Duration.ofSeconds(2));
	wait.ignoring(NoSuchElementException.class);
	
	WebElement alert=wait.until(ExpectedConditions.elementToBeClickable(By.id("btnAlert")));
	alert.click();
	
	Alert alertButton=driver.switchTo().alert();
	String alertText=alertButton.getText();
	System.out.println("The alert text is: "+alertText );
	alertButton.accept();
	
	WebElement alertDelay=wait.until(ExpectedConditions.elementToBeClickable(By.id("btnDelayedAlert")));
	Alert delay=driver.switchTo().alert();
	delay.accept();
	
	tearDown();
	
	
}
}
