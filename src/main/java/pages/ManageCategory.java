package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageCategory {
	
	public WebDriver driver;

	PageUtility utility;
    WaitUtility util;
    FileUploadUtility fileutility;


	public ManageCategory(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
		utility = new PageUtility(driver);
        util = new WaitUtility();
        fileutility = new FileUploadUtility(); // initialize inside in constructor
	}


	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newcategory;
	@FindBy(xpath="//input[@class='form-control']")WebElement entercaegory;
	@FindBy(xpath="//span[text()='discount']")WebElement discount;
	@FindBy(xpath="//input[@id='main_img']")WebElement choosefile;
	@FindBy(xpath="//label[text()='Show On Top Menu']")WebElement showtopmenu ;
	@FindBy(xpath="//label[@class='radio-inline']")WebElement radiobutton ;
	@FindBy(xpath="//label[text()='Show On Left Menu']")WebElement showleftmenu ;
	@FindBy(xpath="//button[@class='btn btn-danger']")WebElement savecategory;
	
	
	public ManageCategory newcategory()
	{
		newcategory.click();
		return this;
	}
	public ManageCategory enterCategory(String word)
	{
		entercaegory.sendKeys(word);
		return this;
	}
	public ManageCategory discountMethod()
	{
		discount.click();
		return this;
	}
	public ManageCategory fileUpload(String path)
	{
		
		fileutility.fileUploadSendkeys(choosefile, path);
		return this;
	}
	public ManageCategory showMenu()
	{
		util.waitUntilElementIsClickable(driver,showtopmenu);
		utility.moveElement(showtopmenu);
		showtopmenu.click();
		util.waitUntilElementIsClickable(driver,showleftmenu);
		utility.moveElement(showleftmenu);
		showleftmenu.click();
		return this;
	}
	public ManageCategory saveCategory()
	{
		util.waitUntilElementIsClickable(driver, savecategory);
		utility.moveElement(savecategory);
		
		savecategory.click();
		return this;
	}
	
	



}
