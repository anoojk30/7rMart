package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base {
	@Test
	
	public void verifyTheUserIsAbleToLoginUsingvalidCredentials() {
		String username = "admin";
		String password = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		boolean ishomepageloaded = loginpage.isHomePageLoaded();
		assertTrue(ishomepageloaded,"Homepage is loaded when user enters valid credentials");	
	}
	@Test
	
	public void verifyTheUserIsAbleToLoginUsinginvalidCredentials() {
		String username = "admin";
		String password = "password";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		boolean isAlertMessageDisplayed = loginpage.isAlertMessageDisplayed();
		assertTrue(isAlertMessageDisplayed,"Homepage is not loaded when user enters valid credentials");	
	}
	@Test
	
	public void verifyTheUserIsAbleToLoginUsinginvalidCredentialss() {
		String username = "admin";
		String password = "admins";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		boolean isAlertMessageDisplayed = loginpage.isAlertMessageDisplayed();
		assertTrue(isAlertMessageDisplayed,"Homepage is not loaded when user enters valid credentials");	
	}
}
