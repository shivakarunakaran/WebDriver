//Extent Report

package testNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
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

public class Extentreport 
{
	WebDriver driver;
	String baseurl="https://www.facebook.com";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void befortest()
	{
		reporter=new ExtentHtmlReporter("./Report/myreport1.html");
		reporter.config().setDocumentTitle("AutomationReport");
		reporter.config().setReportName("Fuctional Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "windows10");
		extent.setSystemInfo("testername", "Isla Rose");
		extent.setSystemInfo("Browser Name", "edge");
		driver=new EdgeDriver();
		
	}
	
	@BeforeMethod
	public void setUp()
	{
		
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
	
	@Test
	public void title_verify()
	{
		
		test=extent.createTest("Fb Title Verification");
		String Exp="facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(Exp, actual);
		
	}
	
	@Test
	public void logo_test()
	{
		
		test=extent.createTest("Fb Logo Test");
		boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
		Assert.assertTrue(b);
		
	}
	
	@AfterTest
	public void teardown()
	{
		extent.flush();
	}
	
	@AfterMethod
	public void browserclose(ITestResult result) throws IOException
	{
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			
			test.log(Status.FAIL, "Test case is failed "+result.getName());
			test.log(Status.FAIL, "Test case is failed "+result.getThrowable());
			
			String screenshotpath=screenshotMethod(driver,result.getName());
			test.addScreenCaptureFromPath(screenshotpath);
			
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "Test case Skipped"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "Test Case is Passed"+result.getName());
		}
	}
	
	public static String screenshotMethod(WebDriver driver,String screenshotname) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination="./Screenshot"+screenshotname+".jpeg";
		File finaldestination=new File(destination);
		FileHandler.copy(src, finaldestination);
		FileHandler.copy(src, new File(destination));
		
		return destination;	
	}
			
}
