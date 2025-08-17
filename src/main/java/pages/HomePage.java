package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
public WebDriver driver;

public HomePage(WebDriver driver)
{
	this.driver=driver;
	
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement admin;
@FindBy(xpath="//a[@href=\"https://groceryapp.uniqassosiates.com/admin/logout\"]")WebElement logout;



public void clickLogout()
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(admin));
	admin.click();
	wait.until(ExpectedConditions.elementToBeClickable(logout));
	logout.click();
	
	
	
}
}
