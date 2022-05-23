package com.mindtree.testcases;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.mindtree.pageObject.SelectProduct;
import com.mindtree.utility.BaseTest;


public class SelectProductTest extends BaseTest {

	public static Logger log= LogManager.getLogger(BaseTest.class.getName());

	@Test
	public void select() throws IOException, InterruptedException{
		driver.get(baseURL);
		SelectProduct ha=new SelectProduct(driver);
		Actions a=new Actions(driver);
		WebElement move=ha.Hover_select();
		a.moveToElement(move).build().perform();
		log.info("Hover action performed successfully");
		test.info("Hover action performed successfully");
		Thread.sleep(3000);
		ha.Select_Item().click();
		Thread.sleep(3000);
		log.info("desired page loaded successfully");
		test.info("desired page loaded successfully");
		
	}
}
