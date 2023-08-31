//Cross Browser Testing

package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowtest 
{
	
	WebDriver driver;
	
	String baseurl="https://www.facebook.com/";
	
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser)
	{
		if(browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
	}
	
	@Test
	public void test()
	{
		driver.get(baseurl);
	}

}
