package utilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility
{
	public WebDriver driver;
	
	public PageUtility(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void selectByVisibleText(WebElement element,String text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void selectByValue(WebElement valueelement, String value)
	{
		Select select = new Select(valueelement);
		select.selectByValue(value);
	}
	
	public void selectByIndex(WebElement indexelement, int index)
	{
		Select select = new Select(indexelement);
		select.selectByIndex(index);
				
	}
	public void moveElement(WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	public void doubleClick(WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}
	public void dragAndDrop(WebElement sourceelement, WebElement targetelement)
	{
		Actions actions = new Actions(driver);
		actions.dragAndDrop(sourceelement, targetelement).perform();
	}
	public void rightClick(WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}
	public void clickAndHoldRelease(WebElement targetelement)
	{
		Actions actions = new Actions(driver);
		actions.clickAndHold(targetelement).release().perform();	
	}
	public void scrollToElement()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	
			
	}
	public void clickElementJs(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",element);
		
	}
	
}
	



