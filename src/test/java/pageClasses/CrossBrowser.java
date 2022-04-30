package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class CrossBrowser extends BasePage{
	
	public CrossBrowser(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	Actions act=new Actions(driver);
	
	@FindBy(xpath="//a[@class='link has-text-white']/span")
	public WebElement signIn;
	
	@FindBy(xpath="(//a[@class='button is-rounded is-secondary']/span)[2]")
	public WebElement myAccnt;
	
	@FindBy(xpath="//body[1]/header[1]/div[1]/nav[1]/ul[1]/li[1]/ul[2]/li[4]/div[1]/div[1]/a[1]")
	public WebElement resources;
	
	@FindBy(xpath="(//a[@class='link has-chevron']/span[text()='Selenium'])[1]")
	public WebElement slnm;
	
	@FindBy(xpath="//body[1]/header[1]/div[1]/nav[1]/ul[1]/li[1]/ul[2]/li[4]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
	public WebElement doc;
	
	@FindBy(xpath="//body[1]/header[1]/div[1]/nav[1]/ul[1]/li[1]/ul[2]/li[4]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[2]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
	public WebElement article;
	
	@FindBy(xpath="//a[contains(text(), 'Create an Account')]")
	public WebElement createAccnt;
	
	
	public void mousehoverResources()
	{
		act.moveToElement(resources).build().perform();
		
	}
	
	
	public void doClickmyAccnt()
	{
		myAccnt.click();
	}
	
	public void doClicksignIn()
	{
		signIn.click();
	}
	public void doClickcreateAccnt()
	{
		createAccnt.click();
	}
	public void seleniumClick()
	{
		slnm.click();
	}
	
	public void documentationClick()
	{
		doc.click();
	}
	
	public void articleClick()
	{
		article.click();
	}


}
