package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;


public class AdminUsers {
	
	WebDriver driver;
	PageUtility pageutility=new PageUtility();
	public AdminUsers(WebDriver driver)	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//input[@type='text']") WebElement usernameField;
		@FindBy(xpath="//input[@type='password']") WebElement passwordField;
		@FindBy(xpath="//button[@type='submit']") WebElement loginButton;
		@FindBy(xpath="//a[contains(@href,'list-admin') and @class='small-box-footer']") WebElement adminusers;
		@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement newuser;
		@FindBy(xpath="//input[@id='username']") WebElement username;
		@FindBy(xpath="//input[@id='password']") WebElement password;
		@FindBy(xpath="//select[@id='user_type']")WebElement usertype;
		@FindBy(xpath="//button[@name='Create']") WebElement save;
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert;
		
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
		public void clickOnAdminUser() {
			pageutility.clickOnAnElement(adminusers);
			
		}
		public void clickOnNewUser() {
			pageutility.clickOnAnElement(newuser);
		}
		public void enterUsername(String Username1) {
		pageutility.enterValueIntoElement(username, Username1);
		}
		public void enterPassword(String Password1)
		{
		
		pageutility.enterValueIntoElement(password, Password1);
		}
		public void selectUserType(String UserType1) {
			pageutility.selectDropDownByVisibleText(usertype, UserType1);
		}
		public void saveData() {
			pageutility.clickOnAnElement(save);
		}
		
		public boolean AlertMessageisDisplayed() {
			//adminusers.click();
			//newuser.click();
			//username.sendKeys("anoojk30");
			//password.sendKeys("anooj@123");
			//Select select=new Select(usertype);
			//select.selectByVisibleText("Staff");			
			//save.click();
			return alert.isDisplayed();
			
		}
		
	}

