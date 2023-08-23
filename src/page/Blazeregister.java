//BlazeDemo Register

package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazeregister 
{
	
	WebDriver driver;
	
	By regname=By.xpath("//*[@id=\"name\"]");
	By regcompany=By.xpath("//*[@id=\"company\"]");
	By regemail=By.xpath("//*[@id=\"email\"]");
	By regpass=By.xpath("//*[@id=\"password\"]");
	By regconpass=By.xpath("//*[@id=\"password-confirm\"]");
	By regbtn=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	
	public Blazeregister(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String name,String company,String email,String password,String confirmpass)
	{
		
		driver.findElement(regname).sendKeys(name);
		driver.findElement(regcompany).sendKeys(company);
		driver.findElement(regemail).sendKeys(email);
		driver.findElement(regpass).sendKeys(password);
		driver.findElement(regconpass).sendKeys(confirmpass);
		
	}
	
	public void login()
	{
		driver.findElement(regbtn).click();
	}
	
	
}
