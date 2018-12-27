package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginToApp {
	
	public WebDriver driver=null;
	
	@BeforeMethod
	public void PreConditionS()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Parameters({"uname","pass"})
	@Test
	public void login(String uname,String pass){
		driver.findElement(By.id("identifierId")).sendKeys(uname);
		driver.findElement(By.xpath("//span[text()='Next']")).click();			
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/content[1]/span[1]")).click();
		
		
		
	}

}
