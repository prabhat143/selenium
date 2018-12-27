package Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridDemo {
	
	public static WebDriver driver=null;
	public static String nodeUrl=null;
	
	public static void main(String[] args) 
	{
		nodeUrl = "http://192.168.56.1:5555/wd/hub";
		DesiredCapabilities cap= DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		try{
	driver =new RemoteWebDriver(new URL(nodeUrl), cap);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("www.gmail.com");
	System.out.println("grid worked successfully");
	}
	catch(MalformedURLException e){
		e.printStackTrace();
	}
	}

}
