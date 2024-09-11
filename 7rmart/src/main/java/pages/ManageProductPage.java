package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageProductPage{	
		PageUtility pageutility=new PageUtility();
		WebDriver driver;
		public ManageProductPage(WebDriver driver)	{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
			
			@FindBy(xpath="//a[contains(@href,'list-product') and @class='small-box-footer']") WebElement newproduct;
			@FindBy(xpath="//i[@class='fas fa-trash-alt'][1]")WebElement delete;
			@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertdismissable;
			
			
		
			public ManageProductPage clickOnNewProduct() {
				pageutility.clickOnAnElement(newproduct);
				return this;
			}
			public ManageProductPage clickOnDelete() {
				pageutility.clickOnAnElement(delete);
				pageutility.acceptAlert(driver);
				return this;
			}
			
			public boolean DeleteManagedProduct() {
				return pageutility.isAlertDisplay(alertdismissable);
				
				
			}
			
		}


