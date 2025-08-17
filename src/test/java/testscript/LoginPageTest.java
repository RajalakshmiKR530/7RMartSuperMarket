package testscript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPageTest extends Base {
  @Test
  @Parameters({"username","password"})
  public void verifyUserCanAbleToLoginCorrectUsernameAndPassword(String username, String password) 
  {
	  
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUserNameAndPassword(username,password);
	  loginpage.clickSignIn();
	  System.out.println("Access Granted");
	
  }
  @Test(dataProvider = "accessDetails")
  public void verifyUserCanAbleToLoginInCorrectUsernameAndPassword(String username,String password) 
  {
	  
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUserNameAndPassword(username,password);
	  loginpage.clickSignIn();
	  System.out.println("Access Denied");
  }	
  @Test
  public void verifyUserCanAbleToLoginInCorrectUsernameAndCorrectPassword() 
  {
	  
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUserNameAndPassword("admins", "admin");
	  loginpage.clickSignIn();
	  System.out.println("Access Denied");
  }
  @Test
  public void verifyUserCanAbleToLoginCorrectUsernameAndInCorrectPassword() 
  {
	  
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUserNameAndPassword("admin", "1234");
	  loginpage.clickSignIn();
	  System.out.println("Access Denied");
  } 
  
  @DataProvider(name="accessDetails")
  public Object[][] values()
  {
	  Object data[][]= {
			  {"adm","1234"},
			  {"admins","admin"},
			  {"admin","1234"}
			  
	  };
	return data;
	  
  }
  
  
}

