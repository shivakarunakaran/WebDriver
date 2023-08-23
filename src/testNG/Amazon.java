//Amazon 

package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon 
{
	
	WebDriver driver;
	
	String baseurl="https://www.amazon.in/";
	
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		
	}
	
	@Test
	public void amaz()
	{
	
		
		//Search
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobiles",Keys.ENTER);
		String exp="Amazon.in:mobilephones";
		String act=driver.getTitle();
		Assert.assertEquals(exp, act);
		//Mobiles
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		//Add to cart
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		//Cart
		driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
			
	}
	
}
