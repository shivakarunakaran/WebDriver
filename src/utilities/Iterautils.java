//IteraDemoDataDriven

package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Iterautils 
{
	
	public static String getcelldata(String f1, String sheet, int ro, int co)
	{
		try
		{
			FileInputStream fil=new FileInputStream(f1);
			
			XSSFWorkbook wobo=new XSSFWorkbook(fil);
			
			XSSFCell cel=wobo.getSheet(sheet).getRow(ro).getCell(co);
			
			if(cel.getCellType()==CellType.STRING)
			{
				return cel.getStringCellValue();
			}
			else 
			{			
				double valu=cel.getNumericCellValue();
				int val=(int)valu;
				return String.valueOf(valu);	
			}
			
		}
		
		catch (Exception e) 
		{
			return "";
		}
	}
	
	public static int getrocnt(String f1,String sheet)
	{
		try
		{
			FileInputStream fil=new FileInputStream(f1);
			XSSFWorkbook wobo=new XSSFWorkbook(fil);
			
			return wobo.getSheet(sheet).getLastRowNum();
		}
		catch (Exception e) 
		{
			return 0;
		}
	}
}
