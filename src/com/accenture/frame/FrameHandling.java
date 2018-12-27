package com.accenture.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	public static WebDriver driver= null;

	public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Frames.html");
			//driver.switchTo().frame(0); -- switching frame using index
			//-- switching using web element
			WebElement frame=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
			driver.switchTo().frame(frame); 
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("prbaht");
	}

}
