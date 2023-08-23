//Login using DataDriven

package testNG;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logindatadriven 
{
	
	FirefoxDriver driver;
	String baseurl="https://practicetestautomation.com/practice-test-login/";
	
	@BeforeTest
	public void setUp()
	{
		
		driver=new FirefoxDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void login() throws Exception
	{
		FileInputStream log=new FileInputStream("C:\\Users\\Shiva Karunakaran\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(log);
		XSSFSheet sh=wb.getSheet("rose");
		int rowsize=sh.getLastRowNum();
		for(int i=0;i<rowsize;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Username = "+username);
			String pass=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Password = "+pass);
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(pass);
			driver.findElement(By.id("submit")).click();
			
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
		}
		
		wb.close();
	}
	
}
