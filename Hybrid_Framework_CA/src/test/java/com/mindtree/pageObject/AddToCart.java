package com.mindtree.pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AddToCart {
	public WebDriver driver;

	public AddToCart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id='cart-badge']//span[@class='header-icon']//*[name()='svg']")
	WebElement add_to_cart;
	
	
	@FindBy(xpath="//a[@class='button continue']")
	WebElement checkout;

	@FindBy(xpath="//a[@href='/sofa-set?src=explore_categories']")
	WebElement sofa;
	
	@FindBy(xpath="//img[@title='Sofas Furniture']")
	WebElement  select_sofa;
	
	
	public WebElement add_to_cart() {
		return add_to_cart;
	}
	
	public WebElement checkout() {
		return checkout;
	}
	public WebElement sofa() {
		return sofa;
	}
	public WebElement select_sofa() {
		return select_sofa;
	}
}
