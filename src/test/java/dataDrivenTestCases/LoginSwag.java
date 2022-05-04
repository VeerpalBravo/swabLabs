package dataDrivenTestCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
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
		
		test = report.startTest("Initial Login started");
		System.out.println(driver);
		swagLabs sl=new swagLabs(driver);
		sl.sendCredentials(uname, password);
		test.log(LogStatus.INFO, "Username and password entered");
		System.out.println(driver);
		Thread.sleep(3000);
		sl.doClickSignIn();
		test.log(LogStatus.INFO, "Clicked on sign In button");
		Thread.sleep(2000);
		report.endTest(test);
		report.flush();
		
	}
	@AfterMethod
	public void flushData() throws IOException {
		
		
	}
	
	
	
	

}
