package com.mindtree.pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUP {

	public WebDriver driver;
	
	public SignUP(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[@class='header-icon-link user-profile-icon']//*[name()='svg']")
	WebElement profileButton;
	
	@FindBy(xpath="//a[@class='signup-link authentication_popup']")
	WebElement signinButton;
	
//	@FindBy(xpath="//*[@id=\'signup-module\']/div[3]/a")
//	WebElement lo;
//	
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
//	public WebElement lo() {
//		return lo;
//	}
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

