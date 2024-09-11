package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	@Test(retryAnalyzer = retry.Retry.class,description="This Test case is used to verify whether user is able to add new news")
	
	public void VerifyWhetherUserIsAbleToAddNews() throws IOException {

		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		String news=ExcelUtility.getStringData(1, 0, "ManageNews");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
		
		ManageNewsPage managenews = new ManageNewsPage(driver);
		
		managenews.clickOnNewNews().addNews().enterNews(news).saveNews();
	
		managenews.enterNews(news);
		managenews.saveNews();
		boolean newsalert = managenews.AlertMessageDisplayed();
		assertTrue(newsalert,Constants.ErrorManageNews);	
	}
		
	}

