package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUser;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUserTest extends Base {
HomePage homepage;
AdminUser adminuser;
FakerUtility faker = new FakerUtility();
@Test
  public void adminUserMethods() throws IOException 
{
	  
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUserNameAndPassword("admin","admin"); 
	  homepage  = loginpage.clickSignIn();
	  adminuser = homepage.clickMoreInfo();
	  //String adminname = faker.getFakeFirstName();
	  //String adminpass= faker.getPassword();
	  
	  adminuser.clickNew().enterUsernameMethod(ExcelUtility.getStringData(1, 0, "Homepagetest")).enterPasswordMethod(ExcelUtility.getStringData(1, 1, "Homepagetest")).selectUserTypes().saveData();
	  
	  boolean isdisplay = adminuser.assertioncheck();
	  Assert.assertTrue(isdisplay, "not displayed");
	  
	  
	  /*adminuser.clickMoreInfo();
	  adminuser.clickNew();
	  adminuser.enterUsernamePassword("mmmm", "1234");
	  adminuser.selectUserTypes();
	  adminuser.saveData();*/
	  
	  
	  
}
}
