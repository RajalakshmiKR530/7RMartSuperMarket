package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminUser {
	
	public WebDriver driver;
	
	
	
public AdminUser(WebDriver driver)
{
	this.driver = driver;
	
	PageFactory.initElements(driver,this);
	 
}

     @FindBy(xpath="//a[text()='Home']")WebElement home;
     @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'and@class='small-box-footer']")WebElement moreInfo;
     @FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newUser;
     @FindBy(xpath="//input[@id='username']")WebElement username;
     @FindBy(xpath="//input[@id='password']")WebElement password;
     @FindBy(xpath="//select[@id='user_type']")WebElement userType;
     @FindBy(xpath="//button[@name='Create']")WebElement save;
     @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alerts;
     @FindBy(xpath="//button[@class='close']")WebElement closeButton;
     
     @FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement search;
     
     
     @FindBy(xpath="//a[@class='btn btn-rounded btn-warning']")WebElement aboveReset;
     @FindBy(xpath="//a[@class='btn btn-default btn-fix']")WebElement belowReset;




     public void clickMoreInfo()
     {
    	 moreInfo.click();
     }
     public void clickNew()
     {
    	 newUser.click();
     }
     public void enterUsernamePassword(String userids,String pass)
     {
    	 username.sendKeys(userids);
    	 password.sendKeys(pass); 
     }
     public void selectUserTypes()
     {
    	 userType.click();
    	 Select select = new Select(userType);
    	 select.selectByVisibleText("Staff");
     }
     public void saveData()
     {
    	 save.click();
     }
     
   
	 
	}



	

	

	
	


