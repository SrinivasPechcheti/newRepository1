package com.mindtree.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
public class HomePage {

	public WebDriver driver;
	public ExtentTest test;

	public HomePage(WebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\'header\']/div[1]")
	WebElement Logo;


	public WebElement Homepage_logo()
	{
		return Logo;
	}

}