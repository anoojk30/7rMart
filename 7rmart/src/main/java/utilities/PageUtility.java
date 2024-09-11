package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void javaSriptClick(WebDriver  driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
	}
	
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();

	}
	public void clickOnAnElement(WebElement element) {
		element.click();
	}
	
	public void clearATextField(WebElement element) {
		element.clear();
	}
	
	public void enterValueIntoElement(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public boolean isAnElementDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	
	public void selectDropDownByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public void selectDropDownByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public void selectDropDownByVisibleText(WebElement element, String visibletext) {
		Select select = new Select(element);
		select.selectByVisibleText(visibletext);
	}
	public boolean isAlertDisplay(WebElement element) {
		return element.isDisplayed();
	}
	public boolean isAlertSelected(WebElement element) {
		return element.isSelected();
	}
	public boolean isAlertEnabled(WebElement element) {
		return element.isEnabled();
}
	public void MoveToElementAction(WebDriver driver, WebElement drag) {
		Actions action = new Actions(driver);
		action.moveToElement(drag);
	}

	public void rightClickAction(WebDriver driver, WebElement drag) {
		Actions action = new Actions(driver);
		action.contextClick(drag);

	}

	public void doubleClickAction(WebDriver driver, WebElement drag) {
		Actions action = new Actions(driver);
		action.doubleClick(drag);

	}

	public void dragAndDropAction(WebDriver driver, WebElement drag, WebElement drop) {
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop);

	}
}
