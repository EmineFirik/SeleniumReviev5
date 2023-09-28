package com.neotech.reeviw03;

import java.awt.Label;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass1;

public class ExplicitWaitDemo extends BaseClass1 {
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		//Implicit Wait********
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//webDriver wait******
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(25));
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h3[text()='An iFrame containing the TinyMCE WYSIWYG Editor']")));
		
		//WebElement label=driver.findElement(By.xpath("//h3[text()='An iFrame containing the TinyMCE WYSIWYG Editor']"));
		//label.click();
		//System.out.println("The label->"+label.getText());
		
		//FluentWait******
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(NoSuchElementException.class);
		
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='An iFrame containing the TinyMCE WYSIWYG Editor']")));
		element.click();
		System.out.println(element.getText());
		tearDown();
		
	}

}
