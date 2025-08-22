package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageNews;

public class ManageNewsTest extends Base{
HomePage homepage;
ManageNews managenews;
  @Test
  public void manageNewsMethods() 
  {
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUserNameAndPassword("admin","admin");
	  homepage= loginpage.clickSignIn();
	  managenews = homepage.enterMoreInfo();
	  managenews.enterNewClick().enterNews("Selenium WebDriver").enterSaveNews();
	  boolean isvisible = managenews.assertMethod();
	  Assert.assertTrue(isvisible, "not visible");
	  
	  
	  
	 /* ManageNews managenews = new ManageNews(driver);
	  managenews.enterMoreInfo();
	  managenews.enterNewClick();
	  managenews.enterNews("Selenium WebDriver");
	  managenews.enterSaveNews();*/
  }
}
