//TestNG Demo

package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgdemo 
{
	WebDriver driver;
	String baseurl="https://www.facebook.com";
	
	@BeforeTest//(alwaysRun=true)
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeMethod//(alwaysRun=true)
	public void urlloding()
	{
		driver.get(baseurl);
	}
	
	@Test(priority=1,groups= {"sanity"},enabled = false)
	public void titleverify()
	{
		String title=driver.getTitle();
		System.out.println("Title Verified");
	}
	
	@Test(priority=0,groups= {"sanity","smoke"},dependsOnMethods = "titleverify")
	public void contentverify()
	{
		String src=driver.getPageSource();
		if(src.contains("Facebook"))
		{
			System.out.println("Content Verified");
		}
		else
		{
			System.out.println("Content not Verified");
		}
	}
	
	@Test(groups= {"regression"},timeOut = 200)
	public void test1()
	{
		System.out.println("Test1 Verification");
	}
	
	@Test(priority=0,groups= {"regression"})
	public void test2()
	{
		System.out.println("Test2 Verification");
	}
	
	@AfterMethod
	public void aftmtd()
	{
		System.out.println("After Method");
	}
	
	@AfterTest
	public void teardown()
	{
//		driver.close();
		System.out.println("Browser close");
	}
}