package testNg;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationdemo {
	
	@BeforeSuite
	public void beforeSuitMethod(){
		System.out.println("BeforeSuit");
			}
	
	@AfterSuite
	public void afterSuitMethod(){
		System.out.println("Aftersuit");
	}
	
	@BeforeTest
	public void beforeTestMethod(){
		System.out.println("beforetest");
	}
	
	@AfterTest
	public void afterTestMethod(){
		System.out.println("AfterTest");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("before class");
	}
	
	@AfterClass
	public void afterClassMehtod(){
		System.out.println("afterclass");
			}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("beforemethod");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("afterMethod");
	}
	@Test
	public void testMethod(){
		System.out.println("TEst");
	}
	

}
