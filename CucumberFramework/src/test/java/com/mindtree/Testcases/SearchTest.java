package com.mindtree.Testcases;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.PageObjects.Search;
import com.mindtree.utilities.BaseClass;



public class SearchTest  extends BaseClass {
	public static Logger log= LogManager.getLogger(BaseClass.class.getName());

	@Test
	public void Search() throws IOException, InterruptedException{
		driver.get(baseURL);
		Search sp=new Search(driver);
		sp.product_enter().sendKeys("carpet",Keys.ENTER);
		log.info("Entering the product name and Searching for the product");
		test.info("Entering the product name and Searching for the product");
		Thread.sleep(3000);
		Assert.assertTrue(sp.productvisible().isDisplayed());
		log.info("Searched product displayed successfully");
		test.info("Searched product displayed successfully");
		driver.close();
		driver.quit();



	}

}
