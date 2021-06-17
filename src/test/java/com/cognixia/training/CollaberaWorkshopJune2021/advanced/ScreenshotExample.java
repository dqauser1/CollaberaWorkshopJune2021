package com.cognixia.training.CollaberaWorkshopJune2021.advanced;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.cognixia.training.CollaberaWorkshopJune2021.basic.Base;

public class ScreenshotExample extends Base {

	public static void main(String[] args) throws IOException {

		openBrowser("Firefox");
		
		driver.get("https://www.cleartrip.com");
		
		File f;
		
		f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f, new File("screenshots/cleartrip.jpg"));
		
	}

}
