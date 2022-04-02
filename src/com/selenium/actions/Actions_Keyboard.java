package com.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Keyboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//input[@name='search']"));
		//line 1 
		//action.keyDown(element, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	
		// line 2
		action.click(element).keyDown(Keys.CONTROL).sendKeys("v").sendKeys(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
	
		
	driver.close();

	}

}

/*
 * line 1 and line 2 does the same job
 * */
