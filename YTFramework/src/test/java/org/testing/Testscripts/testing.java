package org.testing.Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testing {
	ChromeDriver driver;
	ChromeOptions co;
	@BeforeMethod
	public void browserlaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver.exe");
		co=new ChromeOptions();
		co.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64\\chrome.exe");
		co.addArguments("--disable-notifications");
		driver=new ChromeDriver(co);
		driver.get("https://www.youtube.com/");
		Options op=driver.manage();
		Window w=op.window();
		w.maximize();
	}
	@Test
	public void login() throws InterruptedException
	{
		WebElement signin=driver.findElement(By.xpath("//a[@aria-label='Sign in']"));
		signin.click();
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("seleniumautomation70");
		WebElement next1=driver.findElement(By.xpath("//span[text()='Next']"));
		next1.click();
		Thread.sleep(5000);
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Strongpassward123@");
		WebElement next2=driver.findElement(By.xpath("//span[text()='Next']"));
		next2.click();
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		WebElement guide=driver.findElement(By.xpath("//yt-icon[@id='guide-icon']"));
		guide.click();
		WebElement trending=driver.findElement(By.xpath("//yt-formatted-string[text()='Trending']"));
		trending.click();
		Thread.sleep(10000);
		WebElement signo=driver.findElement(By.xpath("//img[@alt='Avatar image']"));
		signo.click();
		Thread.sleep(5000);
		WebElement signout=driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']"));
		signout.click();
		Thread.sleep(3000);
	}
	@AfterMethod
	public void browerclose() throws InterruptedException
	{
		driver.close();
	}

}
