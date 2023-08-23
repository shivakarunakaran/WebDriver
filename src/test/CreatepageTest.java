//FB Create page Test

package test;

import org.testng.annotations.Test;

import page.Fbcreatepage;

public class CreatepageTest extends FbBasecls
{
	
	@Test
	public void test()
	{
		Fbcreatepage obj=new Fbcreatepage(driver);
		obj.pageclick();
		obj.getstartbtn();
	}
	
	
}
