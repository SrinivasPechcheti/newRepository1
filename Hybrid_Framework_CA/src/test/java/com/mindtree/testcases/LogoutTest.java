package com.mindtree.testcases;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.mindtree.pageObject.Logout;
import com.mindtree.utility.BaseTest;
public class LogoutTest extends BaseTest{
	

	public static Logger log= LogManager.getLogger(BaseTest.class.getName());
	@Test
	public void Login() throws IOException, InterruptedException
	{	
		Logout lo=new Logout(driver);
		driver.get(baseURL);
		lo.Profile_click().click();
		log.info("clicked on the profile");
		test.info("clicked on the profile");
		
		lo.logout().click();
		log.info("clicked on the logout option");
		test.info("clicked on the logout option");
		
		log.info("logout Successfully...... ");
		test.info("logout Successfully...... ");
		Thread.sleep(2000);
		
	}
}

