package dataDrivenTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import base.BaseClass;
import pageClasses.swagLabs;



public class LoginSwag extends BaseClass{
	//WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser()
	{
		
		driver.get("https://www.saucedemo.com");
		
	}
	
	@Test(dataProviderClass=utilities.excelReader.class, dataProvider="credential")
	
	public void login(String uname, String password) throws InterruptedException {
		
		System.out.println(driver);
		swagLabs sl=new swagLabs(driver);
		sl.sendCredentials(uname, password);
		System.out.println(driver);
		Thread.sleep(3000);
		sl.doClickSignIn();
		Thread.sleep(2000);
		
	}
	
	
	
	

}
