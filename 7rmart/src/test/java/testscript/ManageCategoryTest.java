package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {
	@Test(retryAnalyzer = retry.Retry.class,description="This Test case is used to verify whether user is able to add a new category")
	
	
	public void VerifyWhetherUserIsAbleToUpdateManageCategory() throws IOException
	{

		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		String categories=ExcelUtility.getStringData(1, 0, "ManageCategory");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
		
		ManageCategoryPage managecategory=new ManageCategoryPage(driver);
		
		managecategory.clickOnManageCategory();
		managecategory.clickonNewClick();
		managecategory.clickonCategory(categories);
		managecategory.clickonDisplay();
		managecategory.uploadImage();
		managecategory.clickOnSaveButton();
		
		
		
	boolean alert = managecategory.isAlertDisplayed();
	assertTrue(alert,Constants.ErrorManageCategory);
	
			
	}

}
