package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import base.BaseClass;
import pageClasses.SwagLabs2;


public class TC03_addToCart extends BaseClass{
	
	@Test
	public void addToCart() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		test = report.startTest("Add To cart");
		SwagLabs2 s2=new SwagLabs2(driver);
		s2.choosePriority();
		test.log(LogStatus.INFO, "Choose Priority low to high");
		s2.addCartClick();
		test.log(LogStatus.INFO, "Click on add to cart button");
		s2.shoppingCartLinkClick();
		test.log(LogStatus.INFO, "Click on shopping cart link button");
		s2.chkOutClick();
		test.log(LogStatus.INFO, "Click on checkout button");
		s2.enterValues("Raman", "jot", "g6h7j8");
		test.log(LogStatus.INFO, "enter details");
		js.executeScript("window.scrollBy(0,400);");		
		js.executeScript("arguments[0].scrollIntoView(true);", s2.conti);
		s2.continueClick();
		test.log(LogStatus.INFO, "Click on continue button");
		s2.finishClick();
		test.log(LogStatus.INFO, "Click on finish button");
		js.executeScript("window.scrollBy(0,400);");		
		js.executeScript("arguments[0].scrollIntoView(true);", s2.backHome);
		String actTxt=s2.backHome.getText();
		String expTxt="BACK HOME";
		System.out.println(actTxt);
		Assert.assertEquals(actTxt, expTxt);
		s2.backHomeClick();
		test.log(LogStatus.INFO, "Clicked on back home button");
		
	}
	@AfterMethod
	public void flushData() {
		report.endTest(test);
		report.flush();
		
	}

}
