package com.cognixia.training.CollaberaWorkshopJune2021.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RediffMoneyExample extends Base {

	public static void main(String[] args) {
		
		openBrowser("Firefox");
		
		driver.get("http://money.rediff.com/gainers");
		
		//1. Get the Company Names from the Table
		//1.1 - Get the Table in List
		//1.2 - Get Company names from the List
		
		List<WebElement> companynames = driver.findElements(By.xpath("//table[@class='dataTable']//a"));
		
//		for(int i=0; i<=10; i++) {
//			System.out.println(companynames.get(i).getText());
//		}
		
		System.out.println(companynames.size());
		
		//2. Get the Current Price
		
		List<WebElement> prices = driver.findElements(By.xpath("//table[@class='dataTable']//td[4]"));
		
		//int i = prices.indexOf(price);
		
//		String firstprice = prices.get(0).getText();
//		
//		//System.out.println("Price is: "+firstprice);
//		
//		double myprice = Double.parseDouble(firstprice);
//		
//		if(myprice>100.00) {
//			System.out.println("Price is: "+myprice);
//		} else {
//			System.out.println("Price is less than 100.00. Hence not printing");
//		}
		
		
		//3. Compare if the Current Price is > 100 and print Company Name and Price together
		
		for (WebElement price : prices) {
			
			String eachprice = price.getText();
			
			eachprice = eachprice.replace(",", ""); //replace all , to blank
			
			double pricedouble = Double.parseDouble(eachprice);
			
			if(pricedouble>100.00) {
				
				//Get the index of the price which is greater than 100
				int index = prices.indexOf(price);
				
				//Use the index to find the company name
				WebElement companywithpricegreaterthan100 = companynames.get(index);
				String companyname = companywithpricegreaterthan100.getText();
				
				System.out.print(companyname);
				System.out.println(" : "+pricedouble);
			}		
		}	
	
	}

}
