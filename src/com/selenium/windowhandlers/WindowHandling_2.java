package com.selenium.windowhandlers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling_2 {

	public static void main(String[] args) {
		//approch -2 of iterating over a window ids
		
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement linkedinLink =	driver.findElement(By.xpath("//div[@id='social-icons']//img[@alt='LinkedIn OrangeHRM group']"));
		
		
		linkedinLink.click();// opens a new window
		Set<String> windowIds = driver.getWindowHandles();
		
		// converting set to list
		List<String> wi_id = new ArrayList<String>(windowIds);
		
		String parentId=wi_id.get(0);
		System.out.println(parentId+" parent id");
		String childId=wi_id.get(1);
		System.out.println(childId+" child id");
		
		
		driver.quit();
		
		
		
		

	}

}
