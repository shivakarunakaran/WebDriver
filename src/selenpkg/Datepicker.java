//DatePicker

package selenpkg;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker 
{
	
	WebDriver driver;
	
	String baseurl="https://www.booking.com/";
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		driver.navigate().refresh();
		//driver.navigate().back();
	}

	@Test
	public void pickdate()
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.xpath("/html/body/div[21]/div/div/div/div[1]/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\":Ra9:\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[1]/div/div/div[2]/ul/li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[1]/div/div/div[2]/ul/li[3]/div/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[2]/div/div/button[1]")).click();
		
		while(true)
		{
			
			String monthtext=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/h3")).getText();
			System.out.println("Month="+monthtext);
			if(monthtext.equals("August 2023"))
			{
				System.out.println("Month Selected");
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button")).click();
			}
			
			List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/table/tbody/tr/td/span"));
			
			for(WebElement dateelement:alldates)
			{
				String date=dateelement.getText();
				System.out.println(date);
				if(date.equals("2"))
				{
					dateelement.click();
					break;
				}
			}
			
			while(true)
			{
				String mnthtext=driver.findElement(By.xpath("//*[@id=\\\"calendar-searchboxdatepicker\\\"]/div/div[1]/div/div[2]/h3")).getText();
				System.out.println("Month="+mnthtext);//--//*[@id="calendar-searchboxdatepicker"]/div/div[1]/div/div[1]/h3
				if(mnthtext.equals("August 2023"))
				{
					System.out.println("Month Selected");
					break;
				}
				else
				{
					driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button")).click();
				}
				
				List<WebElement> alldate=driver.findElements(By.xpath("//*[@id=\\\"calendar-searchboxdatepicker\\\"]/div/div[1]/div/div[2]/table/tbody/tr/td/span"));
				
				for(WebElement dateselement:alldate)
				{
					String dates=dateselement.getText();
					System.out.println(dates);
					if(dates.equals("10"))
					{
						dateselement.click();
						break;
					}
				}	
		}
		
		
	}
	}	
}
