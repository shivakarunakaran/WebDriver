//Control Alert Messages

package selenpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Alertmsgcontrol 
{
	
	FirefoxDriver driver;
	String baseurl="file:///C:/Users/Shiva%20Karunakaran/Desktop/Name.html";
	
	@Before
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void namehtml()
	{
		driver.findElement(By.xpath("//input[@value='Display alert box']")).click();
		//Alert
		Alert a=driver.switchTo().alert();
		String alerttext= a.getText();
		System.out.println(alerttext);
		a.accept();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("isla");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("rose");
	}
 
	
}
