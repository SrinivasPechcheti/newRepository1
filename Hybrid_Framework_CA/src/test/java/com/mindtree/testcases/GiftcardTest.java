package com.mindtree.testcases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.mindtree.pageObject.GiftCard;
import com.mindtree.utility.BaseTest;


public class GiftcardTest extends BaseTest{

	public static Logger log= LogManager.getLogger(BaseTest.class.getName());
	@Test
	public void GiftCard() throws InterruptedException
	{
		GiftCard gc=new GiftCard(driver);
		driver.get(baseURL);
		Thread.sleep(2000);
		gc.giftCard_click().click();
		gc.choose_click().click();
		log.info("Gift Card has been Choosen");
		test.info("Gift Card has been Choosen");
		gc.amount_click().click();
		log.info("Amount  is Chossen");
		test.info("Amount  is Chossen");
		Thread.sleep(2000);
		gc.next_click().click();
		gc.Repname().sendKeys("Arjun");
		gc.RepEmail().sendKeys("arjunsrinivas@gmail.com");
		gc.name().sendKeys("Srinivas");
		gc.email().sendKeys("srinivas@gmail.com");
		gc.moblie().sendKeys("9934561234");
		gc.conform().click();
        gc.payment().click();
		log.info("Gift card is comformed");
		test.info("Gift card is comformed");
	
		
	}
}

