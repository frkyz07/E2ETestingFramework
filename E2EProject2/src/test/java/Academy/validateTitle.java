package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.LandingPage;
import resources.base;

public class validateTitle extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		
		driver = initializeDriver();
		log.info("Driver is Initialized");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigated to the home page");
	}

	@Test
	public void BasePageNavigation() throws IOException {
		// one is inheritance
		// creating object of the class
		LandingPage l = new LandingPage(driver);
		// l.popUpClose().click();
		String title = l.getText().getText();
		Assert.assertEquals(title, "FEATURED COURSES");
		Assert.assertTrue(l.navBar().isDisplayed());
		Assert.assertEquals(l.navBar().isDisplayed(), true);
		log.info("Succesfully validated text messages");
 
	}

	@AfterTest
	public void destroyIt() {
		driver.quit();
	}

}
