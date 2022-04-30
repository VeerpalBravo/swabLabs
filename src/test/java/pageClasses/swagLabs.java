package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class swagLabs extends BasePage{

	public swagLabs(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@id='user-name']")
	public WebElement email;
	@FindBy(xpath="//input[@id='password']")
	public WebElement passw;
	@FindBy(xpath="//input[@id='login-button']")
	public WebElement login;
	
	public void sendCredentials(String email1, String pass)
	{
		email.sendKeys(email1);
		passw.sendKeys(pass);
	}
	public void doClickSignIn()
	{
		login.click();
	}
}
