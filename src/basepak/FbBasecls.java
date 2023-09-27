//FB Login Through Data driven

package basepak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class FbBasecls 
{
	
	public WebDriver driver;
	
	String baseurl="https://www.facebook.com";
	
	@BeforeTest
	public void setUp()
	{
		
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		
	}
	
}
