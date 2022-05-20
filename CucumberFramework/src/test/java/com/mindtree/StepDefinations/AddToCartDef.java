package com.mindtree.StepDefinations;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.mindtree.PageObjects.AddToCart;
import com.mindtree.utilities.BaseClass;

import io.cucumber.java.en.*;
public class AddToCartDef extends BaseClass{
	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	AddToCart ac=new AddToCart(driver);
	@Given("User in Home Page")
	public void user_in_home_page() {
		driver.get(baseURL);
		System.out.println("User on the home page");
	}

	@When("click on AddToCart")
	public void click_on_add_to_cart() throws InterruptedException {
		
		ac.add_to_cart().click();
		log.info("Navigated to Add to Cart section");
		test.info("Navigated to Add to Cart section");
		Thread.sleep(2000);
	}

	@Then("validate the checkout option displayed or not")
	public void validate_the_checkout_option_displayed_or_not() {
		Assert.assertTrue(ac.checkout_availibility().isDisplayed());
		log.info("Continue shopping is displayed");
		test.info("Continue shopping is displayed");
	}

}
