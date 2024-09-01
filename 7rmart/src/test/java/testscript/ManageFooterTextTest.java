package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.ManageFooterText;
import utilities.ExcelUtility;

public class ManageFooterTextTest extends Base{
	@Test
	
	
	public void VerifyWhetherUserIsAbleToUpdateFooterText() throws IOException
	{

		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		String address=ExcelUtility.getStringData(1, 0, "FooterText");
		String emailid=ExcelUtility.getStringData(1, 1, "FooterText");
		String phonenumber = ExcelUtility.getIntegerData(1, 2, "FooterText");
		System.out.println(phonenumber);
		ManageFooterText managefootertext=new ManageFooterText(driver);
		managefootertext.enterUsernameOnUsernameField(username);
		managefootertext.enterPasswordOnPasswordField(password);
		managefootertext.clickOnSignInButton();
		managefootertext.clickOnFooterText();
		managefootertext.clickonNewClick();
		managefootertext.clickonAddressField(address);
		managefootertext.clickonEmailField(emailid);
		managefootertext.clickonPhoneNumber(phonenumber);
		managefootertext.clickonUpdateButton();
		
		
	boolean alert = managefootertext.isAlertMessageDisplayed();
	assertTrue(alert,"Footertext is not saved when user enters invalid details and save");
	
			
	}


}
