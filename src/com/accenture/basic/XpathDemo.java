package com.accenture.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	public static WebDriver driver= null;

	public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\gadda\\workspace\\seleniumproject\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://facebook.com");
			
			//absolute xpath
			WebElement fname=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
			fname.sendKeys("prabhat");
			
			//relative xapth
			WebElement sname=driver.findElement(By.xpath("//input[@id='u_0_l']"));
			sname.sendKeys("gaddam");
			
			//handling dyanamic xpath - contains - text
			WebElement email= driver.findElement(By.xpath("//label[contains(text(),'Email')]"));
			
			//handling dynamic xpath - conatins method for input box
			WebElement emailIp=driver.findElement(By.xpath("//input[contains(@id,'email')]"));
			
			//handling dynamic xpath - starts method
			WebElement forgotPWD=driver.findElement(By.xpath("//a[starts-with(text(),'Forgotten')]"));
			
			
	}
}
