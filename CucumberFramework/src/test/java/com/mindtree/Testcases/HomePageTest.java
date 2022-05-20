package com.mindtree.Testcases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.appender.rolling.action.Action;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.PageObjects.HomePage;
import com.mindtree.utilities.BaseClass;



public class HomePageTest extends BaseClass
{
	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	@Test
	public void Homepage() throws InterruptedException
	{
		
		driver.get(baseURL);
		HomePage hp=new HomePage(driver,test);
		log.info("Homepage loaded successfully");
		test.info("Homepage loaded successfully");
		Assert.assertFalse(hp.Homepage_logo().isDisplayed());
		
		
	}
	
}