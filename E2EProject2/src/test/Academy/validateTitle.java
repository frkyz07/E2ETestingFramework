package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class validateTitle extends resources.base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(resources.base.class.getName());
	LandingPage l ;
	

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
		l = new LandingPage(driver);
		// l.popUpClose().click();
		String title = l.getText().getText();
		Assert.assertEquals(title, "FEATURED COURSES");
		Assert.assertTrue(l.navBar().isDisplayed());
		Assert.assertEquals(l.navBar().isDisplayed(), true);
		log.info("Succesfully validated text messages");
 
	}
	@Test
	public void ValidateHeader() throws IOException {
		// one is inheritance
		// creating object of the class
		l = new LandingPage(driver);
		// l.popUpClose().click();
		String title = l.getHeader().getText();
		Assert.assertEquals(title, "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
		Assert.assertTrue(l.navBar().isDisplayed());
		Assert.assertEquals(l.navBar().isDisplayed(), true);
		log.info("Succesfully validated text messages");
 
	}

	@AfterTest
	public void destroyIt() {
		driver.quit();
	}

}
