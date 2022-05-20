package com.mindtree.PageObjects;

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

	@FindBy(xpath="//*[@id=\'header\']/section/div/ul[1]/li[1]/a")
	WebElement helpOption;
	
	

	@FindBy(xpath="//span[contains(text(),'Help Center')]")
	WebElement Help_Center;
	
	public WebElement helpOption() {
		return helpOption;
	}	
	public WebElement Sending_confirmation() {
		return Help_Center;
	}
}


