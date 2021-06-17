package com.cognixia.training.CollaberaWorkshopJune2021.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cognixia.training.CollaberaWorkshopJune2021.basic.Base;

public class FrameDragDropExample extends Base{

	public static void main(String[] args) {

		openBrowser("Firefox");
		
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
		//The pointer (driver) changes to frame area
		
		WebElement slider = driver.findElement(By.id("slider"));
		
//		Dimension d = slider.getSize();
//		int width = d.width;
//		
//		Rectangle r = slider.getRect();
//		int w = r.width;
		
		int maxXoffset = slider.getSize().width;
		System.out.println(maxXoffset);
		
		WebElement handle = slider.findElement(By.tagName("span"));
		
		Actions myaction = new Actions(driver);
		//myaction.dragAndDropBy(handle, maxXoffset/2, 0).build().perform();

		myaction.clickAndHold(handle).moveByOffset(maxXoffset/4, 0).release().build().perform();
		
	}

}
