package com.mindtree.testcases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.mindtree.pageObject.Help;
import com.mindtree.utility.BaseTest;

public class HelpTest extends BaseTest{
	public static Logger log= LogManager.getLogger(BaseTest.class.getName());
	@Test
	public void HelpPage() throws InterruptedException
	{
		Help hp=new Help(driver);
		driver.get(baseURL);
		hp.helpOption().click();;
		log.info("Help page loaded successfully");
		test.info("Help page loaded successfully");
		Thread.sleep(3000);
		hp.queries().click();
		Thread.sleep(2000);
		hp.query1().click();
		log.info("Query regarding order is checked  successfully");
		test.info("Query regarding order is checked  successfully");
		driver.close();
		driver.quit();
		
		
	}
}
