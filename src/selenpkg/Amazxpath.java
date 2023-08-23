//Amazon X-path
package selenpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazxpath 
{
	EdgeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		//Search
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles",Keys.ENTER);
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//1st Link
		driver.findElement(By.xpath("//*[@alt='Sponsored Ad - Redmi Note 12 5G Matte Black 6GB RAM 128GB ROM | 1st Phone with 120Hz Super AMOLED and Snapdragon® 4 Gen 1...']")).click();
		//BestSellers
		driver.findElement(By.xpath("//*[@data-csa-c-slot-id='nav_cs_2']")).click();
		//Cart
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		//Hello-Email
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("indi@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.navigate().back();
		driver.navigate().back();
		//Hamburg-Menu
		driver.findElement(By.xpath("//*[@class='hm-icon-label']")).click();
		System.out.println("Test Success");
		
	}
	
	
}
