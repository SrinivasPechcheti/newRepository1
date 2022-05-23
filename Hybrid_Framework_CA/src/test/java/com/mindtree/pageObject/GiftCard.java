package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class GiftCard {
public WebDriver driver;
	
	public GiftCard(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='featuredLinksBar__link'][normalize-space()='Gift Cards']")
	WebElement giftcardOption;
	
	@FindBy(xpath="//img[@alt='Birthday/Anniversary Gift Card by Urban Ladder']")
	WebElement choose;
	
	@FindBy(xpath="//div[@class='_3jn98 _23tqD _3k9Vm']//button[1]")
    WebElement amount_choose;
	
	@FindBy(xpath="//button[normalize-space()='Next']")
	WebElement nextButton;
	
	@FindBy(xpath="//input[@id='ip_4036288348']")
	WebElement receiptName;
	
	@FindBy(xpath="//input[@id='ip_137656023']")
	WebElement receiptEmail;
	
	@FindBy(xpath="//input[@id='ip_1082986083']")
	WebElement cName;
	
	@FindBy(xpath="//input[@id='ip_4081352456']")
	WebElement cemail;
	
	@FindBy(xpath="//input[@id='ip_2121573464']")
	WebElement phnNo;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement conformButton;
	
	@FindBy(xpath="//span[normalize-space()='Proceed to payment']")
	WebElement payment;
	
	
	public WebElement giftCard_click() {
		return giftcardOption;
	}
	public WebElement choose_click() {
		return choose;
	}
	public WebElement amount_click() {
		return amount_choose;
	}
	public WebElement next_click() {
		return nextButton;
	}

	public WebElement Repname() {
		return receiptName;
	}
	public WebElement RepEmail() {
		return receiptEmail;
	}
	public WebElement name() {
		return cName;
	}
	public WebElement email() {
		return cemail;
	}
	public WebElement moblie() {
		return phnNo;
	}
	public WebElement conform() {
		return conformButton;
	}
	public WebElement payment() {
		return payment;
	}
}