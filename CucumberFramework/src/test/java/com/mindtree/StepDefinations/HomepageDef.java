package com.mindtree.StepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.mindtree.PageObjects.HomePage;
import com.mindtree.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class HomepageDef  extends BaseClass{

	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	@Given("Browser will open with the given url")
	public void browser_will_open_with_the_given_url() {
		driver=setup();
		driver.get(baseURL);
		driver =new ChromeDriver();
	}
	@Then("validating logo")
	public void validating_logo() {
		HomePage hp=new HomePage(driver,test);
		log.info("Homepage loaded successfully");
		test.info("Homepage loaded successfully");
		Assert.assertFalse(hp.Homepage_logo().isDisplayed());
	}

}
