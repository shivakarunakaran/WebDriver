//TagName
package selenpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname 
{
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	
	@Test
	public void linktext()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("Total No. of links : "+li.size());
		
		for(WebElement x:li)
		{
			String link=x.getAttribute("href");
			String linktext=x.getText();
			System.out.println(link+"---"+linktext);
		}
	}
	
}
