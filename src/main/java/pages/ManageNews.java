package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageNews {
	
public WebDriver driver;

PageUtility utility ;
WaitUtility util ;

public ManageNews(WebDriver driver)
{
	this.driver =driver;
	PageFactory.initElements(driver, this);
	utility = new PageUtility(driver);
	util = new WaitUtility();
}

@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newclick;
@FindBy(xpath="//textarea[@id='news']")WebElement enternews;
@FindBy(xpath="//button[@class='btn btn-danger']")WebElement savenews;
@FindBy(xpath="//li[@class='breadcrumb-item active']")WebElement assertmanage;


public ManageNews enterNewClick()
{
	newclick.click();
	return this;
}
public ManageNews enterNews(String characters)
{
	enternews.sendKeys(characters);
	return this;
}
public ManageNews enterSaveNews()
{
	savenews.click();
	return this;
}
public boolean assertMethod()
{
	return assertmanage.isDisplayed();
	
}







}
