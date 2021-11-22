package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	public WebDriver driver;
	public SearchPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//header//div//form//input[@type='search']")
	WebElement SearchBar;
	
	@FindBy(xpath="//span[contains(text(),'Harry Potter Pocket Watch')][1]")
	WebElement product;
	
	
	
	public WebElement product_enter()
	{
		return SearchBar;
	}

	public WebElement productvisible()
	{
		return product;
	}
	
	
}
