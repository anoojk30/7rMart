package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class LogoutPage {
	PageUtility pageutility=new PageUtility();
	WebDriver driver;
	
	public LogoutPage(WebDriver driver)//to convert local method to instance method
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);//to intialise the webelement
		
	}
	@FindBy(xpath="//input[@type='text']") WebElement usernameField;
	@FindBy(xpath="//input[@type='password']") WebElement passwordField;
	@FindBy(xpath="//button[@type='submit']") WebElement loginButton;
	@FindBy(xpath="//a[@class='nav-link' and @data-toggle='dropdown']") WebElement admin;
	@FindBy(xpath="//a[contains(@href,'logout') and @class='dropdown-item']") WebElement logout;
	@FindBy(xpath="//button[text()='Sign In']") WebElement signin;
	
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
	public void clickOnAdminButton() {
		pageutility.clickOnAnElement(admin);
	
	}
	public void clickOnLogoutButton() {
		pageutility.clickOnAnElement(logout);
	
	}
	public boolean signOutIsDisplayed()
	{
		return signin.isDisplayed();
	}

}
