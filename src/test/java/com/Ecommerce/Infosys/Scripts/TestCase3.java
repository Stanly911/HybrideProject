package com.Ecommerce.Infosys.Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Ecommerce.Infosys.PomPages.CorejavaPage;
import com.Ecommerce.Infosys.PomPages.LoginPage;
import com.Ecommerce.Infosys.PomPages.WishListPage;
import com.Ecommerce.Infosys.genericLib.BaseClass;

public class TestCase3 extends BaseClass 
{
	@Test
	public void tc3() throws FileNotFoundException, IOException, InterruptedException
	{
		test = reports.createTest("tc3");
		
		LoginPage lp = new LoginPage(driver);
		CorejavaPage c = lp.searchcourse(driver, fu.getPropertyFile("cn"));
		WishListPage ad = c.corejavaselenium(driver);
		utilies.switchframe(driver);
		ad.playvideo();
		
		utilies.switchBackfromFrame(driver);
		ad.addtowishlist();
		
		Assert.assertEquals(driver.getTitle(), fu.getPropertyFile("title"));
	}
}
