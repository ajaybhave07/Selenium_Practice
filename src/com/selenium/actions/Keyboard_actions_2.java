package com.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_actions_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		fname.sendKeys("selenium");
		
		
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.TAB)  // tab to select the text field
		.sendKeys("automation")
		.sendKeys(Keys.TAB)        // this tab to switch tab
		.sendKeys("879897897")
		.sendKeys(Keys.TAB)		   // this tab to switch tab
		.sendKeys("password@123").build().perform();
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
