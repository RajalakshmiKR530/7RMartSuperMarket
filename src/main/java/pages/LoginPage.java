package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage
{
	public WebDriver driver;
	
public LoginPage(WebDriver driver)
{
	this.driver = driver;
	
	PageFactory.initElements(driver,this);
	
}
           @FindBy(xpath="//input[@placeholder='Username']")WebElement userName;
           @FindBy(xpath="//input[@placeholder='Password']")WebElement passWord;
           @FindBy(xpath="//button[text()='Sign In']")WebElement signIn;
           
public void enterUserNameAndPassword(String username,String password)
{
	userName.sendKeys(username);
	passWord.sendKeys(password);
}
public void clickSignIn()
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(signIn));
	signIn.click();
	
}
}