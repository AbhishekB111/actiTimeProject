package pagePackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage 
{
	//declaration
	@FindBy(linkText = "Users") private WebElement Userstab;
	@FindBy(xpath = "//input[@value='Create New User']") private WebElement createNewUsers;
	
	
	//initialization
	public UsersPage(WebElement driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public WebElement getUserstab() 
	{
		return Userstab;
	}


	public WebElement getCreateNewUsers()
	{
		return createNewUsers;
	}
	
	//Operational Method
	public void selectUserTab() 
	{
		Userstab.click();
	}
	
}
