package com.mindtree.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import com.mindtree.pageObject.AddToCart;
import com.mindtree.utility.BaseTest;


public class AddToCartTest extends BaseTest {
	public static Logger log= LogManager.getLogger(BaseTest.class.getName());

	@Test
	public void AddCart() throws IOException, InterruptedException{
		driver.get(baseURL);

		AddToCart gfcard=new AddToCart(driver);
		gfcard.add_to_cart().click();
		log.info("Navigated to Add to Cart section");
		test.info("Navigated to Add to Cart section");
//		gfcard.Add().click();
		Thread.sleep(2000);
		Assert.assertTrue(gfcard.checkout_availibility().isDisplayed());
		log.info("Continue shopping is displayed");
		test.info("Continue shopping is displayed");
	}
}
