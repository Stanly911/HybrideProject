package com.Ecommerce.Infosys.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorejavaPage 
{
	@FindBy(xpath="//a[contains(text(),' Core Java For')]")
	private WebElement corejava;
	
	public CorejavaPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getCorejava() {
		return corejava;
	}
	
	public WishListPage corejavaselenium(WebDriver driver)
	{
		corejava.click();
		return new WishListPage(driver);
	}
}
