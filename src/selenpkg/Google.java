package selenpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Google 
{
	WebDriver driver;
	String url="https://www.google.com";
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test
	public void test()
	{
		//driver.findElement(By.name("q")).sendKeys("books",Keys.ENTER);
		//driver.findElement(By.name("btnk")).click();
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("books");	
		search.submit();
	}
	
}
