//FB login through DataDriven

package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fblogindatadriven 
{
	
	WebDriver driver;
	
	By loginbtn=By.name("login");
	By email=By.name("email");
	By password=By.name("pass");
	
	public Fblogindatadriven(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void loginbtnclick()
	{
		driver.findElement(loginbtn).click();
	}
	
	public void setvalues(String UN, String PWD)
	{
		driver.findElement(email).sendKeys(UN);
		driver.findElement(password).sendKeys(PWD);
	}

}
