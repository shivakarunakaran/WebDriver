//BrowserNotificationBlock

package testNG;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browsernotify 
{
	
	WebDriver driver;
	
	String baseurl="https://www.justdial.com";
	
	@BeforeTest
	public void setUp()
	{
	
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--disable-notifications");
		driver=new FirefoxDriver(options);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void test()
	{
		driver.get(baseurl);
	}
}

