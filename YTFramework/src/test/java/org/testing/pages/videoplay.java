package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class videoplay 
{
	ChromeDriver driver;
	Properties pr;
	public videoplay(ChromeDriver driver, Properties pr) 
	{
		this.pr=pr;
		this.driver=driver;
	}
	public void play() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement play=driver.findElement(By.xpath(pr.getProperty("video_play")));
		play.click();
		Thread.sleep(5000);
	}
	
}
