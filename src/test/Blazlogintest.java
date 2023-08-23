//BlazeDemo LoginPage Test

package test;

import org.testng.annotations.Test;

import page.Blazelogin;


public class Blazlogintest extends Blazlogbasecls
{
	
	@Test
	public void testlogin()
	{
		 
		Blazelogin obj=new Blazelogin(driver);
		obj.setvalues("rose@gmail.com","isro123");
		obj.login();
	}
	
	
	
}
