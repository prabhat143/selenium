package com.accenture.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement List=driver.findElement(By.id("multi-select"));
		Select option=new Select(List);
		System.out.println(option.isMultiple());
		option.selectByIndex(0);
		option.selectByValue("Ohio");
		option.selectByVisibleText("Pennsylvania");
		
		option.deselectByValue("Ohio");
		
		
		
		

	}

}
