package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageSubCategoryPage {
	
	WebDriver driver;
	PageUtility pageutility=new PageUtility();
	public ManageSubCategoryPage(WebDriver driver)	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(xpath="//a[contains(@href,'sub-category') and @class='small-box-footer']") WebElement subcategory;
		@FindBy(xpath="//span[contains(@class,'badge bg-')]") WebElement  active;
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement  alert;
		
		

	
		public ManageSubCategoryPage clickSubcategory() {
			pageutility.clickOnAnElement(subcategory);
			return this;
		}
		public ManageSubCategoryPage clickOnActive() {
			pageutility.clickOnAnElement(active);
			return this;
		}
		public boolean AlertMessageisDisplayed() {
			return pageutility.isAlertDisplay(alert);
			
			
		}
		
		
}
