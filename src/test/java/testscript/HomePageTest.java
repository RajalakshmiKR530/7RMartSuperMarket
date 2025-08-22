package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends Base {
	
 HomePage homepage; // globally create reference.
  @Test
  public void logoutMethods()
  {
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUserNameAndPassword("admin","admin");
	  homepage=loginpage.clickSignIn();// to connect with the homepage.
	 
	  //boolean assertcheck = homepage.isAvatarDisplayed();
	  //Assert.assertTrue(assertcheck, "Not display");
	  
	  homepage.clickAdmin().clickLogout(); 
	  
	 /* HomePage homepage  = new HomePage(driver);
	  homepage.clickAdmin();
	  homepage.clickLogout(); */
	  //String title = driver.getTitle();
	 //System.out.println(title);
	  String expectedTitle = "Login | 7rmart supermarket";
	  String actualTitle  = driver.getTitle();
	  Assert.assertEquals(actualTitle,expectedTitle,"title mismatch"); 
	  
  }
}
