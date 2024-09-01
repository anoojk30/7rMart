package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	@Test(groups = {"Regression"})//groups= {"Smoke"}
	
	public void verifyTheUserIsAbleToLoginUsingvalidCredentials() throws IOException {
		//String username = "admin";
		//String password = "admin";
		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		boolean ishomepageloaded = loginpage.isHomePageLoaded();
		assertTrue(ishomepageloaded,"Homepage is loaded when user enters valid credentials");	
	}
	@Test(retryAnalyzer=retry.Retry.class,description="verify that user is not able to login with invalid credential")
	
	public void verifyTheUserIsAbleToLoginUsinginvalidCredentials() throws IOException {
		//String username = "admin";
		//String password = "password";
		String username=ExcelUtility.getStringData(2, 0, "LoginPage");
		String password=ExcelUtility.getStringData(2, 5, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		boolean isAlertMessageDisplayed = loginpage.isAlertMessageDisplayed();
		assertTrue(isAlertMessageDisplayed,"Homepage is not loaded when user enters valid credentials");	
	}
	@Test
	
	public void verifyTheUserIsAbleToLoginUsinginvalidCredentialss() throws IOException {
		//String username = "admin";
		//String password = "admins";
		String username=ExcelUtility.getStringData(3, 0, "LoginPage");
		String password=ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		boolean isAlertMessageDisplayed = loginpage.isAlertMessageDisplayed();
		assertTrue(isAlertMessageDisplayed,"Homepage is not loaded when user enters valid credentials");	
	}
@Test(dataProvider = "LoginProvider")
	
	public void verifyTheUserIsAbleToLoginUsinginvalidCredentials2(String username, String password) throws IOException {
		//String username = "admins";
		//String password = "admins";
	//String username=ExcelUtility.getStringData(4, 0, "LoginPage");
	//String password=ExcelUtility.getStringData(4, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		boolean isAlertMessageDisplayed = loginpage.isAlertMessageDisplayed();
		assertTrue(isAlertMessageDisplayed,"Homepage is not loaded when user enters valid credentials");	
	}
@DataProvider(name = "LoginProvider")
public Object[][] getDataFromTestData() throws IOException {
	return new Object[][] {{
		ExcelUtility.getStringData(4, 0, "LoginPage"), ExcelUtility.getStringData(4, 1, "LoginPage") },};	
}
}
