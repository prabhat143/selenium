package Encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMlogin {
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement pwd;
	
	@FindBy(xpath="//a[@id='loginButton']//div[contains(text(),'Login')]")
	private WebElement clicklogin;
	
	public POMlogin(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String um){
		username.sendKeys(um);
	}
	
	public void setPassword(String pw){
		pwd.sendKeys(pw);
	}
	
	public void login(){
		clicklogin.click();
	}
	

}
