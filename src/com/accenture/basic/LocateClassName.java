package com.accenture.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateClassName {
	public static WebDriver driver= null;

	public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\gadda\\workspace\\seleniumproject\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			
			driver.get("https://facebook.com");
			
			WebElement createAccount = driver.findElement(By.className("_6j mvm _6wk _6wl _58mi _3ma _6o _6v"));
			createAccount.click();
	}

}
