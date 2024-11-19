//Data Driven Testing

package testNG;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven 
{
	
	//ChromeDriver driver;
	//FirefoxDriver driver;
	EdgeDriver driver;
	String baseurl="https://www.facebook.com";
	
	@BeforeTest
	public void setUp()
	{
		//driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		
	}
	
	@Test
	public void datadriven() throws Exception
	{
		
		FileInputStream ob=new FileInputStream("C:\\Users\\Shiva Karunakaran\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(ob);  //To get workbook in Excel
		XSSFSheet sh=wb.getSheet("isla");  //Return Sheet Details
		int rowsize=sh.getLastRowNum();  //Return Row Number
		for(int i=1;i<rowsize;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Username = "+username);
			String pass=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Password = "+pass);
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(pass);
			driver.findElement(By.name("login")).click();
			driver.navigate().refresh();
			driver.navigate().back();
		}	
		wb.close();
	}
}