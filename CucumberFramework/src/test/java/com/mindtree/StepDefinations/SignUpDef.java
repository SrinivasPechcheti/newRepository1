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

import com.mindtree.PageObjects.SignUp;
import com.mindtree.utilities.BaseClass;
import com.mindtree.utilities.ReadConfig;
public class SignUpDef extends BaseClass {
	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	ReadConfig readconfig=new ReadConfig();
	SignUp up=new SignUp(driver,test);
	//Properties prop;
	public String excellocation=readconfig.Excel();
	@Given("User lands on Home Page")
	public void user_lands_on_home_page() {
	    System.out.println("User on home page");
	}

	@When("click on profile icon")
	public void click_on_profile_icon() throws IOException, InterruptedException {
		
		driver.get(baseURL);
		up.Profile_click().click();
		log.info("clicked on the profile");
	test.info("clicked on the profile");
	
		
	}

	@And("click on SignUp")
	public void click_on_sign_up() {
		
		up.SignUp().click();
		log.info("clicked on the SignUp option");
		test.info("clicked on the SignUp option");

	}

	@And("Enter the email and password from excel")
	public void enter_the_email_and_password_from_excel() throws IOException {
		
		File scr1=new File(excellocation);
		FileInputStream fis1 = new FileInputStream(scr1);
		XSSFWorkbook workbook = new XSSFWorkbook(fis1);

		XSSFSheet sheet = workbook.getSheetAt(0);

		Iterator<Row> rows = sheet.iterator();
		Row firstRow = rows.next();
		Row secondRow = rows.next();

		Iterator<Cell> ce1 = firstRow.cellIterator();
		ce1.next();
		String email = ce1.next().getStringCellValue();
		Iterator<Cell> ce2 = secondRow.cellIterator();
		ce2.next();
		String password = ce2.next().getStringCellValue();
		
		up.email().sendKeys(email);
		log.info("Email entered successfully");
		test.info("Email entered successfully");
		up.password().sendKeys(password);
		log.info("password entered successfully");
		test.info("password entered successfully");
	}

	@Then("SignUP button verification")
	public void sign_up_button_verification() throws InterruptedException {
		up.signup_click().click();
		log.info("Signup Successfully...... ");
		test.info("Signup Successfully...... ");
		Thread.sleep(2000);
	}
	
	
}
