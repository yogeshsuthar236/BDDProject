package Testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageobjects.Cart_Checkout;
import utilities.BaseTest;

public class CartCheckout_TC extends BaseTest{

	public static Logger log= LogManager.getLogger(BaseTest.class.getName());

	@Test
	public void cartcheckout() throws IOException, InterruptedException
	{
		driver.get(baseURL);
		Cart_Checkout cart=new Cart_Checkout(driver);
		cart.product_selection().click();
		cart.Add_cart().click();
		log.info("Product in cart displayed");
		test.info("Product in cart displayed");
		cart.Cart().click();
		log.info("Navigated to cart");
		test.info("Navigated to cart");
		cart.Go_Checkout().click();
		cart.Remove_whatsappimg().click();
		Assert.assertTrue(cart.continuebutton().isDisplayed());
		log.info("successfully navigated to the checkout page");
		test.info("successfully navigated to the checkout page");
	}
}
