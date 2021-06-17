package com.cognixia.training.CollaberaWorkshopJune2021.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.cognixia.training.CollaberaWorkshopJune2021.basic.Base;

public class MyntraMouseActionsExample extends Base{

	public static void main(String[] args) {

		openBrowser("Firefox");
		
		driver.get("https://www.myntra.com/");
		
		//Move my mouse to Home & Living menu item
		
		//1. Create the object of Actions class and define the action
		Actions myActions = new Actions(driver);
		myActions.moveToElement(driver.findElement(By.xpath("//a[text()='Home & Living' and @class='desktop-main']")));
		myActions.pause(5000);
		myActions.moveToElement(driver.findElement(By.xpath("//a[text()='Men' and @class='desktop-main']")));
		
		//2. Create the object of Action class and build the actions
		Action myAction = myActions.build();
		
		//3. Perform the Action
		myAction.perform();
	}

}
