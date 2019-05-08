package com.acttime.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Savitha This class contains file related methods which is used to
 *         read data from excel and property file
 */

public class FileLib {

	/**
	 * 
	 * @param Key
	 * @return
	 * @throws Throwable
	 */
	public String getPropertyKeyValue(String Key) throws Throwable {

		FileInputStream fis = new FileInputStream("./data/Commondata.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		String Value = pObj.getProperty(Key);
		return Value;
	}

	/**
	 * it is used to read data from excel-workbook
	 * 
	 * @param SheetName
	 * @param rowNum
	 * @param CelNum
	 * @return
	 * @throws Throwable
	 */

	public String getExcelData(String SheetName, int rowNum, int CelNum) throws Throwable {

		FileInputStream fis = new FileInputStream("./data/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(CelNum).getStringCellValue();
		wb.close();
		return data;

	}

	/**
	 * used to write data back to excel sheet based on user argument
	 * @param SheetName
	 * @param rowNum
	 * @param CelNum
	 * @param data
	 * @throws Throwable
	 */
public void setExcelData(String SheetName,int rowNum,int CelNum,String data) throws Throwable {
		
		FileInputStream fis=new FileInputStream("./data/testdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(SheetName);
		Row row=sh.getRow(rowNum);
		Cell cel=row.createCell(CelNum);
		cel.setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./data/testdata.xlsx");
		wb.write(fos);
		wb.close();
		
		
}		
		
	
}
