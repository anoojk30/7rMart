package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.ManageSubCategoryPage;
import utilities.ExcelUtility;

public class ManageSubCategoryTest extends Base{
	
	@Test(retryAnalyzer = retry.Retry.class,description="This test case is used to verify whether the user is able to update the status in Manage subcategory")
	
	public void VerifyWhetherUserIsAbleToUpdateActiveDetails() throws IOException
	{

		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
		
	ManageSubCategoryPage subcategory=new ManageSubCategoryPage(driver);
	subcategory.clickSubcategory().clickOnActive();

	boolean alert = subcategory.AlertMessageisDisplayed();
	assertTrue(alert,Constants.ErrorManageSubCategory);
	
			
	}

}
