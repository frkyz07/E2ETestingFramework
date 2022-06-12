package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	By signin = By.cssSelector("a[href*='sign_in']");
	By text = By.xpath("//div//h2[text()='Featured Courses']");
	By navbar = By.xpath("//div[@class='navbar navbar-default navbar-static-top']");
	By pop_up = By.xpath("//div//button[text()='NO THANKS']");

	public LandingPage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getLogin() {
		return driver.findElement(signin);
	}

	public WebElement getText() {
		return driver.findElement(text);
	}

	public WebElement navBar() {
		return driver.findElement(navbar);
	}
	public WebElement popUpClose() {
		return driver.findElement(pop_up);
	}
}
