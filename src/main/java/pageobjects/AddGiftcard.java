package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddGiftcard{

	public WebDriver driver;

	public AddGiftcard(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//a[@href='https://www.bigsmall.in/products/gift-card']")
	WebElement gift_card;

	@FindBy(xpath="//button[@name='add']")
	WebElement add;

	@FindBy(xpath="//span[contains(text(),'Go To Checkout')]")
	WebElement checkout;


	public WebElement Gift_card_section() {
		return gift_card;
	}
	public WebElement Add_cart() {
		return add;
	}
	public WebElement checkout_availibility() {
		return checkout;
	}
}
