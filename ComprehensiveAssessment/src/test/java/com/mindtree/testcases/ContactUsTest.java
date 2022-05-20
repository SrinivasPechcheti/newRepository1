package com.mindtree.testcases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.mindtree.pageObject.ContactUs;
import  com.mindtree.utility.BaseTest;
import  com.mindtree.utility.ExtentReporter;

public class ContactUsTest extends BaseTest{
	public static Logger log= LogManager.getLogger(BaseTest.class.getName());
	@Test
	public void ContactPage() throws InterruptedException
	{
		ContactUs cp=new ContactUs(driver);
		driver.get(baseURL);
		cp.Contact_us().click();
		log.info("contact us page loaded successfully");
		test.info("contact us page loaded successfully");
		
		cp.MessageBox().sendKeys("What can I do if my product is damaged?");
		Thread.sleep(2000);
		cp.Send().sendKeys(Keys.ENTER);
		test.info("Issue entered successfully");
		test.info("Issue entered successfully");
		Thread.sleep(3000);
		Assert.assertTrue(cp.Sending_confirmation().isDisplayed());
		log.info("text is displayed successfully");
		test.info("text is displayed successfully");
		
	}
}

