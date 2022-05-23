package com.mindtree.pageObject;
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

	@FindBy(xpath="//a[normalize-space()='Contact Us']")
	WebElement contactus;
	
	@FindBy(xpath="//input[@id='help-center-search-input']")
	WebElement textbox;
	
	@FindBy(xpath="//input[@id='help-center-search-input']")
	WebElement enter;

	@FindBy(xpath="//span[@class='entries-title']")
	WebElement confirmation;
	
	public WebElement Contact_us() {
		return contactus;
	}	
	
	public WebElement MessageBox() {
		return textbox;
	}
	public WebElement Send() {
		return enter;
	}
	public WebElement Sending_confirmation() {
		return confirmation;
	}
}

