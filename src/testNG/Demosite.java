
package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.AfterClass;

public class Demosite 
{
	WebDriver driver;

	String baseurl="https://itera-qa.azurewebsites.net/home/automation";
	
	@BeforeClass
	public void beforeClass() 
	{
		driver = new EdgeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseurl);
	}

	@Test
	public void textarea() throws AWTException 
	{
		driver.findElement(By.id("name")).sendKeys("Indi Rae Warner");
		driver.findElement(By.id("phone")).sendKeys("4712345678");
		driver.findElement(By.id("email")).sendKeys("test@test.no");
		driver.findElement(By.id("password")).sendKeys("itera");
		driver.findElement(By.id("address")).sendKeys("Sydney, Australia");
		driver.findElement(By.name("submit")).click();

		driver.findElement(By.id("female")).click();
		//driver.findElement(By.id("male")).click();
		driver.findElement(By.id("monday")).click();
		//driver.findElement(By.id("tuesday")).click();
		driver.findElement(By.id("wednesday")).click();
		//driver.findElement(By.id("thursday")).click();
		driver.findElement(By.id("friday")).click();
		//driver.findElement(By.id("saturday")).click();
		driver.findElement(By.id("sunday")).click();

		WebElement dropdown = driver.findElement(By.className("custom-select"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Norway");

		driver.findElement(By.xpath("//label[@for= '2years']")).click();
		driver.findElement(By.xpath("//label[@for= 'selenium']")).click();
		driver.findElement(By.xpath("//label[@for= 'testng']")).click();

		driver.findElement(By.xpath("//*[@id=\"inputGroupFile02\"]")).click();
		FileUpload("C:\\Users\\Shiva Karunakaran\\Pictures\\Capture.PNG");

	}

	public void FileUpload(String ps) throws AWTException 
	{
		StringSelection strSelection=new StringSelection(ps);
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

//@AfterClass
//public void afterClass() {
//driver.close();
//}

}
