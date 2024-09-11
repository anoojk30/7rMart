package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageContactPage {

		
		WebDriver driver;
		PageUtility pageutility=new PageUtility();
		public ManageContactPage(WebDriver driver)	{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
			
			@FindBy(xpath="//a[contains(@href,'list-contact') and @class='small-box-footer']") WebElement contactusers;
			@FindBy(xpath="//a[@class='btn btn-sm btn btn-primary btncss']") WebElement action;
			@FindBy(xpath="//input[@id='phone']") WebElement phone;
			@FindBy(xpath="//input[@id='email']") WebElement email;
			@FindBy(xpath="//textarea[@placeholder='Enter the Address']") WebElement address;
			@FindBy(xpath="//textarea[@placeholder='Enter Delivery Time']") WebElement deliverytime;
			@FindBy(xpath="//input[@id='del_limit']") WebElement deliverylimit;
			@FindBy(xpath="//button[@name='Update']") WebElement update;
			@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert;
			
			public ManageContactPage clickOnContactUser() {
				pageutility.clickOnAnElement(contactusers);
				return this;
				}
			public ManageContactPage clickOnAction() {
				pageutility.clickOnAnElement(action);
				return this;
			}
			public ManageContactPage enterPhoneNumber(String phonenumber) {
				pageutility.clearATextField(phone);
				pageutility.enterValueIntoElement(phone,phonenumber);
				return this;
				
			}
			public ManageContactPage enterEmailId(String emailid) {
				pageutility.clearATextField(email);
				pageutility.enterValueIntoElement(email,emailid);
				return this;
			}
			public ManageContactPage enterAddress(String addresss) {
				pageutility.clearATextField(address);
				pageutility.enterValueIntoElement(address,addresss);
				return this;
			}
			public ManageContactPage enterDeliveryTime(String deliverytimee) {
				pageutility.clearATextField(deliverytime);
				pageutility.enterValueIntoElement(deliverytime,deliverytimee);
				return this;
			}
			public ManageContactPage enterDeliveryLimit(String deliverylimitt) {
				pageutility.clearATextField(deliverylimit);
				pageutility.enterValueIntoElement(deliverylimit,deliverylimitt);
				return this;
			}
			public ManageContactPage clickUpdate() {
				pageutility.javaSriptClick(driver, update);
				return this;
			}
			
			public boolean AlertMessageisDisplayed() {
				return pageutility.isAlertDisplay(alert);
				
				
			}
			
			
			
			

}
