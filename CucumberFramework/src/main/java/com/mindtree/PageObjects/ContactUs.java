package com.mindtree.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs{
	public WebDriver driver;
	
	public ContactUs(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\'footer-links\']/div[1]/div[2]/ul[2]/li[1]/a")
	WebElement contactus;
	
	

	@FindBy(xpath="//span[contains(text(),'Search results for"
			+ " 'What can I do if my product is damaged?'')]")
	WebElement confirmation;
	
	public WebElement Contact_us() {
		return contactus;
	}	
	
	
	public WebElement Sending_confirmation() {
		return confirmation;
	}
}