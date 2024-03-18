package com.basescucu.bases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucu.utilities.CommonUtilities;
//import cucumber.base.BasePage;
//import cucumber.utilities.CommonUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	 static WebDriver driver;
	static CommonUtilities common = new CommonUtilities();
	BasePage page;
	public static void launchapplication() {
		driver = getDriver();
		driver.get("https://login.salesforce.com");
		
		
		/*
		 * String applicationurl=null; try { applicationurl = common.getproperty("url");
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } driver.get(applicationurl);
		 */
		 
	}
	
	public static WebDriver getDriver() {
		if(driver ==null) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	  }
		return driver;
	}
	
	public String GetTitle() {
		//page.waitforElement();
		
		  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return driver.getTitle();
	}
	public void Threadwait() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void compareText(String Actual, String Expected) {
		Assert.assertEquals(Actual, Expected);
	}
	
}



