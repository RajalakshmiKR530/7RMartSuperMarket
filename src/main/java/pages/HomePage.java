package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class HomePage {
	
public WebDriver driver;

WaitUtility util;


public HomePage(WebDriver driver)
{
	this.driver=driver;
	util = new WaitUtility();
	
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement admin;
@FindBy(xpath = "//img[@class='img-circle']") WebElement avatar;
@FindBy(xpath="//a[@href=\"https://groceryapp.uniqassosiates.com/admin/logout\"]")WebElement logout;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'and@class='small-box-footer']")WebElement moreInfo;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement newsmoreinfo;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']")WebElement categorymoreinfo;


public HomePage clickAdmin()
{
	util.waitUntilElementIsClickable(driver, admin);
	admin.click();
	return this;  // goes to no page
	
}
public HomePage clickLogout()
{
	util.waitUntilElementIsClickable(driver, logout);
	logout.click();
	return this ;	// when clicking logout goes to loginpage because of no execution. in this case return this.
	
}
public AdminUser clickMoreInfo()
{
	moreInfo.click();
	return new AdminUser(driver);
	
	
} 
public ManageNews enterMoreInfo()
{
	newsmoreinfo.click();
	return new ManageNews(driver);
}
public ManageCategory categoryMoreInfo()
{
	categorymoreinfo.click();
	return new ManageCategory(driver);
}


public boolean isAvatarDisplayed()
{
	return avatar.isDisplayed();
	
}
}
