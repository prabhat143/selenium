package com.accenture.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByPartialText {
	public static WebDriver driver= null;

	public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\gadda\\workspace\\seleniumproject\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			
			driver.get("https://facebook.com");
			
			WebElement doblink = driver.findElement(By.partialLinkText("date of birth?"));
			doblink.click();
	}
}
