package com.accenture.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {
	public static WebDriver driver= null;

	public static void main(String[] args) throws Exception {
			
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://www.cleartrip.com/");
			driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
			driver.findElement(By.xpath("(//a[text()='25'])[1]")).click();
	}

}
