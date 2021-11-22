package Testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageobjects.Contactpage;
import utilities.BaseTest;

public class Contactpage_TC extends BaseTest{
	public static Logger log= LogManager.getLogger(BaseTest.class.getName());
	@Test
	public void ContactPage() throws InterruptedException
	{
		Contactpage cp=new Contactpage(driver);
		driver.get(baseURL);
		cp.Contact_us().click();
		log.info("contact page loaded successfully");
		test.info("contact page loaded successfully");
		cp.Name().sendKeys("Yogi");
		cp.EmailID().sendKeys("yogesh@gmail.com");
		cp.MessageBox().sendKeys("issue with the product");
		Thread.sleep(2000);
		cp.Send().click();
		test.info("Send button clicked successfully");
		test.warning("May fail due to random captcha verifiation");
		Thread.sleep(3000);
		Assert.assertTrue(cp.Sending_confirmation().isDisplayed());
		log.info("message sent successfully");
		test.info("message sent successfully");
	}
}
