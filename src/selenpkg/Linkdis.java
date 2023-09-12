//Display Link Response Code

package selenpkg;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Linkdis 
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
	public void linkresponse()
	{
		try
		{
			URL u=new URL(baseurl);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			System.out.println(con.getResponseCode());
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
