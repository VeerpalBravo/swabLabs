package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageClasses.SLabsAutoTestResults;

public class TC04_logOut extends BaseClass{
	
	@Test
	public void logOut() throws InterruptedException
	{
		test = report.startTest("Logout");
		String expTitle="Sauce Labs | Accounts";
		SLabsAutoTestResults satr=new SLabsAutoTestResults(driver);
		satr.accntClick();
		test.log(LogStatus.INFO, "Click on account icon");
		Thread.sleep(2000);
		satr.logoutClick();
		test.log(LogStatus.INFO, "Click on logout option");
		Thread.sleep(2000);
		String actTitle=driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
		
	}
	@AfterMethod
	public void flushData() {
		report.endTest(test);
		report.flush();
		
	}

}
