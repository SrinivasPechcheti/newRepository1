package com.mindtree.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SelectProduct {
public WebDriver driver;
	
	public SelectProduct(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\'topnav_wrapper\']/ul/li[1]/span")
	WebElement hoverElement;
	
	@FindBy(xpath="//*[@id=\'topnav_wrapper\']/ul/li[1]/div/div/ul/li[1]/ul/li[2]/a/span")
	WebElement selectItem;
	
	@FindBy(xpath="//h1[contains(text(),'Lounge And Accent Chairs')]")
	WebElement subpage_visiblity;
	
	public WebElement Hover_select() {
		return hoverElement;
	}

	public WebElement Select_Item() {
		return selectItem;
	}
	
	public WebElement Page_Loaded() {
		return subpage_visiblity;
	}
	
}
