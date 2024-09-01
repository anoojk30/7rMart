package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AdminUsers;
import utilities.ExcelUtility;

public class ManageAdminUsersTest extends Base {
	@Test
	
	public void VerifyWhetherAdminUserIsAbleToUpdateData() throws IOException {
		//String username="admin";
		//String password="admin";
		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		String username1=ExcelUtility.getStringData(1, 0, "AdminUsers");
		String password1=ExcelUtility.getStringData(1, 1, "AdminUsers");
		String UserType1=ExcelUtility.getStringData(1, 2, "AdminUsers");
		AdminUsers adminusers = new AdminUsers(driver);
		adminusers.enterUsernameOnUsernameField(username);
		adminusers.enterPasswordOnPasswordField(password);
		adminusers.clickOnSignInButton();
		adminusers.clickOnAdminUser();
		adminusers.clickOnNewUser();
		adminusers.enterUsername(username1);
		adminusers.enterPassword(password1);
		adminusers.selectUserType(UserType1);
		adminusers.saveData();
		boolean alert = adminusers.AlertMessageisDisplayed();
		assertTrue(alert,"Admin User data is not saved when user enters invalid details and save");	
	}
		
}
