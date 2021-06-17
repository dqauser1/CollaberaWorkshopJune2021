package com.cognixia.training.CollaberaWorkshopJune2021.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ameya/Tools/Selenium/ChromeDriver91/chromedriver");

		//WebDriver Interface is a W3C Standard. All browsers who want W3C certification have to
		//mandatorily implement the WebDriver Interface
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		driver.get("https://www.flipkart.com");
		
		driver.navigate().to("https://www.bigbasket.com"); //does the same thing that get() command does
														   //but improves readability
		
		driver.navigate().back(); //Go back to Flipkart
		
		driver.navigate().back(); //Go back to Amazon
		
		driver.navigate().forward(); //Go forward to Flipkart
		
		driver.navigate().refresh();
		
		driver.close(); //closes the browser window on the screen, but the driver object is active in memory
		
		driver.quit(); //remove the driver object from memory
		
	}

}
