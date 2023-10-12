package org.testing.Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testing.base.base;
import org.testing.pages.homepage;
import org.testing.pages.loginpage;
import org.testing.pages.logoutpage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tc2 extends base
{
	@Test
	public void historylaunch() throws InterruptedException
	{
		loginpage login=new loginpage(driver, pr);
		login.signin("seleniumdummyapi", "Dummy@123");
		homepage history=new homepage(driver, pr);
		history.history();
		logoutpage logout=new logoutpage(driver, pr);
		logout.logout();
	}	
}
