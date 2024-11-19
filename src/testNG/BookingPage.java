package testNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookingPage {
	
	WebDriver driver;
	String baseurl="https://www.booking.com/";
	@BeforeTest
	public void setUp() {
		
		
		 driver=new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.get(baseurl);
		 driver.navigate().refresh();
		//driver.navigate().back();		
		 }
	
	@Test
	public void main()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.xpath("/html/body/div[21]/div/div/div/div[1]/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\":Ra9:\"]")).click();//click where to go
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[1]/div/div/div[2]/ul/li[1]")).click();
		//driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[2]/div")).click();
		
		
		
		while(true)
		{
		String monthtext=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")).getText();
		System.out.println("month="+monthtext);
		if(monthtext.equals("July 2023"))
		{
			System.out.println("Month selected");
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button")).click();
		}
		
		}
		
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td/span/span"));
		
		for(WebElement dateelement:alldates)
		{
			String date=dateelement.getText();
			System.out.println(date);
			if(date.equals("20"))
			{
				dateelement.click();
				break;
			}
		}
		
		while(true)
		{
		String monthtext2=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")).getText();
		System.out.println("month="+monthtext2);
		if(monthtext2.equals("August 2023"))
		{
			System.out.println("Month selected");
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button")).click();
		}
		
		}
		
		List<WebElement> alldates2=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td/span/span"));
		
		for(WebElement dateelement:alldates2)
		{
			String date=dateelement.getText();
			System.out.println(date);
			if(date.equals("20"))
			{
				dateelement.click();
				break;
			}
		}
	
 driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[3]/div/button")).click();
 WebElement adult=driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[3]/div/div/div/div/div[1]/div[2]/button[2]"));
for(int i=1;i<=3;i++)
{
	adult.click();
}

WebElement child=driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[3]/div/div/div/div/div[2]/div[2]/button[2]"));

	child.click();

	Select childage1=new Select(driver.findElement(By.xpath("//*[@data-testid='kids-ages']/div[1]/div/select")));
	 childage1.selectByValue("2");
	 



WebElement room=driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[3]/div/div/div/div/div[5]/div[2]/button[2]"));
 
for(int i=1;i<3;i++)
{
	room.click();
}	


 
 
 driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[3]/div/div/div/button")).click();
 
driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[4]/button")).click();

	}

	
	
	

}
