package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageCategoryPage {
	
	WebDriver driver;
	PageUtility pageutility=new PageUtility();
	FileUploadUtility fileuploadutility=new FileUploadUtility();
	
	public ManageCategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath="//a[contains(@href,'list-category') and @class='small-box-footer']") WebElement manageCategory;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newclick;
	@FindBy(xpath="//input[@id='category']") WebElement category;
	@FindBy(xpath="//li[@id='134-selectable']") WebElement displays;
	@FindBy(xpath="//input[@id='main_img']") WebElement choosefile;
	@FindBy(xpath="//input[contains(@name,'top_menu') and @value='no']") WebElement topmenu;
	@FindBy(xpath="//button[text()='Save']") WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert;
	
	
	
	public ManageCategoryPage clickOnManageCategory() {
		pageutility.clickOnAnElement(manageCategory);
		return this;
	}
	public ManageCategoryPage clickonNewClick() {
		pageutility.clickOnAnElement(newclick);
		return this;
	}
	public ManageCategoryPage clickonCategory(String categories) {
		pageutility.enterValueIntoElement(category, categories);
		return this;
		
	}
	public ManageCategoryPage clickonDisplay() {
		pageutility.clickOnAnElement(displays);
		return this;
	}
	public ManageCategoryPage uploadImage() {
		fileuploadutility.fileUploadUsingSendKeys(choosefile, Constants.Image);
		return this;
	}
	public ManageCategoryPage clickOnTopMenu() {
		pageutility.clickOnAnElement(topmenu);
		return this;
	}
	public ManageContactPage clickUpdate() {
		pageutility.javaSriptClick(driver, save);
		return new ManageContactPage(driver);
	}
	public boolean isAlertDisplayed()
	{
		WaitUtility waitutility = new WaitUtility();
		waitutility.waitForAlertToBeVisible(driver);
		return pageutility.isAlertDisplay(alert);
		
	}
}
