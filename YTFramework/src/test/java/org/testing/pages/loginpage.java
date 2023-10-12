package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage 
{
	ChromeDriver driver;
	Properties pr;
	public loginpage(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void signin(String username, String password) throws InterruptedException
	{
		WebElement signin=driver.findElement(By.xpath(pr.getProperty("signup")));
		signin.click();
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.xpath(pr.getProperty("email")));
		email.sendKeys(username);
		WebElement next1=driver.findElement(By.xpath(pr.getProperty("next")));
		next1.click();
		Thread.sleep(5000);
		WebElement pass=driver.findElement(By.xpath(pr.getProperty("password")));
		pass.sendKeys(password);
		WebElement next2=driver.findElement(By.xpath(pr.getProperty("next")));
		next2.click();
		Thread.sleep(5000);
	}
}
