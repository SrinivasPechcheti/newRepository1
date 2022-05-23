package com.mindtree.testcases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.mindtree.pageObject.TrackOrder;
import com.mindtree.utility.BaseTest;
public class TrackOrderTest extends BaseTest{

	public static Logger log= LogManager.getLogger(BaseTest.class.getName());
	@Test
	public void track() throws InterruptedException
	{
		TrackOrder gc=new TrackOrder(driver);
		driver.get(baseURL);
		Thread.sleep(2000);
		gc.trackOrderOption_click().click();
		gc.Order_click().sendKeys("123456");
		Thread.sleep(2000);
		gc.moblie().sendKeys("9999999999");
		Thread.sleep(2000);
		log.info("order and Moblie number is added");
		test.info("order and Moblie number is added");

		gc.submit_click().click();
		Thread.sleep(2000);

		log.info("Submit is done");
		test.warning("Order not found. If you have just placed the order, tracking information will be available after an hour.");
		
	}
}

