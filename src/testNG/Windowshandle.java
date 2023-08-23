//Window Handles

package testNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Windowshandle 
{
	WebDriver driver;
	
	String baseurl="https://demo.guru99.com/popup.php";
	
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@org.testng.annotations.Test
	public void windows()
	{
		driver.get(baseurl);
		String parentwindow=driver.getWindowHandle();
		System.out.println("Parent Window Title " +driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> allWindowHandles=driver.getWindowHandles();
		
		for(String handle : allWindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				
				String s=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/h2")).getText();
				System.out.println(s);
				driver.close();
			}
			
			driver.switchTo().window(parentwindow);
		}
		
	}
	
}
