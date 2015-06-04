package com.koya.AutoFrame.Frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Functions {

	public static void Login(String username,String password,String Url)
	{
		  WebDriver driver = new FirefoxDriver();
          driver.get(Url);
          driver.manage().window().maximize();
          driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys(username);
          driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys(password);
          driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
	}
	
}
