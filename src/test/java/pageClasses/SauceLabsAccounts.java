package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class SauceLabsAccounts extends BasePage{

	public SauceLabsAccounts(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@id='idToken1']")
	public WebElement uname;
	
	@FindBy(xpath="//input[@id='idToken2']")
	public WebElement passw;
	
	@FindBy(xpath="//input[@id='loginButton_0']")
	public WebElement loginBtn;
	
	public void enterValues(String uname1, String passw1)
	{
		uname.sendKeys(uname1);
		passw.sendKeys(passw1);
	}
	
	public void loginBtnClick()
	{
		loginBtn.click();
	}
}
