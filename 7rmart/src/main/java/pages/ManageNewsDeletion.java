package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageNewsDeletion {
	PageUtility pageutility=new PageUtility();
	WebDriver driver;
	public ManageNewsDeletion(WebDriver driver)	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(xpath="//a[contains(@href,'list-news') and @class='small-box-footer']") WebElement newnews;
		@FindBy(xpath="//a[@class='btn btn-sm btn btn-danger btncss'][1]") WebElement deletenews;
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement newsalert;
		
		
	
		public ManageNewsDeletion clickOnManageNews() {
			pageutility.clickOnAnElement(newnews);
			return this;
		}
		public ManageNewsDeletion clickonDeleteNews() {
			pageutility.clickOnAnElement(deletenews);
			pageutility.acceptAlert(driver);
			return this;
		}
		public boolean IsAlertDisplayed() {
			return pageutility.isAlertDisplay(newsalert);
			
		}

}
