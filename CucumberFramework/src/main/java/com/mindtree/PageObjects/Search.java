package com.mindtree.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Search {
	public WebDriver driver;
	public Search(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\'search\']")
	WebElement SearchBox;
	
	
	@FindBy(xpath="//span[contains(text(),'carpet')][1]")
	WebElement product;
	
	
	public WebElement product_enter()
	{
		return SearchBox;
	}

	public WebElement productvisible()
	{
		return product;
	}
}
