package tests;

import org.testng.annotations.Test;

import Genericlibs.GenericExcelLib;
import pages.Loginpagevtiger;

public class TC001 extends Basetest 
{
	@Test
	public void validlogin()
	{
		Loginpagevtiger l=new Loginpagevtiger(driver);
		String username = GenericExcelLib.getDatafromExcel(EXCEL_PATH, "Sheet1", 1, 0);
		String password = GenericExcelLib.getDatafromExcel(EXCEL_PATH, "Sheet1", 1,1);
		l.setUsername(username);
		l.setPassword(password);
		l.Signinbutton();
		
		
	}
	

}
