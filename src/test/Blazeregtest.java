//BlazeDemo Register Test

package test;

import org.testng.annotations.Test;

import page.Blazeregister;


public class Blazeregtest extends Blazebasecls
{
	
	@Test
	public void testlogin()
	{
		 
		Blazeregister obj=new Blazeregister(driver);
		obj.setvalues("Isla","Aussies","rose@gmail.com","isro123","isro123");
		obj.login();
	}
	
}
