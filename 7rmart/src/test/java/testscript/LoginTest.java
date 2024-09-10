package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	@Test(groups = {"Regression"},description="verify that user is able to login with valid credential")//groups= {"Smoke"}
	
	public void verifyTheUserIsAbleToLoginUsingvalidCredentials() throws IOException {
	
		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
		boolean ishomepageloaded = loginpage.isHomePageLoaded();
		assertTrue(ishomepageloaded,Constants.ErrorLogin);	
	}
	@Test(retryAnalyzer=retry.Retry.class,description="verify that user is not able to login with invalid username and Valid Password")
	
	public void verifyTheUserIsAbleToLoginUsinginvalidUsernameAndValidPassword() throws IOException {
		
		String username=ExcelUtility.getStringData(2, 0, "LoginPage");
		String password=ExcelUtility.getStringData(2, 5, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
		boolean isAlertMessageDisplayed = loginpage.isAlertMessageDisplayed();
		assertTrue(isAlertMessageDisplayed,Constants.ErrorIncorrectLogin);	
	}
	@Test(retryAnalyzer = retry.Retry.class,description="verify that user is not able to login with invalid username and invalid password")
	
	public void VerifyWhetherUserIsAbleToLoginUsingValidUsernameAndInvalidPassword() throws IOException {
	
		String username=ExcelUtility.getStringData(3, 0, "LoginPage");
		String password=ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
		boolean isAlertMessageDisplayed = loginpage.isAlertMessageDisplayed();
		assertTrue(isAlertMessageDisplayed,Constants.ErrorIncorrectLogin);	
	}
@Test(retryAnalyzer = retry.Retry.class,description="verify that user is not able to login with invalid credential",dataProvider = "LoginProvider")
	
	public void VerifyWhetherUserIsAbleToLoginUsingInvalidUsernameAndInvalidPassword(String username, String password) throws IOException {

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
		boolean isAlertMessageDisplayed = loginpage.isAlertMessageDisplayed();
		assertTrue(isAlertMessageDisplayed,Constants.ErrorIncorrectLogin);	
	}
@DataProvider(name = "LoginProvider")
public Object[][] getDataFromTestData() throws IOException {
	return new Object[][] {{
		ExcelUtility.getStringData(4, 0, "LoginPage"), ExcelUtility.getStringData(4, 1, "LoginPage") },};	
}
}
