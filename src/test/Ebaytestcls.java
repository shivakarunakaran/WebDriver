package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Ebaypagecls;


public class Ebaytestcls 
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{	
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}
	@Test
	public void test1()
	{
		Ebaypagecls ob1=new Ebaypagecls(driver);
		ob1.test2();
//		ob1.test3();
		//ob1.test4("tomaloysius");	
	}
}