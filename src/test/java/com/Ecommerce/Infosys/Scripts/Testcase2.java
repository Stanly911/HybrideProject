package com.Ecommerce.Infosys.Scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Ecommerce.Infosys.PomPages.ContactUsPage;
import com.Ecommerce.Infosys.PomPages.LoginPage;
import com.Ecommerce.Infosys.genericLib.ExcelRW;

public class Testcase2 extends ExcelRW
{
	@Test(dataProvider = "readExcelData")
	public void tc2(String name,String mail, String sub, String msg) throws InterruptedException
	{
		test = reports.createTest("tc2");
		LoginPage lp = new LoginPage(driver);
		driver.findElement(By.xpath("(//button[@type=\"button\"])[25]")).click();
		Thread.sleep(5000);
//		Point loc = lp.getContactus().getLocation();
//		int x= loc.getX();
//		int y = loc.getY();
//		utilies.scrollBar(driver, x, y);
		lp.contact(driver);
		ContactUsPage cp = new ContactUsPage(driver);
		Thread.sleep(5000);
		cp.sendDetails(name, mail, sub, msg);
	}
}
