package com.Ecommerce.Infosys.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author SUBHADEEP MALLICK
 *
 */
public class LoginPage 
{
	/**
	 * It is used to store all the login elements
	 */
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	@FindBy(xpath="//a[text()=' Contact Us ']")
	private WebElement contactus;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement gobtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//used when there is an continuous flow of action happening inside the same WebPage
	//and after the action , will be taken to a new WebPage
	//Known as Business Model
	public SkillraryDemoLoginPage demoApp(WebDriver driver)  
	{
		gearsbtn.click();
		skillrarydemoapp.click();
		return new SkillraryDemoLoginPage(driver);
	}

	public ContactUsPage contact(WebDriver driver)
	{
		contactus.click();
		return new ContactUsPage(driver);
	}
	
	public CorejavaPage searchcourse(WebDriver driver,String courseName)
	{
		searchtb.sendKeys(courseName);
		gobtn.click();
		return new CorejavaPage(driver);
	}
	
	public WebElement getGearsbtn() {
		return gearsbtn;
	}

	public WebElement getSkillrarydemoapp() {
		return skillrarydemoapp;
	}

	public WebElement getContactus() {
		return contactus;
	}

	public WebElement getGobtn() {
		return gobtn;
	}

	public WebElement getSearchtb() {
		return searchtb;
	}
}
