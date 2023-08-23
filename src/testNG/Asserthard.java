//Assertion Hard

package testNG;

//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Asserthard
{
	FirefoxDriver driver;
	
	String baseurl="http://www.facebook.com";
	
	@BeforeTest
	public void setUp()
	{
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		
	}
	
	@Test
	public void asserthard()
	{
		String expect="facebook";
		String actual=driver.getTitle();
		
		Assert.assertEquals(expect, actual);
		
	}
	
	
}
