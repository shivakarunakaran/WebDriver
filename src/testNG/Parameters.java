//Get values from XML through parameters

package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parameters 
{
	FirefoxDriver driver;
	String baseurl="https://www.facebook.com";
	
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
	@org.testng.annotations.Parameters({"un","pwd"})
	@Test
	public void search(String un,String pwd)
	{
		driver.findElement(By.name("email")).sendKeys("un",Keys.ENTER);
		driver.findElement(By.name("pass")).sendKeys("pwd",Keys.ENTER);
	}
	
}
