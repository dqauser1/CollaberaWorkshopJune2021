package com.cognixia.training.CollaberaWorkshopJune2021.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import com.cognixia.training.CollaberaWorkshopJune2021.basic.Base;

public class GoogleSearchExampleWithButtonClick extends Base {

	public static void main(String[] args) throws InterruptedException {
		
		//1. Open the Browser
		openBrowser("Chrome");
		
		//2. Navigate to the URL 
		driver.get("https://www.google.com");
		
		//3. Enter Text in Search Box
		//3.1 Find Search Box
		WebElement searchbox = driver.findElement(By.name("q"));	
		
		//3.2 Enter Text in it
		searchbox.sendKeys("Git"); //The text "Selenium" is called Test Data
		
		//Waiting for the button to stabilize. This is called as Synchronization.
		//We are synchronizing our script with the performance of web page
		Thread.sleep(500); //Not recommended to be used in scripting
		
		//4. Click Search Button
		WebElement searchbutton = driver.findElement(By.name("btnK"));
		searchbutton.click();
		
		Thread.sleep(2000);
		
		//5. Verify that Search results are displayed
		String actual = driver.getTitle();
		String expected = "Selenium";
		
		System.out.println("Title is: "+actual);
		
		if(actual.contains(expected)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
			System.out.println("Title is: "+actual);
		}
		
		//XPATH - Internally can use any attribute
		//CSS Selectors - Internally can use any attribute
		
	}

}
