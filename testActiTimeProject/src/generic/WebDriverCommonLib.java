package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class WebDriverCommonLib extends BaseTest {
	// get Title Of webpage
	public void getPageTilte(String pageName) {
		String titleOfThePage = driver.getTitle();
		Reporter.log("The title of " + pageName + " is " + titleOfThePage);
	}

	// To varify the Page Title
	public void varifyPageTitle(String pageName, String expectedTitle) {
		String actualPageTitle = driver.getTitle();
		if (actualPageTitle.equals(expectedTitle)) {
			Reporter.log(" " + pageName + " title is matched", true);
		} else {
			Reporter.log(" " + pageName + " title is not matched", true);
		}
	}

	// Select the option from dropdown by using index
	public void selectTheOptionFromDropDown(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	// Select the option from dropdown by using String value
	public void selectTheOptionFromDropDown(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	// Select the option from dropdown by using visibleText
	public void selectTheOptionFromDropDown(String visibletext, WebElement element) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibletext);
	}

	// To switch the frame by using index
	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}

	// To switch the frame by using name or id
	public void switchToFrame(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}

	// To switch the frame by using name or id
	public void switchToFrame(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	// Actions Class Methods
	// Right click method
	public void rightClick(WebElement targetElement) {
		Actions act = new Actions(driver);
		act.contextClick(targetElement).perform();
	}

	// Mouse Hover Method
	public void mouseHover(WebElement targetElement) {
		Actions act = new Actions(driver);
		act.moveToElement(targetElement).perform();
		;
	}

	// Double Click On webElement
	public void doubleclickOnWebElement(WebElement targetElement) {
		Actions act = new Actions(driver);
		act.doubleClick(targetElement).perform();
	}

	// drag N Drop Method
	public void dragAndDropOnWebElement(WebElement src, WebElement targetElement) {
		Actions act = new Actions(driver);
		act.dragAndDrop(src, targetElement);
	}

	// Scroll Down Method
	public void scrollDown(int pixels) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0," + pixels + ")");
	}

	// Scroll Up Method
	public void scrollUP(int pixels) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0," + (-pixels) + ")");
	}

	// Scroll Right Method
	public void scrollRight(int pixels) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(" + pixels + ",0)");
	}

	// Scroll Left Mrthod
	public void scrollLeft(int pixels) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(" + (-pixels) + ",0)");
	}

	// Scroll Till Perticular Element
	public void scrollTillPerticularElement(WebElement element) {
		Point loc = element.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(" + xaxis + "," + yaxis + ")");

	}

	// Hit Enter Button Method
	public void hitEnterButtonMethod() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	// Generate Print Popup
	public void generatePrintPopup() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}

	// Copy Method
	public void copy() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	//Paste Method
	public void paste() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	//Generate Alert Popup
	public void acceptAlert()
	{
		Alert al = driver.switchTo().alert();
		al.accept();
	}
	
	//Dismiss PopUp
	public void dismissjavaScriptPopUp()
	{
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}
	
	//
	public void printAllOfDropDown(WebElement element)
	{
		Select sel = new Select(element);
		List<WebElement> allOps = sel.getOptions();
		for(WebElement we : allOps)
		{
			String text = we.getText();
			System.out.println(text);
		}
	}
}
