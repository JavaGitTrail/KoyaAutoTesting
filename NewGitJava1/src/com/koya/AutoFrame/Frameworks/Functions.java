package com.koya.AutoFrame.Frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Functions {

	public static WebDriver driver = new FirefoxDriver();
	  
	public static void Login(String username,String password,String Url)
	{
		
          driver.get(Url);
          driver.manage().window().maximize();
          driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys(username);
          driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys(password);
          driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
	}
	
	public static void SearchAgreement()
	{
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[2]/a/span")).click();
	}
	
	public static void ExecutedAgreements()
	{
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[2]/ul/li[1]/a")).click();
	}
	
	public static void DraftAgreements()
	{
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[2]/ul/li[2]/a")).click();
	}
	
	public static void GoBack()
	{
		driver.navigate().back();
	}
	
}
