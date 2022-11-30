package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomListner;
import generic.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
@Listeners(CustomListner.class)
public class TestActiTimeLogout extends BaseTest 
{
	@Test
	public void logOut() throws IOException, InterruptedException 
	{
		LoginPage lp=new LoginPage(driver);
		HomePage hp=new HomePage(driver);
		Flib flib=new Flib();
		lp.validActiTimeLogin(flib.readDataFromPropertyFile(PROP_PATH, USERNAME),flib.readDataFromPropertyFile(PROP_PATH, PASSWORD));
		Thread.sleep(4000);
		hp.logOut();
		
	}
}
