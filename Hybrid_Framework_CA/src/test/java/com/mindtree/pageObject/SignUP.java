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
	
	@FindBy(xpath="//form[@id='signup_form']//input[@id='spree_user_email']")
	WebElement email;
	
	@FindBy(xpath="/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[2]")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Sign Up']")
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
