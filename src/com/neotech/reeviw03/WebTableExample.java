package com.neotech.reeviw03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass1;

public class WebTableExample extends BaseClass1 {
	public static void main(String[] args) throws InterruptedException {
		// https://neotech.vercel.app/tables

		setUp();

		// findi number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("The number of rows ->" + rows.size());

		// find the numbers of columsin the first rows
		List<WebElement> cols = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		System.out.println("The number of colums is :" + cols.size());

		// all the numbers celss table in tamami

		List<WebElement> celss = driver.findElements(By.xpath("//table/tbody/tr/td"));
		System.out.println("All the number cell->" + celss.size());

		// if I want print the first row of the table
		// first way******** this is static way
		List<WebElement> tableHeader = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		for (WebElement el : tableHeader) {
			System.out.print(el.getText() + "| ");
		}

		System.out.println("*******************");

		// 2nd way dinamic way
		for (int i = 1; i < cols.size(); i++) {
			String path = "//table/tbody/tr[1]/td[" + 1 + "]";
			System.out.println(path);
		}
System.out.println();
		//print all rol and all the cell

System.out.println("--------------------------------");
System.out.println("Let us print all the cells of all the rows");
System.out.println("--------------------------------");

            for (int row = 1; row <= rows.size(); row++) { // iterating the row
            	
            	
	        for (int col = 1; col <= cols.size(); col++) { // iterating the columns
				

				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[" + row + "]/td[" + col + "]"));
				System.out.println(element.getText());
				
			}
			System.out.println();
		}

		
		
		tearDown();
	}
}
