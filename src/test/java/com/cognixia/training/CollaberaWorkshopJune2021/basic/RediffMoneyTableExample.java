package com.cognixia.training.CollaberaWorkshopJune2021.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffMoneyTableExample extends Base {

	public static void main(String[] args) {

		openBrowser("firefox");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://money.rediff.com/gainers");
		
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		
		List<WebElement> rows = table.findElements(By.xpath("./tbody/tr"));
		
		for(WebElement r : rows) {
			
			List<WebElement> columns = r.findElements(By.tagName("td"));
			
			String pricestring = columns.get(3).getText();
			
			pricestring=pricestring.replace(",", "");
			Double pricedouble = Double.parseDouble(pricestring);
			
			if(pricedouble >=100.00) {
				System.out.print(columns.get(0).getText()+" : ");
				System.out.println(columns.get(3).getText());
			}
		}
	}

}
