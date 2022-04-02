package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInitalization {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		waiting();
		
		driver.close();
	
		

	}
	
	static void waiting()
	{
		try
		{
			Thread.sleep(2000);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
