package com.mindtree.StepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.mindtree.PageObjects.ContactUs;
import com.mindtree.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ContactUsDef extends BaseClass{

	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	ContactUs cp=new ContactUs(driver);
	@Given("User on Home Page")
	public void user_on_home_page() {
		driver.get(baseURL);
	    System.out.println("User on the home page");
	}

	@When("click contact us tab in footer")
	public void click_contact_us_tab_in_footer() {
	    cp.Contact_us().click();
		log.info("contact us page loaded successfully");
		test.info("contact us page loaded successfully");
	}


	@Then("Validating {string} this text is displayed or not")
	public void validating_this_text_is_displayed_or_not(String string) {
		Assert.assertFalse(cp.Sending_confirmation().isDisplayed());
		log.info("text is  not displayed successfully");
		test.info("text is not displayed successfully");
		driver.quit();
		driver.close();
	}
}
