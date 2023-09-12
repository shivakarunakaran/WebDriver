package selenpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Fb 
{
	
	WebDriver driver;
	String url="http://www.facebook.com";
	
	@Before
	public void setup()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test
	public void facebook()
	{
		driver.findElement(By.id("email")).sendKeys("rose@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("isla");
		driver.findElement(By.name("login")).click();
	}
}
