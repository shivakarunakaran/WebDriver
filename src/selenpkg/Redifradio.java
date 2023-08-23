//Check button is Displayed,Enabled,Selected

package selenpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifradio 
{
	
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void isdisplay()
	{
		Boolean logo=driver.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();
		if(logo)
		{
			System.out.println("Logo is displayed");			
		}
		else
		{
			System.out.println("Logo is not displayed");
		}
	}
	
	@Test
	public void radio()
	{
		Boolean radio=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(radio)
		{
			System.out.println("Radio button is Selected");			
		}
		else
		{
			System.out.println("Radio button is not Selected");
		}
	}
	@Test
	public void button()
	{
		Boolean button=driver.findElement(By.xpath("//*[@id='Register']")).isEnabled();
		if(button)
		{
			System.out.println("Button is Enabled");			
		}
		else
		{
			System.out.println("Button is not Enabled");
		}
	}
}







