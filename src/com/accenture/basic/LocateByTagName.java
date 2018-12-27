package com.accenture.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByTagName {
	public static WebDriver driver= null;

	public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\gadda\\workspace\\seleniumproject\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://facebook.com");
			
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			System.out.println(allLinks.size());
	}

}
