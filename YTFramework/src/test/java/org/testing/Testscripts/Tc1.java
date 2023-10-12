package org.testing.Testscripts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testing.base.base;
import org.testing.pages.homepage;
import org.testing.pages.loginpage;
import org.testing.pages.logoutpage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc1 extends base
{
	@Test
	public void login() throws InterruptedException, FileNotFoundException, IOException
	{
		
		loginpage login=new loginpage(driver, pr);
		login.signin("seleniumdummyapi", "Dummy@123");
		homepage trending=new homepage(driver, pr);
		trending.trending();
		logoutpage logout=new logoutpage(driver, pr);
		logout.logout();
	}
	
	
}
