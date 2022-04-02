package com.selenium.iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/frames");
		
		WebElement element = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		
		//driver.switchTo().frame(element);
		driver.switchTo().frame(1);
		
		System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
		
		driver.switchTo().defaultContent();
		
		driver.close();
	}

}
