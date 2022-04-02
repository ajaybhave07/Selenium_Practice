/**
 * 
 */
package com.selenium.navigation;

import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriverDemo {

	
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("");
		ChromeDriver driver1 = new ChromeDriver();
		
		
		//used for executing scripts in grid(remote machine)
		URL remoteAddress=null;
		Capabilities capabilities=null;
		WebDriver driver2 = new RemoteWebDriver(remoteAddress,capabilities);
		
		
		
		
		
		
		
		

	}

}

