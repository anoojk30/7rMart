package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import pages.ManageNews;

public class ManageNewsTest extends Base {
	@Test
	
	public void VerifyWhetherUserIsAbleToAddNews() {
		String username="admin";
		String password="admin";
		ManageNews managenews = new ManageNews(driver);
		managenews.enterUsernameOnUsernameField(username);
		managenews.enterPasswordOnPasswordField(password);
		managenews.clickOnSignInButton();
		boolean AlertMessageDisplayed = managenews.AlertMessageDisplayed();
		assertTrue(AlertMessageDisplayed,"News is not saved when user enters invalid details and save");	
	}
		
	}

