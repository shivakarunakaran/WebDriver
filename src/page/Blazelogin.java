//BlazeDemo Login

package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazelogin 
{
	
	WebDriver driver;
	
	By blaemail=By.xpath("//*[@id=\"email\"]");
	By blapass=By.xpath("//*[@id=\"password\"]");
	By loginbtn=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
	
	public Blazelogin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String email,String password)
	{
		driver.findElement(blaemail).sendKeys(email);
		driver.findElement(blapass).sendKeys(password);
	}
	
	public void login()
	{
		driver.findElement(loginbtn).click();
	}
}
