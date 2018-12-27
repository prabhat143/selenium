package com.accenture.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByName {
	public static WebDriver driver= null;

	public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\gadda\\workspace\\seleniumproject\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			
			driver.get("https://facebook.com");
			
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys("gaddamprabhat@gmail.com");
			
			WebElement password = driver.findElement(By.name("pass"));
			password.sendKeys("India@1947");
	}
			
}
