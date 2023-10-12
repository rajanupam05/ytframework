package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class logoutpage 
{
	ChromeDriver driver;
	Properties pr;
	public logoutpage(ChromeDriver driver, Properties pr)
	{
		this.pr=pr;
		this.driver=driver;
	}
	public void logout() throws InterruptedException
	{
		WebElement signoutlogo=driver.findElement(By.xpath(pr.getProperty("signoutlogo")));
		signoutlogo.click();
		Thread.sleep(5000);
		WebElement signout=driver.findElement(By.xpath(pr.getProperty("signout")));
		signout.click();
		Thread.sleep(5000);
	}

}
