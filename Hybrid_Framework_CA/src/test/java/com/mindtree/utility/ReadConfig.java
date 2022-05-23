package com.mindtree.utility;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ReadConfig {
	Properties prop;
	public WebDriver driver;
	public ReadConfig()
	{
		File src = new File("C:\\Users\\Chinnu\\eclipse-workspace2\\ComprehensiveAssessment\\Configuration\\config.properties"); //srinivas

		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}

	public String getApplicationURL()
	{
		String url=prop.getProperty("baseURL");
		return url;
	}
	public String getBrowser()
	
	{
		
			String browser=prop.getProperty("browser");
			return browser;
	}
	public String Excel()
	{
		String excel=prop.getProperty("Excel_Location");
		return excel;
	}

	public String getChromePath()
	{ 
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Chinnu\\eclipse-workspace2\\ComprehensiveAssessment\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		String chromepath=prop.getProperty("chromepath");
		return chromepath;
	}

	public String getIEPath()
	{
		String iepath=prop.getProperty("iepath");
		return iepath;
	}

	public String getFirefoxPath()
	{
		String firefoxpath=prop.getProperty("firefoxpath");
		return firefoxpath;
		
	}


}

