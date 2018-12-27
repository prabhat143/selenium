package com.accenture.frame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBox {
	
 public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	WebElement listbox=driver.findElement(By.id("select-demo"));
	Select osel=new Select(listbox);
	//osel.selectByValue("Sunday");
	//osel.selectByIndex(3);
	//osel.selectByVisibleText("Wednesday");
	
	//Counting the number of option in list
	List<WebElement> alloption = osel.getOptions();
	ArrayList<String>allText = new ArrayList();
	int a = alloption.size();
	System.out.println(a);
	
	//fetch all the options from listbox
	for(int i=1;i<a;i++)
	{
		String text=alloption.get(i).getText();
		System.out.println(text);
	}
	//fetching and sorting options from listbox
	for(int i=0;i<a;i++)
	{
		String Text=alloption.get(i).getText();
		allText.add(Text);
	}
	Collections.sort(allText);
	System.out.println("After sorting");
	for(String text: allText)
	{
		System.out.println(text);
	}
}

}
