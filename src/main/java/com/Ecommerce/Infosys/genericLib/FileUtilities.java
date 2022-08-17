package com.Ecommerce.Infosys.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author SUBHADEEP MALLICK
 *
 */
public class FileUtilities 
{ 
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
}
