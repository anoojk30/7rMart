package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageProduct{	
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
				usernameField.sendKeys(username);
				
				 
			}
			
			public void enterPasswordOnPasswordField(String password) {
				passwordField.sendKeys(password);
				
			}
			
			public void clickOnSignInButton() {
				loginButton.click();
				
			}
			
			public boolean DeleteManagedProduct() {
				newproduct.click();
				delete.click();
				driver.switchTo().alert().accept();
				return alertdismissable.isDisplayed();
				
			}
			
		}


