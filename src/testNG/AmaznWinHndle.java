//AmazonWindowsHandle 

package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmaznWinHndle
{
	
	WebDriver driver;
	String baseurl="https://www.amazon.in/";
	
	@BeforeTest
	public void beforetest()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
	
	@Test
	public void amazon()
	{
		
		//SearchMobiles
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles",Keys.ENTER);
		//Select1st Link	
		String parentwindow=driver.getWindowHandle();
//		System.out.println("Parent Window Title " +driver.getTitle());
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
			
		for(String handle : driver.getWindowHandles())
			{
				driver.switchTo().window(handle);
//				driver.close();
			}
			
		driver.switchTo().window(parentwindow);

		//SelectBestSellers
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
		//SelectCart
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		//HelloSignin
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("indi@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.navigate().back();
		driver.navigate().back();
		//SelectHamburg-Menu
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
		System.out.println("Test Passed");
//		driver.close();	
	}
		
}
