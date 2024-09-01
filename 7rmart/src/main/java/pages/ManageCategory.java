package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constants;
import utilities.FileUploadUtility;
import utilities.PageUtility;

public class ManageCategory {
	
	WebDriver driver;
	PageUtility pageutility=new PageUtility();
	FileUploadUtility fileuploadutility=new FileUploadUtility();
	
	public ManageCategory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}
	@FindBy(xpath="//input[@type='text']") WebElement usernameField;
	@FindBy(xpath="//input[@type='password']") WebElement passwordField;
	@FindBy(xpath="//button[@type='submit']") WebElement loginButton;
	@FindBy(xpath="//a[contains(@href,'list-category') and @class='small-box-footer']") WebElement manageCategory;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newclick;
	@FindBy(xpath="//input[@id='category']") WebElement category;
	@FindBy(xpath="//li[@id='134-selectable']") WebElement displays;
	@FindBy(xpath="//input[@id='main_img']") WebElement choosefile;
	//@FindBy(xpath="//input[contains(@name,'top_menu') and @value='no']") WebElement topmenu;
	@FindBy(xpath="//button[text()='Save']") WebElement save;
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
	public void clickOnManageCategory() {
		pageutility.clickOnAnElement(manageCategory);
	}
	public void clickonNewClick() {
		pageutility.clickOnAnElement(newclick);
	}
	public void clickonCategory(String categories) {
		pageutility.enterValueIntoElement(category, categories);
		
	}
	public void clickonDisplay() {
		pageutility.clickOnAnElement(displays);
	}
	public void uploadImage() {
		fileuploadutility.fileUploadUsingSendKeys(choosefile, Constants.Image);
	}
/*	public void clickOnTopMenu() {
		pageutility.clickOnAnElement(topmenu);
	}*/
	public void clickOnSaveButton() {
		pageutility.javaSriptClick(driver, save);
	}
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
		
	}
}
