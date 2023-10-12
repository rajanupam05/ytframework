package org.testing.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.assertion.hardassertion;
import org.testing.utilities.screenshotcapture;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base 
{
	public ChromeDriver driver;
	public ChromeOptions co;
	public Properties pr;
	@BeforeMethod
	public void browserlaunch() throws FileNotFoundException, IOException
	{
		try{
		File f=new File("../YTFramework/object.properties");
		pr=new Properties();
		pr.load(new FileReader(f));
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver.exe");
		co=new ChromeOptions();
		co.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64\\chrome.exe");
		co.addArguments("--disable-notifications");
		
		
		driver=new ChromeDriver(co);
		driver.get("https://www.youtube.com/");
		
		Options op=driver.manage();
		Window w=op.window();
		w.maximize();
		hardassertion.assertion(driver);
		screenshotcapture.screenshot("c:\\eclipse\\pass.jpg", driver);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			screenshotcapture.screenshot("c:\\eclipse\\error.jpg", driver);
		}
	}
	@AfterMethod
	public void browerclose() throws InterruptedException
	{
		driver.close();
	}
}
