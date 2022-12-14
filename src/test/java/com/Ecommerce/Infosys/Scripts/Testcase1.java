package com.Ecommerce.Infosys.Scripts;

import org.testng.annotations.Test;

import com.Ecommerce.Infosys.PomPages.AddtocartPage;
import com.Ecommerce.Infosys.PomPages.LoginPage;
import com.Ecommerce.Infosys.PomPages.SkillraryDemoLoginPage;
import com.Ecommerce.Infosys.genericLib.BaseClass;

public class Testcase1 extends BaseClass 
{
	/**
	 * Senario1
	 */
	@Test
	public void testcase1()
	{
		test = reports.createTest("testcase1"); //to generate report, in every test case it has to be written
		LoginPage l = new LoginPage(driver);
		SkillraryDemoLoginPage hp = l.demoApp(driver);
		utilies.switchTabs(driver);
		utilies.mouseHover(driver,hp.getCoursebtn());
		AddtocartPage cart = hp.course(driver);
		utilies.doubleclick(cart.getAddbtn(),driver);
		cart.getAddtocartbtn().click();
		utilies.alertPopupok(driver);
	}
}
