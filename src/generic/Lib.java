package generic;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Lib {
	public static Workbook wb;
	
	public static String getPropertyValue(String CONFIG_PATH, String key )
	
	{
		String propertyValue="";
		
		Properties prop =new Properties();
		try {
			
			prop.load(new FileInputStream(CONFIG_PATH));
			propertyValue= prop.getProperty(key);
		}
		catch(Exception e){
			
		}
		
	return propertyValue;
	}
	public static String getCellValue(String EXCEL_PATH,String sheet, int row,int column)
	{
		String cellValue="";
		try{
			wb = WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
			
			cellValue = wb.getSheet(sheet).getRow(row).getCell(column).toString();
			
		}
		catch(Exception e){
			
		}
		return cellValue;
	}
	public static int getRowCount(String EXCEL_PATH,String sheet)
	{
		int rowCount=0;
		try{
			wb = WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
			rowCount = wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e){
			
		}
		return rowCount;
		
	}
}
