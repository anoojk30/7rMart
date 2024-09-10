package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtility;

public class ManageFooterTextTest extends Base{
	@Test(retryAnalyzer = retry.Retry.class,description="This test case is used to verify whether user is able to add a footer text details")
	
	
	public void VerifyWhetherUserIsAbleToUpdateFooterText() throws IOException
	{

		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		String address=ExcelUtility.getStringData(1, 0, "FooterText");
		String emailid=ExcelUtility.getStringData(1, 1, "FooterText");
		String phonenumber = ExcelUtility.getIntegerData(1, 2, "FooterText");
		System.out.println(phonenumber);
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
		
		ManageFooterTextPage managefootertext=new ManageFooterTextPage(driver);
		
		managefootertext.clickOnFooterText();
		managefootertext.clickonNewClick();
		managefootertext.clickonAddressField(address);
		managefootertext.clickonEmailField(emailid);
		managefootertext.clickonPhoneNumber(phonenumber);
		managefootertext.clickonUpdateButton();
		
		
	boolean alert = managefootertext.isAlertMessageDisplayed();
	assertTrue(alert,Constants.ErrorManageFooter);
	
			
	}


}
