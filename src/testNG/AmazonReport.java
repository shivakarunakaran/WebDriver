//Amazon 

package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class AmazonReport 
{
	
	WebDriver driver;
	String baseurl="https://www.amazon.in/";
	ExtentHtmlReporter report;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void beforetest()
	{
		report = new ExtentHtmlReporter("./Report/amazon.html");
		report.config().setDocumentTitle("Amazon Report");
		report.config().setReportName("WindowsHandle");
		report.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "windows10");
		extent.setSystemInfo("testername", "Isla Rose");
		extent.setSystemInfo("Browser Name", "edge");
		driver=new EdgeDriver();
	}
	
	@BeforeMethod
	public void setUp()
	{
//		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
	
	@Test
	public void amazon()
	{
		test=extent.createTest("Amazon");
		
		//SearchMobiles
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles",Keys.ENTER);
		//Select1st Link	
		String parentwindow=driver.getWindowHandle();
		System.out.println("Parent Window Title " +driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
			
		for(String handle : driver.getWindowHandles())
			{
				driver.switchTo().window(handle);
//				driver.close();
			}
			
		driver.switchTo().window(parentwindow);
	
		//SelectBestSellers
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
		//SelectCart
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		//HelloSignin
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("indi@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.navigate().back();
		driver.navigate().back();
		//SelectHamburg-Menu
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
		System.out.println("Test Success");
//		driver.close();	
	}
	
	@AfterTest
	public void teardown()
	{
		extent.flush();
	}
	
	@AfterMethod
	public void aftermethod(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "Test Case is Failed"+result.getName());
			test.log(Status.FAIL, "Test Case is Failed"+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SKIP) 
		{
			test.log(Status.SKIP, "Test Case is Skipped"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "Test Case is Passed"+result.getName());
		}
	}	
}