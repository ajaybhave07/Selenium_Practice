package com.selenium.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_1 {
	
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

		WebElement username =	driver.findElement(By.xpath("//input[@id='email']"));
		WebElement passeword = driver.findElement(By.xpath("//input[@id='pass']"));
		
		sendKeys(driver,username,10,"abc@gamil.com");
		
		sendKeys(driver,passeword,5,"abcd1234");
		
		// this is the advantage of generic explicit wait method , we can provide different 
		//wait time for different web element.(10 secs and 5 secs).
	
		driver.quit();
	
	}
	public static void sendKeys(WebDriver driver , WebElement element,int timeout,String value)
	{
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		
	}

}

