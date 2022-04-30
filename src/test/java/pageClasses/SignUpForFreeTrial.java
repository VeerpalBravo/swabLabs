package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class SignUpForFreeTrial extends BasePage{

	public SignUpForFreeTrial(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='username']")
	public WebElement uname;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement passw;
	
	@FindBy(xpath="//input[@id='subscription']")
	public WebElement subscriptionChkbx;
	
	@FindBy(xpath="//button[contains(text(), 'Sign up')]")
	public WebElement signUpBtn;
	
	public void registerValues(String email1, String uname1, String pass) throws InterruptedException
	{
		email.sendKeys(email1);
		Thread.sleep(1000);
		uname.sendKeys(uname1);
		Thread.sleep(1000);
		passw.sendKeys(pass);
		Thread.sleep(1000);
	}
	
	public void subscriptionChkbxClick()
	{
		subscriptionChkbx.click();
	}
	
	public void signUpBtnClick()
	{
		signUpBtn.click();
	}

}
