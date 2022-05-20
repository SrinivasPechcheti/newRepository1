package com.mindtree.StepDefinations;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.mindtree.PageObjects.Help;
import com.mindtree.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class HelpDef extends BaseClass{

	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	Help cp=new Help(driver);
	
	
	@Given("User  in the Home Page")
	public void user_in_the_home_page() {
		driver.get(baseURL);
		System.out.println("User in the  Home page");
	}

	@When("click Help tab in Header")
	public void click_help_tab_in_header() throws InterruptedException {
		cp.helpOption().click();;
		log.info("Help page loaded successfully");
		test.info("Help page loaded successfully");
		Thread.sleep(3000);
	}

	@Then("Validating {string}  text is displayed or not")
	public void validating_text_is_displayed_or_not(String string) {
	    Assert.assertTrue(cp.Sending_confirmation().isDisplayed());
		log.info("text is displayed successfully");
		test.info("text is displayed successfully");
		driver.close();
		driver.quit();
	}
}
