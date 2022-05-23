package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Help{
	public WebDriver driver;
	
	public Help(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='inherit contact-channel'][normalize-space()='Help']")
	WebElement helpOption;
	
	

	@FindBy(xpath="//a[normalize-space()='My Order Queries']")
	WebElement queries;
	
	@FindBy(xpath="	//div[contains(text(),'How do I track my order status?')]\r\n")
	WebElement query1;
	
	
	
	
	public WebElement helpOption() {
		return helpOption;
	}	
	public WebElement queries() {
		return queries;
	}
	public WebElement query1() {
		return query1;
	}
	
}


