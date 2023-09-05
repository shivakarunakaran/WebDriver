// Test Script
package selenpkg;

import org.openqa.selenium.edge.EdgeDriver;

public class Testscript 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();
		String exp="google";
		if(actualtitle.equals(exp))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

}
