package tests;

import org.testng.annotations.Test;

import Genericlibs.GenericExcelLib;
import pages.Loginpagevtiger;

public class TC002 extends Basetest 
{
	@Test
	public void invalidlogin()
	{
		Loginpagevtiger l=new Loginpagevtiger(driver);
		String username = GenericExcelLib.getDatafromExcel(EXCEL_PATH, "Sheet1", 2, 0);
		
		String password = GenericExcelLib.getDatafromExcel(EXCEL_PATH, "Sheet1", 2,1);
		l.setUsername(username);
		l.setPassword(password);
		l.Signinbutton();
		
		l.errormsg();
	}
	

}
