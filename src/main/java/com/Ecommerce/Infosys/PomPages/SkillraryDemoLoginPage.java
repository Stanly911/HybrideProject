package com.Ecommerce.Infosys.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage 
{
	@FindBy(id="course")
	private WebElement coursebtn;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	@FindBy(name = "addresstype")
	private WebElement coursedd;
	
	public SkillraryDemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getCoursebtn() {
		return coursebtn;
	}

	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}
	
	public AddtocartPage course(WebDriver driver) 
	{
		seleniumtraining.click();
		return new AddtocartPage(driver);
	}

	public WebElement getCoursedd() {
		return coursedd;
	}
}
