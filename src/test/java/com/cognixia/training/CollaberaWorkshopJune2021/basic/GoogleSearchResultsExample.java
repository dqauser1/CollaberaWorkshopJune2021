package com.cognixia.training.CollaberaWorkshopJune2021.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleSearchResultsExample extends Base {

	public static void main(String[] args) throws InterruptedException {
		
		searchGoogle("Selenium");
		
		//Print all the links on the results Page 
		
		//part 1 - try to print the first link only
		String firstlink = driver.findElement(By.tagName("h3")).getText();
		System.out.println(firstlink);
		
		//part 2 - try to get all the links
		
		List<WebElement> all_links = driver.findElements(By.tagName("h3"));
		
//		all_links.forEach(l -> {
//			if(!l.getText().equals("")) {
//				System.out.println(l.getText());
//			}
//		});
		
		//Lambda Function inside ForEach loop
//		all_links.forEach(l -> System.out.println(l.getText()));
		
		
		all_links.forEach(link -> {
			if(!link.getText().equals("")) {
				System.out.println(link.getText());
			}
		});
		
		
//		for (WebElement link : all_links) {
//			if(!link.getText().equals("")) {
//				System.out.println(link.getText());
//			}
//		}	
		
	}

	private static void searchGoogle(String string) throws InterruptedException {
		//1. Open the Browser
		openBrowser("Chrome");
		
		//2. Navigate to the URL 
		driver.get("https://www.google.com");
		
		//3. Enter Text in Search Box
		//3.1 Find Search Box
		WebElement searchbox = driver.findElement(By.name("q"));	
		
		//3.2 Enter Text in it
		searchbox.sendKeys("Selenium"); //The text "Selenium" is called Test Data
		
		//Waiting for the button to stabilize. This is called as Synchronization.
		//We are synchronizing our script with the performance of web page
		Thread.sleep(500); //Not recommended to be used in scripting
		
		//4. Click Search Button
		WebElement searchbutton = driver.findElement(By.name("btnK"));
		searchbutton.click();
		
		Thread.sleep(2000);
	}

}
