//Drag and Drop Actions

package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragdrop 
{
	
	FirefoxDriver driver;
	String baseurl="https://demoqa.com/droppable/";
	
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
	
	@Test
	public void dragdrop()
	{
		
		WebElement drap=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drap, drop).perform();
		String droptext=drop.getText();
		if(droptext.equals("Droppes!"))
		{
			System.out.println("Passed");
		}
		else
			System.out.println("Fail");
	}
	
}
