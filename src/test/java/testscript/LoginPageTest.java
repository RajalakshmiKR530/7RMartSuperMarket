package testscript;

import org.testng.Assert;
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
	  boolean ishomepageisloaded = loginpage.isDashboardIsDisplay();
	  Assert.assertTrue(ishomepageisloaded, "Homepage is not loaded");
	 
	
  }
  @Test(dataProvider = "accessDetails")
  public void verifyUserCanAbleToLoginInCorrectUsernameAndPassword(String username,String password) 
  {
	  
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUserNameAndPassword(username,password);
	  loginpage.clickSignIn();
	  boolean isalertisloaded = loginpage.isAlertIsDisplay();
	  Assert.assertTrue(isalertisloaded, "Alert is not displayed");
  }	
  @Test
  public void verifyUserCanAbleToLoginInCorrectUsernameAndCorrectPassword() 
  {
	  
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUserNameAndPassword("admins", "admin");
	  loginpage.clickSignIn();
	  boolean isalert = loginpage.isAlertIsDisplay();
	  Assert.assertTrue(isalert, "Alert is not displayed");
	  
	  
	  
  }
  @Test
  public void verifyUserCanAbleToLoginCorrectUsernameAndInCorrectPassword() 
  {
	  
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUserNameAndPassword("admin", "1234");
	  loginpage.clickSignIn();
	  boolean alertloaded = loginpage.isAlertIsDisplay();
	  Assert.assertTrue(alertloaded, "Alert is not displayed");
	  
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

