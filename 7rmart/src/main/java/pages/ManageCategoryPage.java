package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploadUtility;
import utilities.PageUtility;

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
	//@FindBy(xpath="//input[contains(@name,'top_menu') and @value='no']") WebElement topmenu;
	@FindBy(xpath="//button[text()='Save']") WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert;
	
	
	
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
