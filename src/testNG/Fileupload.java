//File Upload

package testNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import io.netty.handler.codec.http.multipart.FileUpload;

public class Fileupload 
{
	
	WebDriver driver;
	
	String baseurl="https://www.ilovepdf.com/excel_to_pdf";
	
	@BeforeTest
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
	
	@Test
	public void fileuploadpro() throws Exception
	{
		//driver.get("https://www.ilovepdf.com/excel_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		FileUpload("C:\\Users\\Shiva Karunakaran\\Documents\\Book1.xlsx");
	}

	public void FileUpload(String p) throws AWTException 
	{
		StringSelection strSelection=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		
		Robot robot=new Robot();
		robot.delay(2000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.delay(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
	
		
	}
	
}
