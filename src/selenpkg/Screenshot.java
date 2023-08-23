//ScreenShot

package selenpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
	
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void screenshot() throws IOException 
	{
		//Page Screenshot
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./Screenshot//Fbpage.png"));
		
		//Element Screenshot
		WebElement button=driver.findElement(By.name("login"));
		File btnscrnshot=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(btnscrnshot, new File("./Screenshot//btnscrnshot.png"));
		System.out.println("Successfullu Screenshot Taken");
		
	}
}
