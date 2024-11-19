//Response Code

package selenpkg;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Fbresponsecode 
{
	
	WebDriver driver;
	String baseurl="https://wwww.facebook.com";
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
	
	@Test
	public void linkvalidate()
	{
		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"u_0_2_nP\"]/div[3]/a"));
		System.out.println("No. of links ="+list.size());
		for(WebElement element:list)
		{
			String link=element.getAttribute("href");
			verify(link);
		}
	}

	public void verify(String list) 
	{	
		try 
		{
			URL url=new URL(list);
			HttpURLConnection con=(HttpURLConnection)url.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("Successful -- "+list);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("Broken Link -- "+list);
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}	
}