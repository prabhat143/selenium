package com.accenture.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCSSSelector {

		public static WebDriver driver= null;

		public static void main(String[] args) throws Exception
		{
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\gadda\\workspace\\seleniumproject\\Drivers\\chromedriver.exe");
				driver= new ChromeDriver();				
				driver.get("https://facebook.com");
				
				WebElement email = driver.findElement(By.cssSelector("input[id= 'email']"));
				email.sendKeys("prabhat");
				
				WebElement linkText = driver.findElement(By.linkText("Terms"));
				linkText.click();
				
				Thread.sleep(3000);
				
				//driver.close();
				
				driver.quit();
	}

}
