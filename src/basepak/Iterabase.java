//IteraTestBaseClass 

package basepak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Iterabase
{
	
	public WebDriver driver;
	
	String baseurl="https://itera-qa.azurewebsites.net/home/automation";
	
	@BeforeTest
	public void setUp()
	{
		
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
	
	}
	
}
