package Testcases;

import java.util.Iterator;
import java.util.Set;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.Test;



import pageobjects.Newsletter_Locator;
import utilities.BaseTest;

public class Newsletter_locator_TC extends BaseTest{

	public static Logger log= LogManager.getLogger(BaseTest.class.getName());
	@Test
	public void Newsletter_Locator() throws InterruptedException
	{

		driver.get(baseURL);
		String title=null;
		Newsletter_Locator nl=new Newsletter_Locator(driver,test);
		nl.Newsletter().sendKeys("s4romitraj@gmail.com");
		log.info("User email id entered");
		test.info("User email id entered");
		nl.Submit_newletter().click();
		log.info("clicked on signup button");
		test.info("clicked on signup button");
		String main=driver.getWindowHandle();
		for(String handle : driver.getWindowHandles()) {
		if (!handle.equals(main))
		{
			driver.switchTo().window(handle);
		
			title=driver.getTitle();
			driver.close();
		}
		}
		driver.switchTo().window(main);
		Assert.assertEquals(title, "Newsletter");
		test.fail("Page not found");
	}
}
