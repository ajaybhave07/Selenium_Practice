package com.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		WebElement element = driver.findElement(By.xpath("//a[text()='Sign in']"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(element).build().perform();
		
		driver.quit();

	}

}
