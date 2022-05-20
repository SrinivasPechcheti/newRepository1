package com.mindtree.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
public class Login {
	public WebDriver driver;
	public ExtentTest test;
	
	public Login(WebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='header']/div[1]/div/section[3]/ul/li[2]/span")
	WebElement profileButton;
	
	@FindBy(xpath="//*[@id=\'header\']/div[1]/div/section[3]/ul/li[2]/span/ul/li[1]/a")
	WebElement LoginButton;
	
	@FindBy(xpath="//*[@id=\'spree_user_email\']")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\'spree_user_password\']")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\'ul_site_login\']")
	WebElement login;
	
	public WebElement Profile_click()
	{
		return profileButton;
	}
	
	public WebElement login()
	{
		return LoginButton;
		
	}
	public WebElement email()
	{
		return email;
		
	}
	
	public WebElement password()
	{
		return password;
		
	}
	public WebElement login_click()
	{
		return login;
		
	}

}
