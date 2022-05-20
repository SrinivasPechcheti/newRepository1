package com.mindtree.Testcases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.mindtree.PageObjects.TrackOrder;
import com.mindtree.utilities.BaseClass;
public class TrackOrderTest extends BaseClass{

	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	@Test
	public void track() throws InterruptedException
	{
		TrackOrder gc=new TrackOrder(driver);
		driver.get(baseURL);
		Thread.sleep(2000);
		gc.trackOrderOption_click().click();
		gc.Order_click().sendKeys("123456");
		gc.moblie().sendKeys("9999999999");
		log.info("order and Moblie number is added");
		test.info("order and Moblie number is added");

		gc.submit_click().click();
		log.info("Submit is done");
		test.warning("Order not found. If you have just placed the order, tracking information will be available after an hour.");
		driver.close();
		driver.quit();
	}
}


