package com.accenture.frame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	public static WebDriver driver= null;

	public static void main(String[] args) throws Exception {
			
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
			driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
			Alert alert=driver.switchTo().alert();
			String text= alert.getText();
			System.out.println(text);
			Thread.sleep(3000);
			//alert.accept();--- to press ok button
			//alert.dismiss();--- to press cancel button
			alert.sendKeys("prabhat");
			alert.accept();
			
	}

}
