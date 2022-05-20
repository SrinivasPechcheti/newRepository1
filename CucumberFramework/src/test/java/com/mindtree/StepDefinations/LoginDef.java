package com.mindtree.StepDefinations;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.cucumber.java.en.*;

import com.mindtree.PageObjects.Login;
import com.mindtree.utilities.BaseClass;
import com.mindtree.utilities.ReadConfig;
public class LoginDef  extends BaseClass {
	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	ReadConfig readconfig=new ReadConfig();
	Login lo=new Login(driver,test);
	@Given("User on HomePage")
	public void user_on_home_page() {
		System.out.println("User on home page");
	}

	@When("click on profileIcon")
	public void click_on_profile_icon() {
		driver.get(baseURL);
		lo.Profile_click().click();
			log.info("clicked on the profile");
		test.info("clicked on the profile");
	}

	@And("click on Login option")
	public void click_on_login_option() {
		lo.login().click();
		log.info("clicked on the login option");
		test.info("clicked on the login option");
	}

	@When("Enter the email and password")
	public void enter_the_email_and_password() {
		lo.email().sendKeys("pechchetiSrinivas@gmail.com");
		log.info("Email entered successfully");
		test.info("Email entered successfully");
		lo.password().sendKeys("Srinivas@939");
		log.info("password entered successfully");
		test.info("password entered successfully");
	}

	@Then("Login button verification")
	public void login_button_verification() throws InterruptedException {
		lo.login_click().click();
		log.info("Login Successfully...... ");
		test.info("Login Successfully...... ");
		Thread.sleep(2000);
	}
}
