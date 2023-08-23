package selenpkg;

import java.sql.Driver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class Junit 
{
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}
	
	@Test
	public void test1()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void test2()
	{
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	@After
	public void teardown()
	{
		driver.quit();
	}
	
}
