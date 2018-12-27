package com.accenture.frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		
		List<WebElement> allinks=driver.findElements(By.tagName("a"));
		
		for(WebElement link:allinks){
			String text=link.getText();
			if(text!="" || text!=null){
				System.out.println(text);
			}
			
		}
	}

}
