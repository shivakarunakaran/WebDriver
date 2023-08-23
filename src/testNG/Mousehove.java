//Mouse Hover Action

package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mousehove 
{
	
	FirefoxDriver driver;
	
	String baseurl="https://www.ebay.com";
	
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void mousehove()
	{
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //Implicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30)); //Explicit wait
		WebElement electronics=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(electronics).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a")));
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
		
	}
	
}
