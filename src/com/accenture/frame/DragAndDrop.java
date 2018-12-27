package com.accenture.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
     
     Actions actions=new Actions(driver);
     WebElement b1=driver.findElement(By.xpath("//h1[contains(text(),'Block 1')]"));
     WebElement b2=driver.findElement(By.xpath("//div[@id='column-2']"));
     actions.dragAndDrop(b1, b2).perform();


	}

}
