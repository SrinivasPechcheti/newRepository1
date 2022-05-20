package com.mindtree.StepDefinations;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.cucumber.java.en.*;

import com.mindtree.PageObjects.GiftCard;
import com.mindtree.utilities.BaseClass;
import com.mindtree.utilities.ReadConfig;

public class GiftCardDef extends BaseClass {
	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	ReadConfig readconfig=new ReadConfig();
	GiftCard gc=new GiftCard(driver);
	//Properties prop;
	public String excellocation=readconfig.Excel();
	
	@Given("User on the Home Page")
	public void user_on_the_home_page() throws InterruptedException {
		driver.get(baseURL);
		driver.get(baseURL);
		Thread.sleep(2000);
	    System.out.println("User on home page");
	}
	@When("click on Giftcard")
	public void click_on_giftcard() {
		gc.giftCard_click().click();
		log.info("clicked on Gift Card option");
		test.info("clicked on Gift Card option");

	}

	@Then("cilck on choose")
	public void cilck_on_choose() {
		gc.choose_click().click();
		log.info("Gift Card has been Choosen");
		test.info("Gift Card has been Choosen");
	}
}