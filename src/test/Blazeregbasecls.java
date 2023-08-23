//BlazeDemo Base Class

package test;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeTest;

public class Blazebasecls 
{
	
public WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/register");
	}
	
}
