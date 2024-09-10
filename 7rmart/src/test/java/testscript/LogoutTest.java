package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;

public class LogoutTest extends Base {

	@Test(retryAnalyzer = retry.Retry.class,description="This Test case is used to verify whether user is able to logout from the website")
	
	public void verifyTheUserIsAbleToLogOutUsingvalidCredentials() throws IOException {
		
		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
		
		LogoutPage logoutpage = new LogoutPage(driver);
		logoutpage.clickOnAdminButton();
		logoutpage.clickOnLogoutButton();
		boolean signout = logoutpage.signOutIsDisplayed();
		assertTrue(signout,Constants.UserLogout);
	}

}
