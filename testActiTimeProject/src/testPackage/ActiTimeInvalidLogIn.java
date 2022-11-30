package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomListner;
import generic.Flib;
import pagePackage.LoginPage;
@Listeners(CustomListner.class)
public class ActiTimeInvalidLogIn extends BaseTest
{
	
	@Test
	public void testInValidLogin() throws IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		int rc = flib.getRowCount(EXCEL_PATH,INVALID_DATA);
		for(int i=1;i<=rc;i++)
		{
		lp.inValidActiTimeLogin(flib.readExcelData(EXCEL_PATH, INVALID_DATA, i, 0),flib.readExcelData(EXCEL_PATH, INVALID_DATA, i,0));
		}
		
		
	}
}
