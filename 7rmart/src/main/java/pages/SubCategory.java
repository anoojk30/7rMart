package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class SubCategory {
	
	WebDriver driver;
	PageUtility pageutility=new PageUtility();
	public SubCategory(WebDriver driver)	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//input[@type='text']") WebElement usernameField;
		@FindBy(xpath="//input[@type='password']") WebElement passwordField;
		@FindBy(xpath="//button[@type='submit']") WebElement loginButton;
		@FindBy(xpath="//a[contains(@href,'sub-category') and @class='small-box-footer']") WebElement subcategory;
		@FindBy(xpath="//span[contains(@class,'badge bg-')]") WebElement  active;
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement  alert;
		
		
		public void enterUsernameOnUsernameField(String username) {
			//usernameField.sendKeys(username);
			pageutility.enterValueIntoElement(usernameField, username);
			
			 
		}
		
		public void enterPasswordOnPasswordField(String password) {
			//passwordField.sendKeys(password);
			pageutility.enterValueIntoElement(passwordField, password);
			
		}
		
		public void clickOnSignInButton() {
			pageutility.clickOnAnElement(loginButton);
		
		}
		public void clickSubcategory() {
			pageutility.clickOnAnElement(subcategory);
		}
		public void clickOnActive() {
			pageutility.clickOnAnElement(active);
		}
		public boolean AlertMessageisDisplayed() {
			//subcategory.click();
			//active.click();
			return alert.isDisplayed();
			
			
		}
		
		
}
