//Amazon Search

package test;

import org.testng.annotations.Test;

import basepak.FbBasecls;
import page.Fblogin;

public class Fblogintest extends FbBasecls
{
	
	@Test
	public void logintest()
	{
		Fblogin obj=new Fblogin(driver); 
		obj.setvalues("davy@gmailcom", "rose123");
		obj.login();
		
	}
	
}
