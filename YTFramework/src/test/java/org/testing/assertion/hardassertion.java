package org.testing.assertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class hardassertion 
{
	public static void assertion(ChromeDriver driver)
	{
		String expectedvalue="https://www.youtube.com/";
		String actualvalue=driver.getCurrentUrl();
		Assert.assertEquals(actualvalue, expectedvalue);
	}
}
