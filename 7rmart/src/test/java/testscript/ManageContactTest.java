package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base {
	
	@Test(retryAnalyzer = retry.Retry.class,description="This testcase is used to verify whether user is able to add a contact us information")
	
	public void VerifyWhetherUserIsAbleToUpdateContactDetails() throws IOException
	{

		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		String addresss=ExcelUtility.getStringData(1, 1, "ManageContact");
		String emailid=ExcelUtility.getStringData(1, 4, "ManageContact");
		String phonenumber = ExcelUtility.getIntegerData(1, 0, "ManageContact");
		System.out.println(phonenumber);
		String deliverytimee=ExcelUtility.getIntegerData(1, 2, "ManageContact");
		System.out.println(deliverytimee);
		String deliverylimitt=ExcelUtility.getStringData(1,3, "ManageContact");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
		
	ManageContactPage managecontact=new ManageContactPage(driver);

	managecontact.clickOnContactUser();
	managecontact.clickOnAction();
	managecontact.enterPhoneNumber(phonenumber);
	managecontact.enterAddress(addresss);
	managecontact.enterEmailId(emailid);
	managecontact.enterDeliveryLimit(deliverylimitt);
	managecontact.enterDeliveryTime(deliverytimee);
	managecontact.clickUpdate();
	
	boolean alert = managecontact.AlertMessageisDisplayed();
	assertTrue(alert,Constants.ErrorManageContact);
	
			
	
}
}
