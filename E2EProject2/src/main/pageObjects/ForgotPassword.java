package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {

	public WebDriver driver;

	By email = By.xpath("//div//input[@id='user_email']");
	By sendMeInstructions = By.cssSelector("[type='submit']");
	By forgot_password = By.cssSelector("[href*='password/new']");
	
	public ForgotPassword forgotpassword() {
		
		driver.findElement(forgot_password).click();
		ForgotPassword fp = new ForgotPassword(driver);
		return fp;
	}

	public ForgotPassword(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement sendMeInstructions() {
		return driver.findElement(sendMeInstructions);
	}



}
