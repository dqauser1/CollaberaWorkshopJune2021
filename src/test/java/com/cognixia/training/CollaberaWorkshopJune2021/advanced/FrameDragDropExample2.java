package com.cognixia.training.CollaberaWorkshopJune2021.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.cognixia.training.CollaberaWorkshopJune2021.basic.Base;

public class FrameDragDropExample2 extends Base{

	public static void main(String[] args) {

		openBrowser("Firefox");
		
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
		//The pointer (driver) changes to frame area
		
		WebElement slider = driver.findElement(By.id("slider"));
		WebElement handle = slider.findElement(By.tagName("span"));
		
		//Step 1 - Define the Actions
		Actions myactions = new Actions(driver);
		myactions.clickAndHold(handle);
		myactions.moveByOffset(200, 0);
		myactions.release();
		
		//Step 2 - Build the Actions - package the code together
		Action action = myactions.build();
		
		//Step 3 - Perform the Actions - run all the lines of code together
		action.perform();
		
		
	}

}
