package com.selenium.windowhandlers;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling_4 {

	
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://demoqa.com/browser-windows");
		
		
		
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		//driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		ArrayList<String> array = new ArrayList<String>(driver.getWindowHandles());
		
      System.out.println(array);
      
      driver.switchTo().window(array.get(1));
      System.out.println("switched to window 1");
      driver.close();

      driver.switchTo().window(array.get(0));

       
      System.out.println("switched again to window 0");
      driver.close();
	}
}
