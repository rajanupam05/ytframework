package org.testing.pages;


import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class utilities 
{
	ChromeDriver driver;
	Properties pr;
	public utilities(ChromeDriver driver, Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void like() throws InterruptedException
	{
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.PAGE_DOWN).perform();
		ac.click(driver.findElement(By.xpath(pr.getProperty("like")))).perform();;
	}
	public void subscribe() throws InterruptedException
	{
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.PAGE_DOWN).perform();
		ac.click(driver.findElement(By.xpath(pr.getProperty("subscribe")))).perform();;
		Thread.sleep(5000);
	}
	public void comment(String cmnt) throws InterruptedException
	{
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		ac.click(driver.findElement(By.xpath(pr.getProperty("comment_click")))).perform();;
		WebElement comment=driver.findElement(By.xpath(pr.getProperty("comment")));
		comment.sendKeys(cmnt);
		ac.keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);;
	}
}
