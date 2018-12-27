package SamplePackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TicketBooking {
	static WebDriver driver;
    private static String url = "https://www.goindigo.in/?linkNav=home_header";
 
    //Setup Driver
    
    public static void main(String args[]) {
    		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
        driver.navigate().to(url);
        System.out.println("Launched the chrome browser with the given url");
        driver.manage().window().maximize();   
   
    		driver.findElement(By.xpath("//*[@class=\"one-way-tab bw-trip-tabs\"]")).click();
    		try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    		String newSet=driver.getWindowHandle();
    		driver.switchTo().window(newSet);
    		driver.findElement(By.xpath("//button[text()=\"OK\"]")).click();  
    		try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    		driver.switchTo().parentFrame();
    		driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[1]/input[1]")).clear();
    		driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[1]/input[1]")).sendKeys("Bengaluru");
    		
    		driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[2]/input[1]")).click();
    		driver.findElement(By.xpath(".//*[@id='oneWay']/form/div[1]/ul/li[2]/div/ul/li[7]")).click();
    		Select dropdown=new Select(driver.findElement(By.xpath("//*[@name=\"indiGoOneWaySearch.PassengerCounts[0].Count\"]")));
    		dropdown.selectByIndex(2);
    		Select dropdown1 =new Select(driver.findElement(By.xpath("//*[@name=\"indiGoOneWaySearch.PassengerCounts[1].Count\"]")));
    		dropdown1.selectByVisibleText("2");
    		driver.findElement(By.xpath("//*[@name=\"indiGoOneWaySearch.InfantCount\"]")).sendKeys(Keys.TAB);
    		driver.findElement(By.xpath(".//*[@id='ui-id-2-button']")).click();
    		driver.findElement(By.xpath(".//*[@id='oneWay']/form/div[2]/button")).click();
    		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    		WebDriverWait waitElement = new WebDriverWait(driver,20);
    		waitElement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"bookingWidgetContainer\"]/div/div/div/div[1]/div[2]/button")));
    		String title = driver.getTitle();
    		System.out.println(title);
    		
    
  
    	System.out.println("Closing the Browser");
        driver.quit();
}
    
}

 