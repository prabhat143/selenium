package com.accenture.basic;
//first project
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstSeleniumScript {
	public static WebDriver driver= null;

	public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://www.gmail.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//Wait wait1=new FluentWait(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
			//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			WebElement email=driver.findElement(By.id("identifierId"));
			email.sendKeys("gaddamprabhat");
			driver.findElement(By.xpath("//span[text()='Next']")).click();			
			WebElement pass=driver.findElement(By.name("password"));
			pass.sendKeys("1947@India");
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/content[1]/span[1]")).click();
			
			
			//Explicitly wait
			WebDriverWait wait=new WebDriverWait(driver,10);
			//wait.until(ExpectedConditions.titleContains("Inbox (67,148) - gaddamprabhat@gmail.com - Gmail"));
			WebElement compose=driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));
			wait.until(ExpectedConditions.visibilityOf(compose));
			compose.click();
			
			
	}

}
