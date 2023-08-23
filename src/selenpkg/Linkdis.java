//Display Link Response Code

package selenpkg;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkdis 
{
	
	ChromeDriver driver;
	String baseurl="https://wwww.facebook.com";
	
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
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
