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
