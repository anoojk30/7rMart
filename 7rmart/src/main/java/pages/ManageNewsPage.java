package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageNewsPage {
		WebDriver driver;
		PageUtility pageutility=new PageUtility();
	public ManageNewsPage(WebDriver driver)	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(xpath="//a[contains(@href,'list-news') and @class='small-box-footer']") WebElement newnews;
		@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement addnews;
		@FindBy(xpath="//textarea[@placeholder='Enter the news']")WebElement enternews;
		@FindBy(xpath="//button[@class='btn btn-danger']")WebElement save;
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement newsalert;
		
		
			
		
		public void clickOnNewNews() {
			pageutility.clickOnAnElement(newnews);
		}
public void addNews() {
	pageutility.clickOnAnElement(addnews);
}
public void enterNews(String news) {
	pageutility.enterValueIntoElement(enternews, news);
}
public void saveNews() {
	pageutility.javaSriptClick(driver, save);
}
		public boolean AlertMessageDisplayed() {
			return newsalert.isDisplayed();
			
		}
		
	}

