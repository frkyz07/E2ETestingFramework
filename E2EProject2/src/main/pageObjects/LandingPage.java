package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	private By signin = By.cssSelector("a[href*='sign_in']");
	private By text = By.xpath("//div//h2[text()='Featured Courses']");
	private By navbar = By.xpath("//div[@class='navbar navbar-default navbar-static-top']");

	public LandingPage(WebDriver driver) {

		this.driver = driver;
	}

	public LoginPage getLogin() {
		driver.findElement(signin).click();
		LoginPage lp = new LoginPage(driver);
		return lp;
	}

	public WebElement getText() {
		return driver.findElement(text);
	}

	public WebElement navBar() {
		System.out.println("Trying idenified navbar");
		return driver.findElement(navbar);
	}

}
