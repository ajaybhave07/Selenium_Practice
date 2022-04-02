package com.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		
		WebElement frame = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frame);
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropable = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions action = new Actions(driver);
		//1st way
		//action.dragAndDrop(draggable, dropable).build().perform();
		
		
		//2nd way
		action.clickAndHold(draggable).moveToElement(dropable).release().build().perform();
		
		driver.switchTo().defaultContent();
		
		driver.close();
		
		
		//img[@alt='The chalet at the Green mountain lake']

	}

}
