package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

@SuppressWarnings("unused")
public class homepage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();

	}

	@Test(dataProvider = "getData")
	public void BasePageNavigation(String username, String password) throws IOException {
		// one is inheritance
		// creating object of the class

		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.popUpClose().click();
		l.getLogin().click(); // it is the same with using by.cssseletor.
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		// System.out.println(text);
		lp.getLoginClick().click();
		log.info("Login done");

	}

	@AfterTest
	public void destroyIt() {
		driver.quit();
	}

	@DataProvider
	public Object[][] getData() {
		// row stands for how many different data types test should run
		// column stands for how many values for each test
		Object[][] data = new Object[2][2];
		// 0th row
		data[0][0] = "nonrestirceduser@mail.com";
		data[0][1] = "123456";
		// data[0][2] = "Restrcited User";
		// 1st row
		data[1][0] = "restirceduser@mail.com";
		data[1][1] = "654321";
		// data[1][2] = "Restrcited User";

		return data;
	}
}
