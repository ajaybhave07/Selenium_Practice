package com.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		
		
	WebElement element=	driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
	
	
	Actions action = new Actions(driver);
	action.moveToElement(element).build().perform();
	
	Thread.sleep(2000);
	
	driver.close();
	

	}

}
