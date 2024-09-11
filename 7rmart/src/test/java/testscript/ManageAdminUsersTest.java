package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.AdminUserPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class ManageAdminUsersTest extends Base {
	@Test(description="The testcase verify whether user can create a new Admin User")
	public void VerifyWhetherUserCanCreateNewAdminUser() throws IOException {
		
		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		String adminuser=ExcelUtility.getStringData(1, 0, "AdminUsers");
		String adminpassword=ExcelUtility.getStringData(1, 1, "AdminUsers");
		String UserType1=ExcelUtility.getStringData(1, 2, "AdminUsers");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
		
		AdminUserPage adminusers = new AdminUserPage(driver);
		
		adminusers.clickOnAdminUser().clickOnNewUser().enterUsername(adminuser).enterPassword(adminpassword).selectUserType(UserType1).clickUpdate();
		
		boolean alert = adminusers.AlertMessageisDisplayed();
		assertTrue(alert,Constants.ErrorAdminUserId);	
	}
		
}
