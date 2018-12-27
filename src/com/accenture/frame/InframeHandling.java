package com.accenture.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InframeHandling {
	public static WebDriver driver= null;

	public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Frames.html");
			driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
			WebElement frame1=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
			driver.switchTo().frame(frame1);
			//driver.switchTo().frame(0);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("prabh");
			
			
	}
	

}
