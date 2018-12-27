package Encapsulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginApp {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/mr2/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("santoshi.prabhat");
		WebElement pwd=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pwd.sendKeys("india@1947");
		WebElement clicklogin=driver.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login')]"));
		clicklogin.click();
		
		String errormessage = driver.findElement(By.xpath("//span[contains(text(),'Username or Password is invalid. Please try again.')]")).getText();
		System.out.println(errormessage);
		username.sendKeys("santoshi.prabhat");
		pwd.sendKeys("India@1947");
		clicklogin.click();			
		
	}

}
