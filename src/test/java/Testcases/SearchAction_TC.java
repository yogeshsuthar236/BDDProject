package Testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageobjects.SearchPage;
import utilities.BaseTest;

public class SearchAction_TC extends BaseTest{
	public static Logger log= LogManager.getLogger(BaseTest.class.getName());

	@Test
	public void Search() throws IOException, InterruptedException{
		driver.get(baseURL);
		SearchPage sp=new SearchPage(driver);
		sp.product_enter().sendKeys("Harry potter",Keys.ENTER);
		log.info("Entering the product name and Searching for the product");
		test.info("Entering the product name and Searching for the product");
		Thread.sleep(3000);
		Assert.assertTrue(sp.productvisible().isDisplayed());
		log.info("Searched product displayed successfully");
		test.info("Searched product displayed successfully");




	}
}
