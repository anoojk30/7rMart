package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;
import pages.ManageNews;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	@Test
	
	public void VerifyWhetherUserIsAbleToAddNews() throws IOException {
		//String username="admin";
		//String password="admin";
		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		String news=ExcelUtility.getStringData(1, 0, "ManageNews");
		ManageNews managenews = new ManageNews(driver);
		managenews.enterUsernameOnUsernameField(username);
		managenews.enterPasswordOnPasswordField(password);
		managenews.clickOnSignInButton();
		managenews.clickOnNewNews();
		managenews.addNews();
		managenews.enterNews(news);
		managenews.saveNews();
		boolean newsalert = managenews.AlertMessageDisplayed();
		assertTrue(newsalert,"News is not saved when user enters invalid details and save");	
	}
		
	}

