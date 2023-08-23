//Assertion Hard

package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Asserthard
{
	WebDriver driver;
	
	String baseurl="http://www.facebook.com";
	
	@BeforeTest
	public void setUp()
	{
		
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		
	}
	
	@Test
	public void asserthard()
	{
		String actual=driver.getTitle();
		String expect="facebook";
		
		Assert.assertEquals(actual, expect);
		
//		driver.close();
		
	}
	
	
}
