package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Ebaypagecls 
{
	WebDriver driver;
	
	By fashion=By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a");
	By shirt=By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[1]/div[1]/img");
	By pants=By.xpath("//*[@id=\"s0-28-9-0-1[0]-0-1[0]-0-4-list\"]/li[4]/a/div/img");
	By cart=By.xpath("//*[@id=\"gh-minicart-hover\"]/div/a[1]/svg/use");
	By sign=By.xpath("//*[@id=\"mainContent\"]/div/div[2]/div/div[2]/div/div[3]/a[1]");
	By user=By.xpath("//*[@id=\"userid\"]");
	By con=By.xpath("//*[@id=\"signin-continue-btn\"]");
	
	public Ebaypagecls(WebDriver driver)
	{
		this.driver=driver;
	}
	@Test
	public void test2()
	{
		driver.findElement(fashion).click();
		driver.findElement(shirt).click();
		driver.findElement(pants).click();
	}
	
//	public void test3()
//	{
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,20)","");
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		String pw=driver.getWindowHandle();
//		
//		driver.findElement(By.xpath("//*[@id=\"s0-28_2-9-0-1[0]-0-0\"]/ul/li[1]/div[1]/div[2]/a/h3")).click();
//	
//		Set<String> wh=driver.getWindowHandles();
//		for(String han:wh)
//		{
//			if(!han.equalsIgnoreCase(pw))
//			{
//				driver.switchTo().window(han);
//				
//				driver.findElement(cart).click();	
//			}
//		}
//	}
//	public void test4(String username)
//	{
//		driver.findElement(sign).click();
//		driver.findElement(user).sendKeys(username);
//		driver.findElement(con).click();
//	}
}