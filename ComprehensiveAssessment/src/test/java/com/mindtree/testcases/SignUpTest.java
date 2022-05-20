package com.mindtree.testcases;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import com.mindtree.pageObject.SignUP;
import com.mindtree.utility.BaseTest;
import com.mindtree.utility.ReadConfig;


public class SignUpTest extends BaseTest{
	ReadConfig readconfig=new ReadConfig();
	//Properties prop;
	public String excellocation=readconfig.Excel();

	public static Logger log= LogManager.getLogger(BaseTest.class.getName());
	@Test
	public void SignUP() throws IOException, InterruptedException
	{	
		SignUP sp=new SignUP(driver);
		driver.get(baseURL);
	sp.Profile_click().click();
		log.info("clicked on the profile");
	test.info("clicked on the profile");
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
		sp.SignUp().click();
		log.info("clicked on the SignUp option");
		test.info("clicked on the SignUp option");
		sp.email().sendKeys(email);
		log.info("Email entered successfully");
		test.info("Email entered successfully");
		sp.password().sendKeys(password);
		log.info("password entered successfully");
		test.info("password entered successfully");
		sp.signup_click().click();
		log.info("Signup Successfully...... ");
		test.info("Signup Successfully...... ");
		Thread.sleep(2000);
		
	}
}
