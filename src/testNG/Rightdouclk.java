//Right and Double click Action on DemoSite

package testNG;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rightdouclk 
{	
	WebDriver driver;
	String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
	
	@BeforeTest
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
	
	@Test
	public void ritdouclk()
	{		
		WebElement rightclk=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions action=new Actions(driver);
		action.contextClick(rightclk).perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
		driver.switchTo().alert().accept();
		WebElement douclk=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		action.doubleClick(douclk).perform();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		a.accept();
		System.out.println(alerttext);	
	}	
}
