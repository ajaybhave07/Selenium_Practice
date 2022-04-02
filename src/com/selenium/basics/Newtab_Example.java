package com.selenium.basics;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Newtab_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.open()");  // this line opens a new empty window
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(1));
		
		
		driver.get("https://www.facebook.com/");
		
		driver.switchTo().window(tabs.get(0));
		driver.close();

	}

}
