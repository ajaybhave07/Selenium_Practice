package com.selenium.windowhandlers;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement linkedinLink =	driver.findElement(By.xpath("//div[@id='social-icons']//img[@alt='LinkedIn OrangeHRM group']"));
		
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);
		System.out.println("-----------------------------------------------");
		linkedinLink.click();// opens a new window
		
		Set<String> windowsId = driver.getWindowHandles();
		for(String st:windowsId)
		{
			System.out.println(st);
		}
		
		wait(2000);
		
		Iterator<String>itr=windowsId.iterator();
		String newWindowId=itr.next();
		
		System.out.println(newWindowId+" --parent");
		
		String childId=itr.next();
		System.out.println(childId+"--child");
		
		
		
		driver.quit();
	}
	
	
	public static void wait(int seconds)
	{
		try
		{
			Thread.sleep(seconds);
		}
		catch(Exception e)
		{
			
		}
	
	}

}


//output:
//CDwindow-6F2EF01F2C7AA836344A20111BEDDB3B
//-----------------------------------------------
//CDwindow-6F2EF01F2C7AA836344A20111BEDDB3B
//CDwindow-5D763600C8CFEA68BCB2EBFAAF60810E




