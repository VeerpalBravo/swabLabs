package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import utilities.ExtentManager;

public class BaseClass {

	public static Properties config = new Properties();
	public static Logger app_logs = Logger.getLogger("qaLogger");
	public static WebDriver driver=null;
	public ExtentReports report = ExtentManager.getInstance();
	public static ExtentTest test;
	
	
	@BeforeSuite()
	public static void init() throws IOException
	{
		
		
			// load config property file
			FileInputStream fis = new FileInputStream(
			System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
			config.load(fis);
			app_logs.debug("loading the config property file");

			// load excel file
		//	excel = new Xls_Reader(
		//	System.getProperty("user.dir") + "\\src\\test\\java\\busyqa\\properties\\testdata.xlsx");
		//	app_logs.debug("loading the excel file");
			if (config.getProperty("browser").equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\src\\test\\resources\\executables\\chromedriver.exe");
				driver = new ChromeDriver();
				app_logs.debug("chrome browser launched");
			} 
			
			else if (config.getProperty("browser").equals("firefox")) 
			{
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"\\src\\test\\resources\\executables\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
			else if (config.getProperty("browser").equals("edge")) 
			{
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") +"\\src\\test\\resources\\executables\\MicrosoftWebDriver.exe");
				driver = new EdgeDriver();
			}

			driver.get(config.getProperty("testsiteURL"));
			driver.manage().window().maximize();

			// Global implicit Wait
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		
	
	}
	
	@AfterSuite()
	public static void tearDown() throws AddressException, MessagingException, IOException, InterruptedException 
	{
		
		if(driver!=null) 
		{
			Thread.sleep(3000);	
		   driver.quit();
		}
	}
	
}
