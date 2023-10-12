package org.testing.pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testing.utilities.logcapture;
import org.testing.utilities.screenshotcapture;

public class homepage 
{
	ChromeDriver driver;
	Properties pr;
	public homepage(ChromeDriver driver, Properties pr) 
	{
		this.pr=pr;
		this.driver=driver;
	}

	
	public void trending() throws InterruptedException, IOException
	{
		try
		{
			Actions ac=new Actions(driver);
			ac.sendKeys(Keys.TAB).perform();
			ac.sendKeys(Keys.ENTER).perform();
			ac.click(driver.findElement(By.xpath(pr.getProperty("trending")))).perform();;
			Thread.sleep(10000);
			screenshotcapture.screenshot("c://eclipse/ytframeworkss/ss1.jpeg", driver);
			logcapture.takelog("trending", "testcase sucessfully worked");
		}
		catch (Exception e) 
		{
			screenshotcapture.screenshot("c://eclipse/ytfrmeworkerrorss/ss1.jpeg", driver);
			logcapture.takelog("trending", "found someerror"+e.getMessage());
			
		}
		
	}
	public void history() throws InterruptedException
	{
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.TAB).perform();;
		ac.sendKeys(Keys.ENTER).perform();;
		Thread.sleep(5000);
		ac.click(driver.findElement(By.xpath(pr.getProperty("history")))).perform();;
	}
	public void subscription() throws InterruptedException
	{
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.TAB).perform();;
		ac.sendKeys(Keys.ENTER).perform();;
		ac.click(driver.findElement(By.xpath(pr.getProperty("subscriptions")))).perform();;
		Thread.sleep(10000);
	}
	public void watchlater() throws InterruptedException
	{
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.TAB).perform();
		ac.sendKeys(Keys.ENTER).perform();
		ac.click(driver.findElement(By.xpath(pr.getProperty("watch_later")))).perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
	}
	public void library() throws InterruptedException
	{
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.TAB).perform();
		ac.sendKeys(Keys.ENTER).perform();
		ac.click(driver.findElement(By.xpath(pr.getProperty("library")))).perform();
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
	}
	
}
