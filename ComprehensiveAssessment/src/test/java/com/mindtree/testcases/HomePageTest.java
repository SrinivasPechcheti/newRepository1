package com.mindtree.testcases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.appender.rolling.action.Action;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import com.mindtree.pageObject.HomePage;
import com.mindtree.utility.BaseTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class HomePageTest extends BaseTest{
	
	
	public static Logger log= LogManager.getLogger(BaseTest.class.getName());
	
	@Test
	public void HomePage() throws InterruptedException
	{
		
		HomePage hp=new HomePage(driver);
		driver.get(baseURL);
		log.info("Homepage loaded successfully");
		test.info("Homepage loaded successfully");
		Assert.assertFalse(hp.Homepage_logo().isDisplayed());
		log.info("Logo verified successfully");
		test.info("Logo verified successfully");

	}
}
