package com.Ecommerce.Infosys.Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import org.testng.annotations.Test;

import com.Ecommerce.Infosys.PomPages.JunitPage;
import com.Ecommerce.Infosys.PomPages.LoginPage;
import com.Ecommerce.Infosys.PomPages.SkillraryDemoLoginPage;
import com.Ecommerce.Infosys.genericLib.BaseClass;

public class TestCase4 extends BaseClass
{
	@Test
	public void tc4() throws FileNotFoundException, IOException, SQLException 
	{
		test = reports.createTest("tc4");
		
		LoginPage lp = new LoginPage(driver);
		SkillraryDemoLoginPage hp = lp.demoApp(driver);
		utilies.switchTabs(driver);
		utilies.dropdown(hp.getCoursedd(), fu.getPropertyFile("dd"));
		JunitPage j = new JunitPage(driver);
		String query = "select * from course";
		String data = fu.queryExecution(query, 1, "19");
	}
}
