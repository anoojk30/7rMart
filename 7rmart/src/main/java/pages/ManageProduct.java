package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageProduct{	
		PageUtility pageutility=new PageUtility();
		WebDriver driver;
		public ManageProduct(WebDriver driver)	{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
			@FindBy(xpath="//input[@type='text']") WebElement usernameField;
			@FindBy(xpath="//input[@type='password']") WebElement passwordField;
			@FindBy(xpath="//button[@type='submit']") WebElement loginButton;
			@FindBy(xpath="//a[contains(@href,'list-product') and @class='small-box-footer']") WebElement newproduct;
			@FindBy(xpath="//i[@class='fas fa-trash-alt'][1]")WebElement delete;
			@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertdismissable;
			
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
			public void clickOnNewProduct() {
				pageutility.clickOnAnElement(newproduct);
			}
			public void clickOnDelete() {
				pageutility.clickOnAnElement(delete);
				pageutility.acceptAlert(driver);
			}
			
			public boolean DeleteManagedProduct() {
				return alertdismissable.isDisplayed();
				
			}
			
		}


