package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class SwagLabs2 extends BasePage{

	public SwagLabs2(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	public WebElement btn;
	
	
	@FindBy(xpath="//a[@id='about_sidebar_link']")
	public WebElement about;
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	public WebElement selectList;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	public WebElement addCart;
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
	public WebElement removebtn;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	public WebElement shoppingCartLink;
	
	@FindBy(xpath="//button[@id='checkout']")
	public WebElement chkOut;
	
	@FindBy(xpath="//input[@id='first-name']")
	public WebElement fname;
	
	@FindBy(xpath="//input[@id='last-name']")
	public WebElement lname;
	
	@FindBy(xpath="//input[@id='postal-code']")
	public WebElement zipcode;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
	public WebElement conti;
	
	@FindBy(xpath="//button[@id='finish']")
	public WebElement finish;
	
	@FindBy(xpath="//button[@id='back-to-products']")
	public WebElement backHome;
	
	public void backHomeClick() {
		backHome.click();
		
	}
	
	public void finishClick() {
		finish.click();
	}
	
	public void continueClick() {
		conti.click();
	}
	
	public void enterValues(String fname1,String lname1,String zipcode1 )
	{
		fname.sendKeys(fname1);
		lname.sendKeys(lname1);
		zipcode.sendKeys(zipcode1);
	}
	
	public void chkOutClick() {
		chkOut.click();
	}
	
	
	public void shoppingCartLinkClick() {
		shoppingCartLink.click();
	}
	
	
	public void choosePriority() {
		Select opt= new Select(selectList);
		opt.selectByIndex(2);
	}
	
	
	public void doClickButton()
	{
		btn.click();
	}
	public void doClickAbout()
	{
		about.click();
	}
	public void addCartClick()
	{
		addCart.click();
	}

}
