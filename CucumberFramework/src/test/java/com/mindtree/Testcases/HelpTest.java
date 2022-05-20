package com.mindtree.Testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.PageObjects.Help;
import com.mindtree.utilities.BaseClass;

public class HelpTest extends BaseClass{
	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
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
		driver.close();
		driver.quit();
	}
}
