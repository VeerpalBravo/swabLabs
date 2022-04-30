package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class SLabsAutoTestResults extends BasePage{

	public SLabsAutoTestResults(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="(//div[@class='absolute w-full h-full inset-0'])[2]")
	public WebElement accnt;
	
	@FindBy(xpath="(//a[@aria-current='page']/span[text()='Log out'])[2]")
	public WebElement logout;
	
	public void accntClick()
	{
		accnt.click();
	}
	
	public void logoutClick()
	{
		logout.click();
	}
	

}
