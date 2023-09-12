// Page Source
package selenpkg;


import org.openqa.selenium.edge.EdgeDriver;

public class Pagesrc 
{
	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
