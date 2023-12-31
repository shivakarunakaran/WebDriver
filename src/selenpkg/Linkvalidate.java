//Link Validation/Response

package selenpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Linkvalidate 
{
	
	WebDriver driver;
	String url="https://www.facebook.com";
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test
	public void linkvalidate()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("No. of links ="+li.size());
		for(WebElement element:li)
		{
			String link=element.getAttribute("href");
			verify(link);
		}
	}

	public void verify(String link) 
	{
		try 
		{
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("Successful -- "+link);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("Broken Link -- "+link);
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
