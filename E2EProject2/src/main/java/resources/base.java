package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@SuppressWarnings("unused")
public class base {
	
	public WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public WebDriver initializeDriver() throws IOException {

		// chrome
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\frkyz\\git\\e2etesting\\E2EProject2\\src\\main\\java\\resources\\data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) 
		{
			// execute chrome
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\frkyz\\OneDrive\\Belgeler\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else if (browserName.equals("firefox")) 
		{
			// execute firefox
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\frkyz\\OneDrive\\Belgeler\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browserName.equals("edge")) 
		{
			// execute edge
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\frkyz\\OneDrive\\Belgeler\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}

	
}
