package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class LoginPage{
	PageUtility pageutility=new PageUtility();
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
	
	@FindBy(xpath="//a[contains(@href,'list-admin') and @class='small-box-footer']") WebElement adminusers;
	@FindBy(xpath="//a[contains(@href,'list-category') and @class='small-box-footer']") WebElement manageCategory;
	@FindBy(xpath="//a[contains(@href,'list-contact') and @class='small-box-footer']") WebElement contactusers;
	@FindBy(xpath="//a[contains(@href,'footertext') and @class='small-box-footer']") WebElement footertext;
	@FindBy(xpath="//a[contains(@href,'list-news') and @class='small-box-footer']") WebElement newnews;
	@FindBy(xpath="//a[contains(@href,'list-product') and @class='small-box-footer']") WebElement newproduct;
	@FindBy(xpath="//a[contains(@href,'sub-category') and @class='small-box-footer']") WebElement subcategory;
	
	public LoginPage enterUsernameOnUsernameField(String username) {
		pageutility.enterValueIntoElement(usernameField, username);
		return this;
		
		 
	}
	
	public LoginPage enterPasswordOnPasswordField(String password) {
		//passwordField.sendKeys(password);
		pageutility.enterValueIntoElement(passwordField, password);
		return this;
		
	}
	
	public LoginPage clickOnSignInButton() {
		WaitUtility waitutility=new WaitUtility();
		waitutility.waitForElementToBeClickable(driver, loginButton);
		pageutility.clickOnAnElement(loginButton);
		return this;
		
	}
	public ManageContactPage clickOnContactUser() {
		pageutility.clickOnAnElement(contactusers);
		return new ManageContactPage(driver);
		
		}
	public AdminUserPage clickOnAdminUser() {
		pageutility.clickOnAnElement(adminusers);
		return new AdminUserPage(driver);
	}
	public ManageCategoryPage clickOnManageCategory() {
		pageutility.clickOnAnElement(manageCategory);
	return new ManageCategoryPage(driver);	
	}
	
	public ManageFooterTextPage clickOnFooterText() {
		pageutility.clickOnAnElement(footertext);
		return new ManageFooterTextPage(driver);
	}
	public ManageNewsPage clickOnNewNews() {
		pageutility.clickOnAnElement(newnews);
		return new ManageNewsPage(driver);
	}
	
	public ManageProductPage clickOnNewProduct() {
		pageutility.clickOnAnElement(newproduct);
		return new ManageProductPage(driver);
	}
	public ManageSubCategoryPage clickSubcategory() {
		pageutility.clickOnAnElement(subcategory);
		return new ManageSubCategoryPage(driver);
	}
	public boolean isHomePageLoaded() {
		return pageutility.isAnElementDisplayed(adminImage);
	}
	public boolean isAlertMessageDisplayed() {
		return pageutility.isAlertDisplay(loginalert); 
	}

}
