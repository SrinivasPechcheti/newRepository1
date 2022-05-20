package com.mindtree.StepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.mindtree.PageObjects.HomePage;
import com.mindtree.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class HomepageDef  extends BaseClass{

	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	@Given("User navigate to Home Page")
	public void user_navigate_to_home_page() {
		driver=setup();
		driver.get(baseURL);
	}
	@Then("Urban Ladders Website logo should be displayed")
	public void urban_ladders_website_logo_should_be_displayed() {
		HomePage hp=new HomePage(driver,test);
		log.info("Homepage loaded successfully");
		test.info("Homepage loaded successfully");
		Assert.assertFalse(hp.Homepage_logo().isDisplayed());
	}

}
