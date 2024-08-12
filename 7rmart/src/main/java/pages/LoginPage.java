package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	WebDriver driver;
	public LoginPage(WebDriver driver)//to convert local method to instance method
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);//to intialise the webelement
		
	}
	@FindBy(xpath="//input[@type='text']") WebElement usernameField;
	@FindBy(xpath="//input[@type='password']") WebElement passwordField;
	@FindBy(xpath="//button[@type='submit']") WebElement loginButton;
	@FindBy(xpath="//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']") WebElement adminImage;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement loginalert;
	
	public void enterUsernameOnUsernameField(String username) {
		usernameField.sendKeys(username);
		
		 
	}
	
	public void enterPasswordOnPasswordField(String password) {
		passwordField.sendKeys(password);
		
	}
	
	public void clickOnSignInButton() {
		loginButton.click();
		
	}
	
	public boolean isHomePageLoaded() {
		return adminImage.isDisplayed();
	}
	public boolean isAlertMessageDisplayed() {
		return loginalert.isDisplayed();
	}

}
