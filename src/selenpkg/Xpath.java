//Relative X-path

package selenpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rose@gmai.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12weda");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
}
