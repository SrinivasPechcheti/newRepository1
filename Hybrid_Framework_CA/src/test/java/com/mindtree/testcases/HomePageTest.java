package com.mindtree.testcases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.pageObject.HomePage;
import com.mindtree.utility.BaseTest;



public class HomePageTest extends BaseTest{
	
	
	public static Logger log= LogManager.getLogger(BaseTest.class.getName());
	
	@Test
	public void HomePage() throws InterruptedException
	{
		
		HomePage hp=new HomePage(driver);
		driver.get(baseURL);
		Thread.sleep(3000);
		log.info("Homepage loaded successfully");
		test.info("Homepage loaded successfully");
		Assert.assertTrue(hp.Homepage_logo().isDisplayed());
		Thread.sleep(2000);
		log.info("Logo  is  verified successfully");
		test.info("Logo is   verified successfully");


	}
}
