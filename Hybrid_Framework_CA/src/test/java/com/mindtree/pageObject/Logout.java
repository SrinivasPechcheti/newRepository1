package com.mindtree.pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Logout {

	public WebDriver driver;
	
	public Logout(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@class='header-icon-link user-profile-icon']//*[name()='svg']")
	WebElement profileButton;
	
	@FindBy(xpath="//a[@id='logout']")
	WebElement LogoutButton;
	
	
	
	public WebElement Profile_click()
	{
		return profileButton;
	}
	
	public WebElement logout()
	{
		return LogoutButton;
		
	}

}
