package com.accenture.frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement departments=driver.findElement(By.xpath("//span[text()='Departments']"));
		Actions action=new Actions(driver);
		action.moveToElement(departments).perform();
		WebElement women=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[4]/div[3]/div[2]/a[12]/span[1]"));
		women.click();
		
		String actitle=driver.getTitle();
		String extitle = "International Shopping: Shop women's fashion that ships internationally";
	    if(actitle.equals(extitle)){
	    	System.out.println("Navigated to women fashion page");
	    }else
	    	System.out.println("failed to navigate to women fashion page");
				

	}

}
