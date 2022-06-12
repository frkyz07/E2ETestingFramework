package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class validateTitle extends base {

	@Test
	public void BasePageNavigation() throws IOException {
		driver = initializeDriver();
		String url = prop.getProperty("url");
		System.out.println(url);
		driver.get(url);
		// one is inheritance
		// creating object of the class
		LandingPage l = new LandingPage(driver);
		l.popUp().click();
		String title = l.getText().getText();
		Assert.assertEquals(title, "FEATURED COURSES");
		Assert.assertTrue(l.navBar().isDisplayed());
		Assert.assertEquals(l.navBar().isDisplayed(), true);
		driver.quit();

	}

}
