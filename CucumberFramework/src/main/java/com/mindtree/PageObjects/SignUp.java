package com.mindtree.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class SignUp {
	public WebDriver driver;
	public ExtentTest test;
	
	public SignUp(WebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='header']/div[1]/div/section[3]/ul/li[2]/span")
	WebElement profileButton;
	
	@FindBy(xpath="//*[@id=\'header\']/div[1]/div/section[3]/ul/li[2]/span/ul/li[2]/a")
	WebElement signinButton;
	
	@FindBy(xpath="//*[@id='spree_user_email']")
	WebElement email;
	
	@FindBy(xpath="//*[@id='spree_user_password']")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\'signup_form\']/input[4]")
	WebElement signup;
	
	public WebElement Profile_click()
	{
		return profileButton;
	}
	
	public WebElement SignUp()
	{
		return signinButton;
		
	}
	public WebElement email()
	{
		return email;
		
	}
	
	public WebElement password()
	{
		return password;
		
	}
	public WebElement signup_click()
	{
		return signup;
		
	}
}
