package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class SignUp extends BasePage{

	public SignUp(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[@id='signUpWithEmail']")
	public WebElement signUp;
	
	@FindBy(xpath="//a[contains(text(), 'Create an Account')]")
	public WebElement createAccnt;
	
	
	public void doClicksignUp()
	{
		signUp.click();
	}
	


}
