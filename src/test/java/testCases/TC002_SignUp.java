package testCases;


import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import base.BaseClass;
import pageClasses.CrossBrowser;
import pageClasses.SignUp;
import pageClasses.SignUpForFreeTrial;
import pageClasses.SwagLabs2;


public class TC002_SignUp extends BaseClass{		
	
	@Test
	public void signUp() throws InterruptedException {
		
		test = report.startTest("SignUp started");
		
		String expTitle="Sauce Labs | Get Started Guide";
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		SwagLabs2 s2=new SwagLabs2(driver);
		s2.doClickButton();
		test.log(LogStatus.INFO, "Clicked on button for dropdown");
		Thread.sleep(2000);
		s2.doClickAbout();
		test.log(LogStatus.INFO, "Clicked on About button");
		Thread.sleep(2000);
		CrossBrowser cb=new CrossBrowser(driver);
		cb.doClicksignIn();
		test.log(LogStatus.INFO, "Clicked on Sign In button for users");
		Thread.sleep(3000);
		cb.doClickcreateAccnt();
		test.log(LogStatus.INFO, "Click on create account link");
		Thread.sleep(3000);	
		SignUp su=new SignUp(driver);
		su.doClicksignUp();
		test.log(LogStatus.INFO, "Clicked on Sign Up with Email");
		Thread.sleep(3000);	
		
		SignUpForFreeTrial sft=new SignUpForFreeTrial(driver);
		//boolean actualpass=passwordValidation.isValidPassword(password);
		
		js.executeScript("window.scrollBy(0,200);");		
		js.executeScript("arguments[0].scrollIntoView(true);", sft.email);
		sft.registerValues("ramaadedkh3992@ymail.com", "iilzxlram589", "ght%67Thy");
		test.log(LogStatus.INFO, "Values entered for registration");
		
		js.executeScript("window.scrollBy(0,50);");		
		js.executeScript("arguments[0].scrollIntoView(true);", sft.uname);
		
		Thread.sleep(2000);
		sft.subscriptionChkbxClick();
		Thread.sleep(2000);
		sft.signUpBtnClick();
		test.log(LogStatus.INFO, "Clicked on Sign Up button");
		Thread.sleep(20000);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), expTitle);
		System.out.println(driver.getTitle());
		
		
	}
	
	@AfterMethod
	public void flushData() throws IOException {
		report.endTest(test);
		report.flush();
		
	}
	
	

}
