package com.mindtree.Testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.PageObjects.AddToCart;
import com.mindtree.utilities.BaseClass;


public class AddToCartTest extends BaseClass {
	public static Logger log= LogManager.getLogger(BaseClass.class.getName());

	@Test
	public void AddCart() throws IOException, InterruptedException{
		driver.get(baseURL);

		AddToCart ac=new AddToCart(driver);
		ac.add_to_cart().click();
		log.info("Navigated to Add to Cart section");
		test.info("Navigated to Add to Cart section");

		Thread.sleep(2000);
		Assert.assertTrue(ac.checkout_availibility().isDisplayed());
		log.info("Continue shopping is displayed");
		test.info("Continue shopping is displayed");
	}
}
