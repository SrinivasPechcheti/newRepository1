package com.mindtree.PageObjects;
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
	
	@FindBy(xpath="//*[@id=\'header\']/section/div/ul[2]/li[3]/a")
	WebElement giftcardOption;
	
	@FindBy(xpath="//*//*[@id=\'app-container\']/div/main/section/section[1]/ul/li[6]/div/div/button")
	WebElement choose;
	
//	@FindBy(xpath="//*[@id='app-container']/div/main/section/section[2]/div/section[2]/div[1]/button[1]")
//	WebElement amount_choose;
//	
//	@FindBy(xpath="//*[@id='app-container']/div/main/section/section[2]/div/section[2]/button")
//	WebElement nextButton;
//	
//	@FindBy(xpath="//*[@id=\'ip_4036288348\']")
//	WebElement receiptName;
//	@FindBy(xpath="//*[@id=\'ip_1082986083\']")
//	WebElement cName;
//	@FindBy(xpath="//*[@id=\'ip_4081352456\']")
//	WebElement cemail;
//	@FindBy(xpath="//*[@id=\'ip_2121573464\']")
//	WebElement phnNo;
//	@FindBy(xpath="//*[@id=\'app-container\']/div/main/section/section[3]/form/button")
//	WebElement conformButton;
	public WebElement giftCard_click() {
		return giftcardOption;
	}
	public WebElement choose_click() {
		return choose;
	}
//	public WebElement amount_click() {
//		return amount_choose;
//	}
//	public WebElement next_click() {
//		return nextButton;
//	}
//
//	public WebElement Repname() {
//		return receiptName;
//	}
//	public WebElement name() {
//		return cName;
//	}
//	public WebElement email() {
//		return cemail;
//	}
//	public WebElement moblie() {
//		return phnNo;
//	}
//	public WebElement conform() {
//		return conformButton;
//	}
}