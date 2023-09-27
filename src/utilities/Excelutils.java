//Excel DataDetails DataDriven

package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils 
{
	
	public static String getCellValue(String x1,String Sheet,int r,int c)
	{
		try
		{
			
			FileInputStream fi=new FileInputStream(x1);
			
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			
			XSSFCell cell=wb.getSheet(Sheet).getRow(r).getCell(c);
			
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				double v=cell.getNumericCellValue();
				int val=(int)v;
				return String.valueOf(val);
			}
		}
		
		catch (Exception e) 
		{
			return "";
		}
	}
	
	public static int getRowCount(String x1,String Sheet)
	{
		try
		{
			FileInputStream fi=new FileInputStream(x1);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			
			return wb.getSheet(Sheet).getLastRowNum();
		}
		catch (Exception e)
		{
			return 0;
		}
	}
	//wb.close();
}


//String[] driverValues = new String[5];

//String value=Iterautils.getcelldata(f1, sheet, i, 0);
//System.out.println("value"+i+value);
//driverValues[i]= value;

//iterobj.valuesset(driverValues[0],driverValues[1],driverValues[2],driverValues[3],driverValues[4]);



