package org.testing.Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testing.base.base;
import org.testing.pages.loginpage;
import org.testing.pages.logoutpage;
import org.testing.pages.utilities;
import org.testing.pages.videoplay;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tc4 extends base
{
	@Test
	public void like() throws InterruptedException
	{
		loginpage login=new loginpage(driver, pr);
		login.signin("seleniumdummyapi", "Dummy@123");
		videoplay play=new videoplay(driver, pr);
		play.play();
		utilities like=new utilities(driver, pr);
		like.like();
		logoutpage logout=new logoutpage(driver, pr);
		logout.logout();
	}
	
}
