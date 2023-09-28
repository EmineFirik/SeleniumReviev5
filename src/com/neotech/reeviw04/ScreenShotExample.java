package com.neotech.reeviw04;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;

public class ScreenShotExample extends CommonMethods {
	public static void main(String[] args) throws IOException {
		// https://www.facebook.com/

		setUp();

		driver.findElement(By.id("email")).sendKeys("Emine");
		wait(2);
		driver.findElement(By.id("pass")).sendKeys("emine@gmail.com");
		wait(2);
		driver.findElement(By.name("login")).click();
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;

		File fileSource = ts.getScreenshotAs(OutputType.FILE);

		String getTimeStamp = new SimpleDateFormat("_yyyy_MM_dd_HH_mm_ss").format(new Date());

		Files.copy(fileSource, new File("screenshots/HRM/screenshot" + getTimeStamp + ".png"));
		
		wait(3);
		
		WebElement form= driver.findElement(By.xpath("//form[@data-testid='royal_login_form']"));
		
		
		TakesScreenshot ts2 = (TakesScreenshot) form;
		
		File fileSource2 = ts.getScreenshotAs(OutputType.FILE);

		String getTimeStamp2 = new SimpleDateFormat("_yyyy_MM_dd_HH_mm_ss").format(new Date());

		Files.copy(fileSource, new File("screenshots/HRM/screenshot" + getTimeStamp + ".png"));
		
		wait(3);
		
		tearDown();


		
		
		
		
		
		
		
		
		
		
		

	}
}
