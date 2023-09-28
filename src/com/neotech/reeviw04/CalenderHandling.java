package com.neotech.reeviw04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class CalenderHandling extends CommonMethods {
	public static void main(String[] args) {
		// https://www.jqueryui.com/
		// Go to this link: https://jqueryui.com/
		// Click on Datepicker. from the left menu
		// Show the Calendar
		// Select 12/25/2024 from the Calendar
		// Verify that you have selected 12/25/2024
		setUp();

		// 1st way
		// driver.findElement(By.linkText("Datepicker")).click();

		// 2nd way common methods
		click(driver.findElement(By.linkText("Datepicker")));
		wait(2);

		// 1st way,using selenium switch to frame
		// driver.switchTo().frame(0);

		// 2nd way commomMethod
		switchToframe(0);
		driver.findElement(By.id("datepicker")).click();
		wait(2);

		String expectedMonthYear = "December 2024";

		while (true) {

			WebElement monthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title"));

			String monthYearText = monthYear.getText();

			if (monthYearText.equals(expectedMonthYear)) {

				break;
			}
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			wait(2);
		}
		// Now we need to click on the correct date

		String expectedDay = "25";

		List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar'] /tbody/tr/td"));

		for( WebElement day : days) {
			
			if( day.getText().equals(expectedDay)) {
				
				day.click();
				break;
				
			}
		}
		String expectedDate = "12/25/2024";
		
		WebElement dateTextBox =driver.findElement(By.id("datepicker"));
		
		if( dateTextBox.getAttribute("value").equals(expectedDate)) {
			
			System.out.println("Test is pass");
		}else {
			System.out.println("Test fail");
		}
		
		wait(2);
		tearDown();

	}

}
