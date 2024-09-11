package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.ManageProductPage;
import utilities.ExcelUtility;

public class ManageProductTest extends Base {
	
	
		@Test(retryAnalyzer = retry.Retry.class,description="This test case is used to verify whether user is able to delete Managed product")
		
		public void VerifyWhetherUserIsAbleToDeleteProduct() throws IOException {
			String username=ExcelUtility.getStringData(1, 0, "LoginPage");
			String password=ExcelUtility.getStringData(1, 1, "LoginPage");
			LoginPage loginpage = new LoginPage(driver);
			loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
			
			ManageProductPage manageproduct = new ManageProductPage(driver);
			manageproduct.clickOnNewProduct().clickOnDelete();
			
			boolean alertdismissable = manageproduct.DeleteManagedProduct();
			assertTrue(alertdismissable,Constants.ErrorManageDeleteNews);	
		}
			
		}



