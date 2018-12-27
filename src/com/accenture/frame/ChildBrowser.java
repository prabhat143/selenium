package com.accenture.frame;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
	public static WebDriver driver= null;

	public static void main(String[] args) throws Exception {
			
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("http://www.popuptest.com/");
			
		    driver.findElement(By.linkText("Multi-PopUp Test")).click();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    String handle=driver.getWindowHandle();
		    System.out.println(handle);
		    
		    Set<String> handles=driver.getWindowHandles();
		    for(String handle1: handles)
		    {
		    	driver.switchTo().window(handle1);
		    	String url = driver.getCurrentUrl();
		    	System.out.println(url);
		    	
		    	if(handle1.equals(handle))
		    	{
		    		continue;
		    	}
		    	else
		    	driver.close();
		    }
	}

}
