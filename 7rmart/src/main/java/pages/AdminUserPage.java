package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;


public class AdminUserPage {
	
	WebDriver driver;
	PageUtility pageutility=new PageUtility();
	public AdminUserPage(WebDriver driver)	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath="//a[contains(@href,'list-admin') and @class='small-box-footer']") WebElement adminusers;
		@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement newuser;
		@FindBy(xpath="//input[@id='username']") WebElement username;
		@FindBy(xpath="//input[@id='password']") WebElement password;
		@FindBy(xpath="//select[@id='user_type']")WebElement usertype;
		@FindBy(xpath="//button[@name='Create']") WebElement save;
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert;
		
		
		
		public AdminUserPage clickOnAdminUser() {
			pageutility.clickOnAnElement(adminusers);
			return this;
			
		}
		public AdminUserPage clickOnNewUser() {
			pageutility.clickOnAnElement(newuser);
			return this;
		}
		public AdminUserPage enterUsername(String adminuser) {
		pageutility.enterValueIntoElement(username, adminuser);
		return this;
		}
		public AdminUserPage enterPassword(String adminpassword)
		{
		
		pageutility.enterValueIntoElement(password, adminpassword);
		return this;
		}
		public AdminUserPage selectUserType(String userType1) {
			pageutility.selectDropDownByVisibleText(usertype, userType1);
			return this;
		}
		public ManageContactPage clickUpdate() {
			pageutility.javaSriptClick(driver, save);
			return new ManageContactPage(driver);
		}
		
		
		public boolean AlertMessageisDisplayed() {
			
			return pageutility.isAlertDisplay(alert);
			
		}
		
	}

