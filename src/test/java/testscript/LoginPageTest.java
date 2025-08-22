package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginPageTest extends Base {
	
  HomePage homepage;
  
  @Test
  @Parameters({"username","password"})
  public void verifyUserCanAbleToLoginCorrectUsernameAndPassword(String username, String password) 
  {
	  
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUserNameAndPassword(username,password);
	  homepage =  loginpage.clickSignIn();
	  
	  boolean ishomepageisloaded = loginpage.isDashboardIsDisplay();
	  Assert.assertTrue(ishomepageisloaded, Constants.ERRORMESSAGEFORLOGIN);
	 	 
	
  }
  @Test(dataProvider = "accessDetails")
  public void verifyUserCanAbleToLoginInCorrectUsernameAndPassword(String username,String password) 
  {
	  
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUserNameAndPassword(username,password);
	  loginpage.clickSignIn();
	  
	  boolean isalertisloaded = loginpage.isAlertIsDisplay();
	  Assert.assertTrue(isalertisloaded, Constants.ERRORMESSAGEFORLOGININCORRECTUSERNAMEANDPASSWORD);
  }	
  @Test
  public void verifyUserCanAbleToLoginInCorrectUsernameAndCorrectPassword() throws IOException 
  {
	  String username = ExcelUtility.getStringData(1, 0,"LoginpageTest");
	  String password = ExcelUtility.getStringData(1, 1, "LoginpageTest");
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUserNameAndPassword("admins", "admin");
	  loginpage.clickSignIn();
	  
	  boolean isalert = loginpage.isAlertIsDisplay();
	  Assert.assertTrue(isalert, Constants.ERRORMESSAGEFORLOGINCORRECTUSERNAMEANDINCORRECTPASSWORD);
	 	  
	  
  }
  @Test
  public void verifyUserCanAbleToLoginCorrectUsernameAndInCorrectPassword() throws IOException 
  {

	  String username = ExcelUtility.getStringData(2, 0,"LoginpageTest");
	  String password = ExcelUtility.getStringData(2, 1,"LoginpageTest");
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUserNameAndPassword("admin", "adm");
	  loginpage.clickSignIn();
	  
	  boolean alertloaded = loginpage.isAlertIsDisplay();
	  Assert.assertTrue(alertloaded, Constants.ERRORMESSAGEFORLOGINCORRECTUSERNAMEANDINCORRECTPASSWORD);
	  
  } 
  
  @DataProvider(name="accessDetails")
  public Object[][] values()
  {
	  Object data[][]= {
			  {"admins","admin"},
			  {"admin","1234"}
			  
	  };
	return data;
	  
  }
  
  
}

