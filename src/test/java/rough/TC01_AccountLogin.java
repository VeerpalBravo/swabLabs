package rough;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageClasses.CrossBrowser;
import pageClasses.SauceLabsAccounts;
import pageClasses.SwagLabs2;
import pageClasses.swagLabs;

public class TC01_AccountLogin extends BaseClass
{
	
	@Test
	public void signUp() throws InterruptedException {
		
		test = report.startTest("Account Login");
		String expTitle="Sauce Labs";
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		Thread.sleep(3000);	
		
		swagLabs sl=new swagLabs(driver);
		sl.sendCredentials("standard_user", "secret_sauce");
		test.log(LogStatus.INFO, "username and password entered for standard user of the website");
		Thread.sleep(3000);
		sl.doClickSignIn();
		test.log(LogStatus.INFO, "Clicked on sign In button");
		Thread.sleep(2000);
		SwagLabs2 s2=new SwagLabs2(driver);
		s2.doClickButton();
		test.log(LogStatus.INFO, "Clicked on button having list");
		Thread.sleep(2000);
		s2.doClickAbout();
		test.log(LogStatus.INFO, "Clicked on about button");
		Thread.sleep(2000);
		CrossBrowser cb=new CrossBrowser(driver);
		cb.doClicksignIn();
		test.log(LogStatus.INFO, "Clicked on Sign In button for users");
		Thread.sleep(3000);
		SauceLabsAccounts sca=new SauceLabsAccounts(driver);
		sca.enterValues("veerpal", "v123K@123");
		test.log(LogStatus.INFO, "username and password entered");
		sca.loginBtnClick();
		test.log(LogStatus.INFO, "Clicked on Login Button");
		Thread.sleep(5000);
		String actTitle=driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
		System.out.println(driver.getTitle());
		
	}
	
	@AfterMethod
	public void flushData() {
		report.endTest(test);
		report.flush();
		
	}
}
