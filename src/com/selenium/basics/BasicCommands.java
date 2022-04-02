package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
		
		System.out.println(element.getTagName()); // a
		
		System.out.println(element.isDisplayed());
	
	    

		driver.close();
	}

}
