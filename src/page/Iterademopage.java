//IteraDemoPage

package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Iterademopage 
{
	
	WebDriver driver;
	
	//Text
	By text_name=By.id("name");
	By text_mobile=By.id("phone");
	By text_email=By.id("email");
	By text_pass=By.id("password");
	By text_address=By.id("address");
	By text_submit=By.name("submit");
	
	//Button
	By btn_male=By.id("male");
	By box_mon=By.id("monday");
	By box_wed=By.id("wednesday");
	By box_fri=By.id("friday");
	By box_sun=By.id("sunday");
	
	//DropDown
	By drop_sel=By.xpath("/html/body/div/div[4]/div[2]/div/select");
	By drop_selection=By.xpath("/html/body/div/div[4]/div[2]/div/select/option[5]");
	
	//CheckBox
	By che_expe=By.xpath("/html/body/div/div[5]/div[2]/div[1]/div[2]/label");
	By che_seleni=By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[1]/label");
	By che_testn=By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[3]/label");
	By che_mab=By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[5]/label");
	
	//FileUpload
	By file_up=By.xpath("//*[@id=\"inputGroupFile02\"]");
	By file_sub=By.xpath("/html/body/div/div[6]/div[2]/div/div/div[2]/span");
	
	public Iterademopage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void valuesset(String name,String phone,String email,String password,String address)
	{
		driver.findElement(text_name).sendKeys(name);
		driver.findElement(text_mobile).sendKeys(phone);
		driver.findElement(text_email).sendKeys(email);
		driver.findElement(text_pass).sendKeys(password);
		driver.findElement(text_address).sendKeys(address);
	}
	
	public void selectoptions()
	{
		driver.findElement(text_submit).click();
		driver.findElement(btn_male).click();
		driver.findElement(box_mon).click();
		driver.findElement(box_wed).click();
		driver.findElement(box_fri).click();
		driver.findElement(box_sun).click();
		driver.findElement(drop_sel).click();
		driver.findElement(drop_selection).click();
		driver.findElement(che_expe).click();
		driver.findElement(che_seleni).click();
		driver.findElement(che_testn).click();
		driver.findElement(che_mab).click();
		driver.findElement(file_up).sendKeys("C:\\Users\\Shiva Karunakaran\\Pictures\\Capture.PNG");
		driver.findElement(file_sub).click();
	}
	
}
