package com.cognixia.training.CollaberaWorkshopJune2021.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlipkartSearchExample extends Base{

	public static void main(String[] args) throws InterruptedException {
		
		openBrowser("Chrome");
		
		driver.get("https://www.flipkart.com");
		
		//For every WebElement, from this point onwards, Selenium will automatically wait 
		//until the element is found OR until the timeout is reached.
		//Internally Selenium checks whether the element is found after every 500 milliseconds. 
		//If the element is found, Selenium immediately proceeds to next line
		//If element is not found, Selenium waits for another 500 milliseconds and checks again
		//Selenium keeps on checking until the Timeout is reached.
		//In this case, the timeout is 30 seconds. 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Timeout after 30 seconds
		
		//Click on the Cross button of the popup to dismiss it
		WebElement parent = driver.findElement(By.className("_2QfC02"));
		WebElement child = parent.findElement(By.tagName("button"));
		child.click();
		
		//Another way of clicking on the button
//		List<WebElement> all_buttons = driver.findElements(By.tagName("button"));
//		
//		for (WebElement button : all_buttons) {
//			if(button.getText().equals("x")) {
//				button.click();
//			}
//		}
		
		String searchstring = "iphone";
		
		driver.findElement(By.name("q")).sendKeys(searchstring);
		
		//Submit the form
		//driver.findElement(By.name("q")).submit();
		
		//Click on the search icon
		driver.findElement(By.className("L0Z3Pu")).click();
		
		//Thread.sleep(2000);
		
		String text = driver.findElement(By.className("_10Ermr")).getText();
		
		int startingindex = text.indexOf("of");
		int endingindex = text.indexOf("results");
		
		String numberofitems = text.substring(startingindex+2, endingindex-1);
		
		System.out.println("No. of iphone in inventory are: "+numberofitems);
	}

}
