package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	By email = By.xpath("//div//input[@id='user_email']");
	By password = By.xpath("//div//input[@id='user_password']");
	By login_click = By.xpath("//div//input[@value='Log In']");
	By forgot_password = By.cssSelector("[href*='password/new']");
	
	public ForgotPassword forgotpassword() {
		
		driver.findElement(forgot_password).click();
		return new ForgotPassword(driver);
		
	}



	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getLoginClick() {
		return driver.findElement(login_click);
	}

}
