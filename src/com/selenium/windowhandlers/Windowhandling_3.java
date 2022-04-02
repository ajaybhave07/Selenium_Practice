package com.selenium.windowhandlers;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

		System.out.println("parent window t "+driver.getTitle());//OrangeHRM

		WebElement link=driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
		
		link.click();
		Set<String> s1 = driver.getWindowHandles();
		List<String> list = new ArrayList(s1);

		//switching to new window.
		driver.switchTo().window(list.get(1));// get(1) because 1 is the index of new id.
		String parent = list.get(0);
		System.out.println(parent+"----");
		System.out.println(list.get(0)+"child");
		System.out.println("child window title "+driver.getTitle()); //		OrangeHRM HR Software | Free HR Software | HRMS | HRIS

		//alternate way , if we have multiple windows
//		for(String windowId:list)
//		{
//			driver.switchTo().window(windowId);
//			System.out.println(driver.getTitle());
//		}
		
		//after driver.close() child window will close as driver is pointing to child window
		//driver.quit() closes all the window at once.
		
		// to close a specific browser window
		
		for(String windowId:list)
		{
			String title = driver.switchTo().window(windowId).getTitle();
			if(title.equals("OrangeHRM"))//title of window we wnat to close 
			{
				driver.close(); // this will close parent window first
				
			}
			
		}

		
		driver.close();
		
		

	}

}
