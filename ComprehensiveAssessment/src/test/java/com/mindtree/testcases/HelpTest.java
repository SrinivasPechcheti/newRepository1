package com.mindtree.testcases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.mindtree.pageObject.ContactUs;
import com.mindtree.pageObject.Help;
import  com.mindtree.utility.BaseTest;
import  com.mindtree.utility.ExtentReporter;

public class HelpTest extends BaseTest{
	public static Logger log= LogManager.getLogger(BaseTest.class.getName());
	@Test
	public void HelpPage() throws InterruptedException
	{
		Help cp=new Help(driver);
		driver.get(baseURL);
		cp.helpOption().click();;
		log.info("Help page loaded successfully");
		test.info("Help page loaded successfully");
		Thread.sleep(3000);
		Assert.assertTrue(cp.Sending_confirmation().isDisplayed());
		log.info("text is displayed successfully");
		test.info("text is displayed successfully");
		
	}
}
