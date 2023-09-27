//IteraDemoTest

package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basepak.Iterabase;
import page.Iterademopage;
import utilities.Iterautils;

public class Iterademotest extends Iterabase
{
	
	@Test
	//public void iteratest()
	//{
		//Iterademopage iteraobj=new Iterademopage(driver);
		//iteraobj.valuesset("Isla","9302854724","rose@gmail.com","islarose","Sydney");
		//iteraobj.selectoptions();
		
	//}
	
	public void demodatadrive()
	{
		

		WebDriver driver = null;
		Iterademopage iterobj=new Iterademopage(driver);
		
		String f1="C:\\Users\\Shiva Karunakaran\\Documents\\TestData\\DataItera.xlsx";
		
		String sheet="Sheet1";
		
		int rowcnt=Iterautils.getrocnt(f1, sheet);
		System.out.println("rowcount---"+rowcnt);
		
		
		for(int i=0;i<=rowcnt;i++)
		{
			
			
			String uname=Iterautils.getcelldata(f1, sheet, i, 0);
			System.out.println("Phone---"+uname);
			
			String uphone=Iterautils.getcelldata(f1, sheet, i, 1);
			System.out.println("Phone---"+uphone);
			
			String uemail=Iterautils.getcelldata(f1, sheet, i, 2);
			System.out.println("Email---"+uemail);
			
			String upass=Iterautils.getcelldata(f1, sheet, i, 3);
			System.out.println("Password---"+upass);
			
			String uadd=Iterautils.getcelldata(f1, sheet, i, 4);
			System.out.println("Address---"+uadd);
			
			iterobj.valuesset(uname, uphone, uemail, upass, uadd);
		}
		
		
		iterobj.selectoptions();
				
	}
	
}
