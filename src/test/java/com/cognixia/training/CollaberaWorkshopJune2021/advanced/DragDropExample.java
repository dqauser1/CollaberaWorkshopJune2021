package com.cognixia.training.CollaberaWorkshopJune2021.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cognixia.training.CollaberaWorkshopJune2021.basic.Base;

public class DragDropExample extends Base{

	public static void main(String[] args) throws InterruptedException {

		openBrowser("Firefox");
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(2);	
		
		WebElement imagetodrag = driver.findElement(By.xpath("//ul[@id='gallery']//img[1]"));
		
		WebElement trash = driver.findElement(By.id("trash"));
		
		new Actions(driver).dragAndDrop(imagetodrag, trash).build().perform();
		
		
	}

}
