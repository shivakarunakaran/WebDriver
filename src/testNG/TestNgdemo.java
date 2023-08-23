//TestNG Demo

package testNG;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgdemo 
{
	FirefoxDriver driver;
	String baseurl="https://www.facebook.com";
	
	@BeforeTest//(alwaysRun=true)
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeMethod//(alwaysRun=true)
	public void urlloding()
	{
		driver.get(baseurl);
	}
	
	@Test(priority=1,groups= {"sanity"})
	public void titleverify()
	{
		String title=driver.getTitle();
		System.out.println("Title Verified");
	}
	
	@Test(groups= {"sanity","smoke"},dependsOnMethods = "titleverify")
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
	
	@Test(groups= {"regression"})
	public void test1()
	{
		System.out.println("Test1 Verification");
	}
	
	@Test(groups= {"regression"})
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
		System.out.println("Browser close");
	}

	

}
