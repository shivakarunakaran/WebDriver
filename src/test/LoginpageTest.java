//FB Login Page Test

package test;

import org.testng.annotations.Test;

import page.FBloginpage;

public class LoginpageTest extends FbBasecls
{
	
	@Test
	public void testlogin()
	{
		 
		FBloginpage obj=new FBloginpage(driver);
		obj.setvalues("isla@gamil.com", "rose123");
		obj.loginclick();
	}
	
	
}
