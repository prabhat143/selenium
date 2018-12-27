package com.accenture.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static WebDriver driver= null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gadda\\workspace\\seleniumproject\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		driver.close();
		
		
	}

}
