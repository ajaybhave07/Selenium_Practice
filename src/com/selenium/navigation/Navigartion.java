package com.selenium.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigartion {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./resources_1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");  // opens google
	
			
		driver.navigate().to("https://www.facebook.com");
		
		System.out.println(driver.getTitle()); //Facebook – log in or sign up


		driver.navigate().back();
			
		System.out.println(driver.getTitle()); // google
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());  //Facebook – log in or sign up

		driver.close();

			}
	
	
	public static void waitTime(int i)
	{
			try
			{
				Thread.sleep(i);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}


// navigate and get are synonms to each other naviagte().to() internally calls get()