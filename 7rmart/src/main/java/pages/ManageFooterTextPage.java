package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageFooterTextPage {
	
	WebDriver driver;
	PageUtility pageutility=new PageUtility();
	public ManageFooterTextPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath="//a[contains(@href,'footertext') and @class='small-box-footer']") WebElement footertext;
	@FindBy(xpath="//a[contains(@href,'edit=2')]") WebElement newclick;
	@FindBy(xpath="//textarea[@name='address']")WebElement addressfield;
	@FindBy(xpath="//input[@id='email']")WebElement emailfield;
	@FindBy(xpath="//input[@id='phone']")WebElement phonefield;
	@FindBy(xpath="//button[@name='Update']")WebElement update;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement  alert;
	
	
	
	public ManageFooterTextPage clickOnFooterText() {
		pageutility.clickOnAnElement(footertext);
		return this;
	}
	public ManageFooterTextPage clickonNewClick() {
		pageutility.clickOnAnElement(newclick);
		return this;
		
	}
	public ManageFooterTextPage clickonAddressField(String address) {
		pageutility.clearATextField(addressfield);
		pageutility.enterValueIntoElement(addressfield, address);
		return this;
	}
	public ManageFooterTextPage clickonEmailField(String emailid) {
		pageutility.clearATextField(emailfield);
		pageutility.enterValueIntoElement(emailfield, emailid);
		return this;
	}
	public ManageFooterTextPage  clickonPhoneNumber(String phonenumber) {
		pageutility.clearATextField(phonefield);
		pageutility.enterValueIntoElement(phonefield,phonenumber);
		return this;
	}
	public ManageFooterTextPage clickonUpdateButton() {
		pageutility.clickOnAnElement(update);
		return this;
	}
	public boolean isAlertMessageDisplayed() {
		return pageutility.isAnElementDisplayed(alert);
	}

}


