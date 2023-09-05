//Relative X-path

package selenpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath 
{
	WebDriver driver;
	
	String url="https://www.facebook.com";
	
	@Before
	public void setup()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rose@gmai.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12weda");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
}
