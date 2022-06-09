package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

public class homapage extends base {

	@Test
	public void BasePageNavigation() throws IOException 
	{
		driver = initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
	}
}
