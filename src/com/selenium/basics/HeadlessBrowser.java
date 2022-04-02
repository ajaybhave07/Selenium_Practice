package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		// selenium 3 onwards html unit driver is not the part of selenium hirercy
		//HtmlUnitDriver-- to use this concept we need to download HtmlUnitDriver jar.
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.freecrm.com/");
		System.out.println(driver.getTitle());
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		
		driver.close();
		
		

	}

}
