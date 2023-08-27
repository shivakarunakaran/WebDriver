//Get values from XML through parameters

package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parameters 
{
	WebDriver driver;
	String baseurl="https://www.facebook.com";
	
	@BeforeTest
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
	@org.testng.annotations.Parameters({"un","pwd"})
	@Test(priority = 1)
	public void search(String un,String pwd)
	{
		driver.findElement(By.name("email")).sendKeys("un",Keys.ENTER);
		driver.findElement(By.name("pass")).sendKeys("pwd",Keys.ENTER);
	}
	
}
