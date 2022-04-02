package com.selenium.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait_2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		
		
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@id='email']"));
		
		//overriding the wait to 5 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		 driver.findElement(By.xpath("//input[@id='pass']"));
		
		driver.quit();
		
	}

}
