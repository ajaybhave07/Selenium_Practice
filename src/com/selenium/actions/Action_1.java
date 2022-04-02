package com.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		
		WebElement parent = driver.findElement(By.xpath("//a[@title='References']/following-sibling::a[@title='Exercises']"));
		WebElement element= driver.findElement(By.xpath("//a[text()='HTML Quiz']"));

		Actions action = new Actions(driver);
		action.click(parent).click(element).build().perform();
		
		
		driver.close();
	}

}
