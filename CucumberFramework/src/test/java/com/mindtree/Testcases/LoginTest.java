package com.mindtree.Testcases;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.mindtree.PageObjects.Login;
import com.mindtree.utilities.BaseClass;
import com.mindtree.utilities.ReadConfig;
public class LoginTest extends BaseClass{
	ReadConfig readconfig=new ReadConfig();
	//Properties prop;
	public String excellocation=readconfig.Excel();

	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	@Test
	public void Login() throws IOException, InterruptedException
	{	
		driver.get(baseURL);
		Login lo=new Login(driver,test);
	lo.Profile_click().click();
		log.info("clicked on the profile");
	test.info("clicked on the profile");
		
		lo.login().click();
		log.info("clicked on the login option");
		test.info("clicked on the login option");
		lo.email().sendKeys("PechchetiSrinivas@gmail.com");
		log.info("Email entered successfully");
		test.info("Email entered successfully");
		lo.password().sendKeys("Srinivas@939");
		log.info("password entered successfully");
		test.info("password entered successfully");
		lo.login_click().click();
		log.info("Signup Successfully...... ");
		test.info("Signup Successfully...... ");
		Thread.sleep(2000);
		
	}
}
