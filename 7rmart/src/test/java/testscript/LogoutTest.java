package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LogoutPage;
import utilities.ExcelUtility;

public class LogoutTest extends Base {

	@Test
	
	public void verifyTheUserIsAbleToLogOutUsingvalidCredentials() throws IOException {
		//String username = "admin";
		//String password = "admin";
		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		LogoutPage logoutpage = new LogoutPage(driver);
		logoutpage.enterUsernameOnUsernameField(username);
		logoutpage.enterPasswordOnPasswordField(password);
		logoutpage.clickOnSignInButton();
		logoutpage.clickOnAdminButton();
		logoutpage.clickOnLogoutButton();
		boolean signout = logoutpage.signOutIsDisplayed();
		assertTrue(signout,"managecategory is not saved when user enters invalid details and save");
	}

}
