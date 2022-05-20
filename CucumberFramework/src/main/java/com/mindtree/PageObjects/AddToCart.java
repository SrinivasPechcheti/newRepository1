package com.mindtree.PageObjects;
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
	@FindBy(xpath="//*[@id=\'cart-badge\']/span[1]")
	WebElement add_to_cart;
	
	
	@FindBy(xpath="//span[contains(text(),'CONTINUE SHOPPING')]")
	WebElement checkout;


	public WebElement add_to_cart() {
		return add_to_cart;
	}
	
	public WebElement checkout_availibility() {
		return checkout;
	}
}

