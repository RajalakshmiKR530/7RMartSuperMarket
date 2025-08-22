package testscript;


import org.testng.annotations.Test;

import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategory;

public class ManageCategoryTest extends Base {
HomePage homepage;
ManageCategory managecategory;
 @Test
  public void manageCategoryMethods() 
  {
	 LoginPage loginpage = new LoginPage(driver);
	 loginpage.enterUserNameAndPassword("admin", "admin");
	 homepage=loginpage.clickSignIn();
	 managecategory = homepage.categoryMoreInfo();
	 managecategory.newcategory().enterCategory("pasta").discountMethod().fileUpload(Constants.IMAGEPATH).showMenu().saveCategory();
	 
	 
	/* ManageCategory  managecategory = new  ManageCategory(driver);
	 managecategory.categoryMoreInfo();
	 managecategory.newcategory();
	 managecategory.enterCategory("pasta");
	 managecategory.discountMethod();
	 managecategory.fileUpload(Constants.IMAGEPATH);
	 managecategory.showMenu();
	 managecategory.saveCategory();*/
  }
}
