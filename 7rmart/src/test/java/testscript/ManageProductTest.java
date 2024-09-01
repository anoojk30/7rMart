package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.ManageProduct;
import utilities.ExcelUtility;

public class ManageProductTest extends Base {
	
	
		@Test
		
		public void VerifyWhetherUserIsAbleToDeleteProduct() throws IOException {
			String username=ExcelUtility.getStringData(1, 0, "LoginPage");
			String password=ExcelUtility.getStringData(1, 1, "LoginPage");
			ManageProduct manageproduct = new ManageProduct(driver);
			manageproduct.enterUsernameOnUsernameField(username);
			manageproduct.enterPasswordOnPasswordField(password);
			manageproduct.clickOnSignInButton();
			manageproduct.clickOnNewProduct();
			manageproduct.clickOnDelete();
			boolean alertdismissable = manageproduct.DeleteManagedProduct();
			assertTrue(alertdismissable,"Product is not deleted when user enters invalid credentilals");	
		}
			
		}



