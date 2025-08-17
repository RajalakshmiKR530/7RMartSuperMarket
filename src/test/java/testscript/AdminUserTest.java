package testscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.AdminUser;
import pages.LoginPage;

public class AdminUserTest extends Base {
  

@Test
@Parameters({"username","password","userids","pass"})
  public void adminUserMethods(String username,String password,String userids, String pass) {
	  
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUserNameAndPassword(username,password);
	  loginpage.clickSignIn();
	  
	  AdminUser adminuser = new AdminUser(driver);
	  adminuser.clickMoreInfo();
	  adminuser.clickNew();
	  adminuser.enterUsernamePassword(userids, pass);
	  adminuser.selectUserTypes();
	  adminuser.saveData();
	  System.out.println("User Entered Successfully");
	  
	  
}
}
