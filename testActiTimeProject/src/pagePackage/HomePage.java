package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	//declaration
		@FindBy(name="usersSelector.selectedUser") private WebElement enterTimeTrackDropDown;
		@FindBy(xpath = "//a[.='Create new tasks']") private WebElement createNewTaskLink;
		@FindBy(id = "SubmitTTButton") private WebElement saveLeaveTimeButton;
		@FindBy(xpath = "//a[text()='Logout']") private WebElement logOutLink;
		
		//initialization
		public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
		
		//utilization
		public WebElement getEnterTimeTrackDropDown() {
			return enterTimeTrackDropDown;
		}
		public WebElement getCreateNewTaskLink() {
			return createNewTaskLink;
		}
		public WebElement getLogOutLink() {
			return logOutLink;
		}
		public WebElement getSaveLeaveTimeButton() {
			return saveLeaveTimeButton;
		}
		
		//OPearational Method
		public void logOut()
		{
			logOutLink.click();
		}
}
