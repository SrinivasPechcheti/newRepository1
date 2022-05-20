package com.mindtree.StepDefinations;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import io.cucumber.java.en.*;

import com.mindtree.PageObjects.TrackOrder;
import com.mindtree.utilities.BaseClass;
import com.mindtree.utilities.ReadConfig;
public class TrackOrderDef extends BaseClass {
	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	ReadConfig readconfig=new ReadConfig();
	TrackOrder gc=new TrackOrder(driver);
	
	
	@Given("User in  Home Page")
	public void user_in_home_page() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(2000);
	    System.out.println("User in the home page");
	}
	@When("click on track order icon")
	public void click_on_track_order_icon() {
		gc.trackOrderOption_click().click();
		log.info("clicked on track order icon");
		test.info("clicked on track order icon");
	}

	@And("enter order number")
	public void enter_order_number() {
		gc.Order_click().sendKeys("123456");
		log.info("enter order number");
		test.info("enter order number");

	}

	@When("Enter moblie number")
	public void enter_moblie_number() {
		gc.moblie().sendKeys("9999999999");
		log.info(" Moblie number is added");
		test.info(" Moblie number is added");
	}

	@Then("click on submit and passing Warning message")
	public void click_on_submit_and_passing_warning_message() {
		gc.submit_click().click();
		log.info("Submit is done");
		test.warning("Order not found. If you have just placed the order, tracking information will be available after an hour.");
		driver.close();
		driver.quit();
	}

	
	  
   
}