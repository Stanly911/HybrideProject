package com.Ecommerce.Infosys.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

import com.mysql.jdbc.Driver;
/**
 * 
 * @author SUBHADEEP MALLICK
 *
 */
public class FileUtilities 
{ 
	
	public static Connection con;
	
	/**
	 * It is used to read the data from data.property File
	 * @param key
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	
	public String getPropertyFile(String key) throws FileNotFoundException, IOException 
	{
		Properties p = new Properties();
		p.load(new FileInputStream(AutoConstant.datapropertyFile));
		return p.getProperty(key);
	}
	
	/**
	 * To read the data from excel Sheet
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelFile(String sheetname, int rownum, int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(AutoConstant.excelFilePath);
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet("SheetName").getRow(rownum).getCell(cellnum).getStringCellValue();
	}
	
	/**
	 * It is used to read the data from database
	 * @return
	 * @throws SQLException
	 */
	public static Connection getDataDb() throws SQLException 
	{
		Driver driverref = new Driver();
		DriverManager.registerDriver(driverref);
		 return con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wasm4","root","tiger");
	}
	
	/**
	 * 
	 * @param query
	 * @param column
	 * @param expdata
	 * @return
	 * @throws SQLException
	 */
	public String queryExecution(String query, int column, String expdata) throws SQLException
	{
		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery(query);
		while(result.next())
		{
			if(result.getString(column).equals(expdata))
			{
				break;
			}
			else
			{
				Reporter.log("data not matching");
			}
		}
		return expdata;
	}
}
