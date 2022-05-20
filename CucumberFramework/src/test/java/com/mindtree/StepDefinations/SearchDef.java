package com.mindtree.StepDefinations;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import com.mindtree.PageObjects.Search;
import com.mindtree.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SearchDef extends BaseClass{

	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	Search sp=new Search(driver);
	@Given("User in the Home Page")
	public void user_in_the_home_page() {
		driver.get(baseURL);
	    System.out.println("User in the home page");
	}

	@When("user enter a product name {string} and click on search")
	public void user_enter_a_product_name_and_click_on_search(String string) throws InterruptedException {
		sp.product_enter().sendKeys("carpet",Keys.ENTER);
		log.info("Entering the product name and Searching for the product");
		test.info("Entering the product name and Searching for the product");
		Thread.sleep(3000);
	}

	@Then("The searched product should be displayed on the result page")
	public void the_searched_product_should_be_displayed_on_the_result_page() {
		Assert.assertTrue(sp.productvisible().isDisplayed());
		log.info("Searched product displayed successfully");
		test.info("Searched product displayed successfully");
		driver.close();
		driver.quit();
	}
}
