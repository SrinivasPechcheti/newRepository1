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
		
		AddToCart ac=new AddToCart(driver);
		ac.add_to_cart().click();
		log.info("Navigated to Add to Cart section");
		test.info("Navigated to Add to Cart section");

		Thread.sleep(2000);
		ac.checkout().click();
		log.info("clicked on the Continue shopping ");
		test.info("clicked on the Continue shopping");
		ac.sofa().click();
		log.info("item is selected ");
		test.info("item is selected");
				
	}
}
