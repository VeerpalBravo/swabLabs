package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import base.BaseClass;
import pageClasses.CrossBrowser;
import pageClasses.SauceLabsAccounts;
import utilities.windowHandling;

public class TC01_AccountLogin extends BaseClass
{
	
	@BeforeMethod
	public void navigateToWindow() throws InterruptedException
	{
		windowHandling wh=new windowHandling();
		wh.handleWindows();
		//System.out.println(windowHandling.outValue);
		driver.switchTo().window(wh.outValue);
	}
	@Test
	public void accountLogin() throws InterruptedException {
		
		test = report.startTest("Account Login");		
		String expTitle="Sauce Labs | Automated | Test Results";
		
		CrossBrowser cb=new CrossBrowser(driver);
		cb.doClicksignIn();
		test.log(LogStatus.INFO, "Clicked on Sign In button for users");
		Thread.sleep(3000);
		SauceLabsAccounts sca=new SauceLabsAccounts(driver);
		sca.enterValues("veerpalgill", "v123K@123");
		test.log(LogStatus.INFO, "username and password entered");
		sca.loginBtnClick();
		test.log(LogStatus.INFO, "Clicked on Login Button");
		Thread.sleep(20000);
		String actTitle=driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
		
		
	}
	
	@AfterMethod
	public void flushData() {
		report.endTest(test);
		report.flush();
		
	}
}
