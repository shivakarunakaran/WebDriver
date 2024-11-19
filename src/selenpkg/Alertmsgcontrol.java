//Control Alert Messages

package selenpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class Alertmsgcontrol 
{
	
	WebDriver driver;
	String baseurl="file:///C:/Users/Shiva%20Karunakaran/Documents/Name.html";
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
	
	@Test
	public void namehtml()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		//driver.findElement(By.xpath("//input[@value='Display alert box']")).click();
		//Alert
		Alert alert=driver.switchTo().alert();
		String alerttext= alert.getText();
		System.out.println(alerttext);
		alert.accept();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("isla");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("rose");
	}
}