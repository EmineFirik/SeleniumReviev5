package com.neotech.reeviw04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class ActionSample  extends CommonMethods{
public static void main(String[] args) {
	//http://webdriveruniversity.com/Actions/index.html
	
	setUp();
	
	Actions act = new Actions (driver);
	
	//WebElement draggable = driver.findElement(By.id("draggable"));
	
	//WebElement droppable = driver.findElement(By.id("droppable"));
	
	//act.dragAndDrop(draggable, droppable).perform();
	//act.clickAndHold(draggable).moveToElement(droppable).pause(1000).release().perform();
	
	WebElement doubleClick = driver.findElement(By.id("double-click"));
	
	act.doubleClick(doubleClick).perform();
	//List<WebElement > hoverButtons= driver.findElements(By.xpath("//button[@class='dropbtn']"));
	//for( WebElement hover : hoverButtons) {
	//act.moveToElement(hover).perform();
	
	//WebElement clickHold = driver.findElement(By.id("click-box"));
	//act.clickAndHold(clickHold).pause(2000).release().pause(2000).perform();
	wait(2);
		
	tearDown();
	
	}
	
	
	
}

