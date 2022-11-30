package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class LoginPage extends BaseTest
{
	//declare all the webElement present on Login page
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginBtn;
	@FindBy(id="keepLoggedInLabel") private WebElement keepLoggedInCheckBox;
	@FindBy(xpath = "//a[contains(text(),'License')]") WebElement license;
	
	//Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
	//utilization
	public WebElement getUsn() {
		return usn;
	}
	

	public WebElement getPass() {
		return pass;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getKeepLoggedInCheckBox() {
		return keepLoggedInCheckBox;
	}


	public WebElement getLicense() {
		return license;
	}

  //Oprational Method
	
	public void validActiTimeLogin(String validUsename,String validPassword)
	{
		usn.sendKeys(validUsename);
		pass.sendKeys(validPassword);
		loginBtn.click();
	}
	
	public void inValidActiTimeLogin(String inValidUsename,String inValidPassword) throws InterruptedException
	{
		usn.sendKeys(inValidUsename);
		pass.sendKeys(inValidPassword);
		loginBtn.click();
		Thread.sleep(2000);
		usn.clear();
	}
	
}
