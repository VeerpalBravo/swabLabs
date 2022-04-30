package testCases;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageClasses.CrossBrowser;
import utilities.windowHandling;

public class TC02_Resources extends BaseClass{
	@BeforeMethod
	public void navigateToUrl() throws InterruptedException
	{
		driver.navigate().to("https://saucelabs.com/");
		Thread.sleep(2000);
	}
	@Test
	public void resources() throws InterruptedException
	{
		test = report.startTest("Resources");
		//WebDriverWait t = new WebDriverWait(driver, 30); 
		
		CrossBrowser cb=new CrossBrowser(driver);
		//t.until(ExpectedConditions.visibilityOf(cb.resources));  
		//t.until(ExpectedConditions.elementToBeClickable(cb.resources));
		cb.mousehoverResources();
		test.log(LogStatus.INFO, "MouseHover on Resources");
		cb.documentationClick();
		test.log(LogStatus.INFO, "Clicked on documentation link");
		//t.until(ExpectedConditions.visibilityOf(cb.article));  
		//t.until(ExpectedConditions.elementToBeClickable(cb.article));
				
		String activeWindow="Sauce Labs Documentation, Developer Community & Resources | Resources & Community";
		windowHandling wh=new windowHandling();
		wh.handleWindows();
		String actualValueHandle=wh.actualTitle;
		Assert.assertEquals(actualValueHandle,  activeWindow);
		
	}
	@AfterMethod
	public void flushData() {
		report.endTest(test);
		report.flush();
		
	}


}
