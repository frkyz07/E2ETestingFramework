package Academy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class homepage extends base {

	@Test(dataProvider = "getData")
	public void BasePageNavigation(String username, String password) throws IOException {
		driver = initializeDriver();
		String new_url = prop.getProperty("url");
		System.out.println(new_url);
		driver.get(new_url);
		// one is inheritance
		// creating object of the class
		LandingPage l = new LandingPage(driver);
		l.popUp().click();
		l.getLogin().click(); // it is the same with using by.cssseletor.
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		// System.out.println(text);
		lp.getLoginClick().click();
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
