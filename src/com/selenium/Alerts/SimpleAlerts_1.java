package com.selenium.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleAlerts_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		Thread.sleep(3000);
		
		alert.accept();
		
		driver.close();
		

	}

}
