package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageClasses.swagLabs;

public class TC001_initialSignIn extends BaseClass{
	
	@Test
	@Parameters({"uname","passW"})
	public void initialSignIn(String uname, String passW) throws InterruptedException
	{
		ExtentReports rep=report;
		test = rep.startTest("Standard-User Login");
		swagLabs sl=new swagLabs(driver);
		sl.sendCredentials(uname, passW);
		test.log(LogStatus.INFO, "username and password entered for standard user of the website");
		sl.doClickSignIn();
		test.log(LogStatus.INFO, "Clicked on Login button");
		Thread.sleep(3000);
		
		String expURL="https://www.saucedemo.com/inventory.htmlcurrent URL";
		String actURL=driver.getCurrentUrl()+"current URL";
		Assert.assertEquals(actURL, expURL);
		
		rep.endTest(test);
		rep.flush();
	}
	
	@AfterMethod
	public void flushData() {
		
		
	}

}
