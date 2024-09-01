package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.SubCategory;
import utilities.ExcelUtility;

public class ManageSubCategoryTest extends Base{
	
	@Test
	
	public void VerifyWhetherUserIsAbleToUpdateActiveDetails() throws IOException
	{

	//String username="admin";
	//String password="admin";
		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	SubCategory subcategory=new SubCategory(driver);
	subcategory.enterUsernameOnUsernameField(username);
	subcategory.enterPasswordOnPasswordField(password);
	subcategory.clickOnSignInButton();
	subcategory.clickSubcategory();
	subcategory.clickOnActive();
	boolean alert = subcategory.AlertMessageisDisplayed();
	assertTrue(alert,"Status is not saved when user enters invalid details and save");
	
			
	}

}
