package Encapsulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POMTestScript {
	public static  WebDriver driver=null;
	@Test
	public void loginpage()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://online.actitime.com/mr2/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		POMlogin lp=new POMlogin(driver);
		lp.setUsername("admin");
		lp.setPassword("687");
		lp.login();
		
		String errormessage = driver.findElement(By.xpath("//span[contains(text(),'Username or Password is invalid. Please try again.')]")).getText();
	    System.out.println(errormessage);
	    
	    lp.setUsername("santoshi.prabhat");
	    lp.setPassword("India@1947");
	    lp.login();
	}

}
