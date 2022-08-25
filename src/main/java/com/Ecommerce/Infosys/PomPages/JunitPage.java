package com.Ecommerce.Infosys.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JunitPage 
{
	@FindBy(xpath="(//a[text()='Selenium Training']")
	private WebElement junit;
	
	public JunitPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getJunit() {
		return junit;
	}
	
}
