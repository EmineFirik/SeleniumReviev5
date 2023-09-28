package com.neotech.reeviw04;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;

public class UploadExample extends  CommonMethods{
	
	
	//https://neotech.vercel.app/fileUpload
	
public static void main(String[] args) throws IOException {
	
	setUp();
	
	String filePath = System.getProperty("user.dir")+ "/screenshots/HRM/screenshot_2023_09_25_23_58_45.png";
	
	driver.findElement(By.id("image_file")).sendKeys(filePath);
	
	driver.findElement(By.id("btnUpload")).click();
	
	waitForVisibility(driver.findElement(By.cssSelector("div.ContactUs")));
	
	String expectedmessage ="File uploaded successfully!";
	String actualMesage=driver.findElement(By.id("upload_response")).getText();
	String destinations = "screenshots";
	if( actualMesage.contains(expectedmessage)) {
		destinations += "/passed/upload.png";
	}else {
		System.out.println("test is not pass");
		destinations += "/failed/upload.png";
	}
	

	TakesScreenshot ts = (TakesScreenshot) driver.findElement(By.cssSelector("div.css-0"));

	File fileSource = ts.getScreenshotAs(OutputType.FILE);

	File destination = new File(destinations);
	Files.copy(fileSource, destination);
	
	wait(1);
	tearDown();
	
}
}
