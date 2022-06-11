package Academy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class validateTitle extends base {

	@Test
	public void BasePageNavigation() throws IOException {
		driver = initializeDriver();
		System.out.println(prop.getProperty("url"));
		driver.get(prop.getProperty("url"));
		// one is inheritance
		// creating object of the class
		LandingPage l = new LandingPage(driver);
		driver.findElement(By.xpath("//div//button[text()='NO THANKS']")).click();
		String title = l.getText().getText();
		Assert.assertEquals(title, "FEATURED COURSES");
		Assert.assertTrue(l.navBar().isDisplayed());
		Assert.assertEquals(l.navBar().isDisplayed(), true);
		driver.quit();

	}

}
