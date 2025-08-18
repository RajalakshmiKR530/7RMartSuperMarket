package testscript;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends Base {
  @Test
  @Parameters({"username","password"})
  
  public void logoutMethods(String username,String password)
  {
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUserNameAndPassword(username,password);
	  loginpage.clickSignIn();
	  
	  HomePage homepage  = new HomePage(driver);
	  homepage.clickLogout();
	  
	  
  }
}
