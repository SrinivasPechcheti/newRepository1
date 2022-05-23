package com.mindtree.pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Login {

	public WebDriver driver;
	
	public Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@class='header-icon-link user-profile-icon']//*[name()='svg']")
	WebElement profileButton;
	
	@FindBy(xpath="//a[@class='login-link authentication_popup']")
	WebElement LoginButton;
	
	@FindBy(xpath="//div[@id='password-credentials']//input[@id='spree_user_email']")
	WebElement email;
	
	@FindBy(xpath="//div[@class='password-wrap']//input[@id='spree_user_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='ul_site_login']")
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
