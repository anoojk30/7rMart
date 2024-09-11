package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.ManageNewsDeletion;

public class ManageNewsDeletionTest extends Base {
	@Test(retryAnalyzer = retry.Retry.class,description="This Test case is used to verify whether user is able to delete the news")
	
	public void VerifyWhetherUserIsAbleToDeleteNews() {
		String username="admin";
		String password="admin";
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
		
		ManageNewsDeletion managenewsdeletion = new ManageNewsDeletion(driver);
		
		managenewsdeletion.clickOnManageNews().clickonDeleteNews();
	
		boolean newsalert = managenewsdeletion.IsAlertDisplayed();
		assertTrue(newsalert,Constants.ErrorManageDeleteNews);	
	}
		
	}

