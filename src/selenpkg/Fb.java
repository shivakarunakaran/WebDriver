package selenpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb 
{
	
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
	}
	
	@Test
	public void facebook()
	{
		driver.findElement(By.id("email")).sendKeys("rose@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("isla");
		driver.findElement(By.name("login")).click();
	}
}
