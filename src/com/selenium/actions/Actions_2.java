package com.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		
		
	WebElement element=	driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
	WebElement link = driver.findElement(By.xpath("//a[@data-product='Automate']"));
	
	Actions action = new Actions(driver);
	
	action.moveToElement(element).click(link).build().perform();
	// hover over element and click on link
	
	Thread.sleep(2000);
	driver.close();
	

	}

}
