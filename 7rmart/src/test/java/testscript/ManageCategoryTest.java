package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.ManageCategory;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {
	@Test
	
	
	public void VerifyWhetherUserIsAbleToUpdateManageCategory() throws IOException
	{

		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		String categories=ExcelUtility.getStringData(1, 0, "ManageCategory");
		ManageCategory managecategory=new ManageCategory(driver);
		managecategory.enterUsernameOnUsernameField(username);
		managecategory.enterPasswordOnPasswordField(password);
		managecategory.clickOnSignInButton();
		managecategory.clickOnManageCategory();
		managecategory.clickonNewClick();
		managecategory.clickonCategory(categories);
		managecategory.clickonDisplay();
		managecategory.uploadImage();
		//managecategory.clickOnTopMenu();
		managecategory.clickOnSaveButton();
		
		
		
	boolean alert = managecategory.isAlertDisplayed();
	assertTrue(alert,"managecategory is not saved when user enters invalid details and save");
	
			
	}

}
