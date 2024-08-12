package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.ManageProduct;

public class ManageProductTest extends Base {
	
	
		@Test
		
		public void VerifyWhetherUserIsAbleToDeleteProduct() {
			String username="admin";
			String password="admin";
			ManageProduct manageproduct = new ManageProduct(driver);
			manageproduct.enterUsernameOnUsernameField(username);
			manageproduct.enterPasswordOnPasswordField(password);
			manageproduct.clickOnSignInButton();
			boolean DeleteManagedProduct = manageproduct.DeleteManagedProduct();
			assertTrue(DeleteManagedProduct,"Product is not deleted when user enters invalid credentilals");	
		}
			
		}



