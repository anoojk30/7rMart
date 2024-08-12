package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNews {
	
	WebDriver driver;
	public ManageNews(WebDriver driver)	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//input[@type='text']") WebElement usernameField;
		@FindBy(xpath="//input[@type='password']") WebElement passwordField;
		@FindBy(xpath="//button[@type='submit']") WebElement loginButton;
		//@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[10]/div/a")WebElement newnews;
		@FindBy(xpath="//a[contains(@href,'list-news') and @class='small-box-footer']") WebElement newnews;
		@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement addnews;
		@FindBy(xpath="//textarea[@placeholder='Enter the news']")WebElement enternews;
		@FindBy(xpath="//button[@class='btn btn-danger']")WebElement save;
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement newsalert;
		
		public void enterUsernameOnUsernameField(String username) {
			usernameField.sendKeys(username);
			
			 
		}
		
		public void enterPasswordOnPasswordField(String password) {
			passwordField.sendKeys(password);
			
		}
		
		public void clickOnSignInButton() {
			loginButton.click();
			
		}
		
		public boolean AlertMessageDisplayed() {
			newnews.click();
			addnews.click();
			enternews.sendKeys("Heavy Rain in Kerala");
			save.click();
			return newsalert.isDisplayed();
			
		}
		
	}

