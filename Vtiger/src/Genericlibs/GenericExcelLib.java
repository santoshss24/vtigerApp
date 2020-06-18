package Genericlibs;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericExcelLib 
{
	public static String getDatafromExcel(String path,String sheetName,int r,int c)
	{
		String value="";
		try {
			FileInputStream fin=new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fin);
			value = wb.getSheet(sheetName).getRow(r).getCell(c).getStringCellValue();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return value;
	}

}
