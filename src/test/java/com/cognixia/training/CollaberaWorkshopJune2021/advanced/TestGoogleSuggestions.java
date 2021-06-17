package com.cognixia.training.CollaberaWorkshopJune2021.advanced;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cognixia.training.CollaberaWorkshopJune2021.basic.Base;

public class TestGoogleSuggestions extends Base{

	public static void main(String[] args) throws InterruptedException {

		openBrowser("Chrome");
		
		driver.get("http://www.google.com");
		
		String searchstring = "selenium";
		
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys(searchstring);
	
		//Explicit Wait
		WebDriverWait myWait = new WebDriverWait(driver, 5);
		//myWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//li[@data-view-type='1']//div[@role='option']")), searchstring));
		myWait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//li[@data-view-type='1']//div[@role='option']"), searchstring));
		
		List<WebElement> suggestionslist = driver.findElements(By.xpath("//li[@class='sbct' and not(@id='YMXe')]"));
		
		System.out.println(suggestionslist.size());
		
		for (WebElement suggestion : suggestionslist) {
			
			System.out.print(suggestion.getText());
			
			if(suggestion.getText().contains("selenium")) {
				System.out.println(": Test Passed");
			}
			else {
				System.out.println(": Test Failed");
			}
		}
		
	}

}
