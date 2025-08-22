package pages;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.PageUtility;
import utilities.WaitUtility;
public class AdminUser
{ 
	public WebDriver driver;
	
	PageUtility utility;
    WaitUtility util;
   


public AdminUser(WebDriver driver) 
{
	this.driver = driver;
	PageFactory.initElements(driver,this); 
	utility = new PageUtility(driver);
	util = new WaitUtility();
	}
@FindBy(xpath="//a[text()='Home']")WebElement home;

@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newUser; @FindBy(xpath="//input[@id='username']")WebElement username;
@FindBy(xpath="//input[@id='password']")WebElement password; 
@FindBy(xpath="//select[@id='user_type']")WebElement userType;
@FindBy(xpath="//button[@name='Create']")WebElement save; 
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alerts;
@FindBy(xpath="//button[@class='close']")WebElement closeButton; 
@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement search; 
@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']")WebElement aboveReset; 
@FindBy(xpath="//a[@class='btn btn-default btn-fix']")WebElement belowReset;
@FindBy(xpath="//h1[@class='m-0 text-dark']")WebElement assertelement;

public AdminUser clickNew() 
{
	newUser.click();
	return this;
}
public AdminUser enterUsernameMethod(String userids)
{ 
	username.sendKeys(userids);
	return this; 
}
public AdminUser enterPasswordMethod(String pass)
{
	password.sendKeys(pass);
	return this; 
}
public AdminUser selectUserTypes()
{ 
	userType.click();
	utility.selectByVisibleText(userType,"Staff");
	return this;
} 
public AdminUser saveData()
{ 
	save.click();
	return this;
}
public boolean assertioncheck()
{
	return assertelement.isDisplayed();
}
}


