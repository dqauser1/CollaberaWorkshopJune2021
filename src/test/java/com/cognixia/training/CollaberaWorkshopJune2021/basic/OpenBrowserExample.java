package com.cognixia.training.CollaberaWorkshopJune2021.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserExample {

	public static void main(String[] args) {
		
		//The following path is valid for Windows OS only
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\Selenium\\chromedriver.exe"); //Windows OS
		
		//The following path is valid for MAC and Linux OS
		System.setProperty("webdriver.chrome.driver", "/Users/ameya/Tools/Selenium/ChromeDriver91/chromedriver");
		WebDriver driver = new ChromeDriver(); //Opens a blank browser
		
		driver.get("https://www.google.com");
		
	}

}
