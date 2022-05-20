package com.mindtree.StepDefinations;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.mindtree.PageObjects.SelectProduct;
import com.mindtree.utilities.BaseClass;
import io.cucumber.java.en.*;

public class SelectProductDef extends BaseClass{
	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	SelectProduct ha=new SelectProduct(driver);

	@Given("User in the Page")
	public void user_in_the_page() {
		driver.get(baseURL);
		System.out.println("User in the home page");
	}

	@When("User Select the Product")
	public void user_select_the_product() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement move=ha.Hover_select();
		a.moveToElement(move).build().perform();
		log.info("Hover action performed successfully");
		test.info("Hover action performed successfully");
		Thread.sleep(3000);
	}

	@Then("validate the Selected product is displayed or not")
	public void validate_the_selected_product_is_displayed_or_not() throws InterruptedException {
		ha.Select_Item().click();
		Thread.sleep(3000);
		Assert.assertTrue(ha.Page_Loaded().isDisplayed());
		log.info("desired page loaded successfully");
		test.info("desired page loaded successfully");
		driver.close();
		driver.quit();
	}
}
