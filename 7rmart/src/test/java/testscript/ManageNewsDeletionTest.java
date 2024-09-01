package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.ManageNewsDeletion;

public class ManageNewsDeletionTest extends Base {
	@Test
	
	public void VerifyWhetherUserIsAbleToAddNews() {
		String username="admin";
		String password="admin";
		ManageNewsDeletion managenewsdeletion = new ManageNewsDeletion(driver);
		managenewsdeletion.enterUsernameOnUsernameField(username);
		managenewsdeletion.enterPasswordOnPasswordField(password);
		managenewsdeletion.clickOnSignInButton();
		managenewsdeletion.clickOnManageNews();
		managenewsdeletion.clickonDeleteNews();
		boolean newsalert = managenewsdeletion.IsAlertDisplayed();
		assertTrue(newsalert,"News is not saved when user enters invalid details and save");	
	}
		
	}

