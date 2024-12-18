//Drag and Drop Actions

package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragdrop 
{
	
	WebDriver driver;
	String baseurl="https://demoqa.com/droppable/";
	
	@BeforeTest
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
	
	@Test
	public void dragdrop()
	{
		
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		String droptext=drop.getText();
		if(droptext.equals("Dropped!"))
		{
			System.out.println("Passed");
		}
		else
			System.out.println("Fail");
	}
	
}