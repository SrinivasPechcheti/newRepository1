package com.mindtree.Testcases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.PageObjects.ContactUs;
import com.mindtree.utilities.BaseClass;

public class ContactUsTest extends BaseClass{
	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	@Test
	public void ContactPage() throws InterruptedException
	{
		ContactUs cp=new ContactUs(driver);
		driver.get(baseURL);
		cp.Contact_us().click();
		log.info("contact us page loaded successfully");
		test.info("contact us page loaded successfully");
		Thread.sleep(3000);
		Assert.assertFalse(cp.Sending_confirmation().isDisplayed());
		log.info("text  not is displayed successfully");
		test.info("text not is displayed successfully");
		driver.quit();
		driver.close();
		
	}
}
