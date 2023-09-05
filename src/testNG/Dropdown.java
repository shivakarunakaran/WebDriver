//Drop down testing

package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dropdown 
{
	WebDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@BeforeTest
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
	
	@Test
	public void dropdown()
	{
		//Day
		WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("24");
		List<WebElement> l=daydetails.getOptions();
		System.out.println(l.size());
		
		//Month
		WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select monthsetails=new Select(month);
		monthsetails.selectByVisibleText("JUN");
		List<WebElement> li=monthsetails.getOptions();
		System.out.println(li.size());
		
		//Year
		WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select yeardetails=new Select(year);
		yeardetails.selectByIndex(10);
		List<WebElement> lis=yeardetails.getOptions();
		System.out.println(lis.size());
	}
	
	
	
}
