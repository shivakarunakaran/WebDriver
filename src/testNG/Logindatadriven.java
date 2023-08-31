//Login using DataDriven

package testNG;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logindatadriven 
{
	
	WebDriver driver;
	String baseurl="https://practicetestautomation.com/practice-test-login/";
	
	@BeforeTest
	public void setUp()
	{
		
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		
	}
	
	@Test
	public void login() throws Exception
	{
		FileInputStream log=new FileInputStream("C:\\Users\\Shiva Karunakaran\\Downloads\\datadriven.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(log);
		XSSFSheet sh=wb.getSheet("isla");
		int rowsize=sh.getLastRowNum();
		for(int i=0;i<rowsize;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Username = "+username);
			String pass=sh.getRow(1).getCell(0).getStringCellValue();
			System.out.println("Password = "+pass);
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pass);
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
			
			//String url=driver.getCurrentUrl();
			//String login=("https://practicetestautomation.com/logged-in-successfully/");
			String src=driver.getPageSource();
			if(src.contains("Logged In Successfully"))
			//if(url.equals(login))
			{
				System.out.println("Login Successfull");
			}
			else
				System.out.println("Login Failed");
			
			driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
			System.out.println("Logged Out Successfully");
		}
		
		wb.close();
	}
	
}
