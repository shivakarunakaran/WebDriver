//Copy Paste Action

package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copypasteact 
{
	EdgeDriver driver;
	
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@BeforeTest
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void copypaste()
	{
		
		WebElement fn=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		fn.sendKeys("Isla");
		WebElement redmail=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		
		Actions action=new Actions(driver);
		action.keyDown(fn,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		action.keyDown(fn,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		action.keyDown(redmail,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		action.perform();
		
	}
	
	
}
