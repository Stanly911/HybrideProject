package com.Ecommerce.Infosys.Scripts;

import org.testng.annotations.Test;

import com.Ecommerce.Infosys.PomPages.AddtocartPage;
import com.Ecommerce.Infosys.PomPages.LoginPage;
import com.Ecommerce.Infosys.PomPages.SkillraryDemoLoginPage;
import com.Ecommerce.Infosys.genericLib.BaseClass;

public class Testcase1 extends BaseClass 
{
	@Test
	public void testcase1()
	{
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
