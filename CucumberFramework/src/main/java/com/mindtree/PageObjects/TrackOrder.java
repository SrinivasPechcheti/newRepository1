package com.mindtree.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class TrackOrder {
public WebDriver driver;
	
	public TrackOrder(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\'header\']/section/div/ul[1]/li[2]/a")
	WebElement trackOrderOption;
	
	@FindBy(xpath="//*[@id=\'ip_379403698\']")
	WebElement orderNo;
	
	@FindBy(xpath="//*[@id=\'ip_394711104\']")
	WebElement phnNo;
	
	@FindBy(xpath="//*[@id=\'app-container\']/div/main/section/form[1]/button")
	WebElement submit;
	
	public WebElement trackOrderOption_click() {
		return trackOrderOption;
	}
	public WebElement Order_click() {
		return orderNo;
	}
	public WebElement moblie() {
		return phnNo;
	}
	public WebElement submit_click() {
		return submit;
	}

}