package com.Ecommerce.Infosys.genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo 
{
	/**
	 * It is used to take the screenshot of the failed test cases
	 * @param driver
	 * @param name
	 * @return
	 * @throws IOException
	 */
	public String screenshot(WebDriver driver,String name) throws IOException
	{
		Date d = new Date();
		String date = d.toString().replaceAll(":", "-");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File destin = new File(AutoConstant.photoPath+date+name+".png");
		FileUtils.copyFile(src, destin);
		return date;
	}
}
