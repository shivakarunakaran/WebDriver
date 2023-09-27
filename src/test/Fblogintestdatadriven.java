//FB LoginTest Through DataDriven

package test;

import org.testng.annotations.Test;
import basepak.FbBasecls;
import page.Fblogindatadriven;
import utilities.Excelutils;

public class Fblogintestdatadriven extends FbBasecls 
{
	@Test
	public void verifyLoginWithValidData() throws Exception
	{
		Fblogindatadriven obj=new Fblogindatadriven(driver);
		
		String x1="C:\\Users\\Shiva Karunakaran\\Documents\\TestData\\datadriven.xlsx";
		 
		String Sheet="isll";
		
		int rowCount=Excelutils.getRowCount(x1,Sheet);
		
		for(int i=1;i<rowCount;i++)
		{
			
			String UserName=Excelutils.getCellValue(x1,Sheet,i,0);
			System.out.println("username---"+UserName);
			
			String Pwd=Excelutils.getCellValue(x1,Sheet,i,1);
			System.out.println("password---"+Pwd);
			
			obj.setvalues(UserName,Pwd);
			obj.loginbtnclick();
						
		}
		
	}
	
	
}
