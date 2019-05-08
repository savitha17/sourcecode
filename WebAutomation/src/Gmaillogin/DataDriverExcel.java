package Gmaillogin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriverExcel {

	public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\Savitha\\Desktop\\testdata.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("sheet1");
	Row row=sh.getRow(1);
	Cell cel=row.getCell(1);
	String data=cel.getStringCellValue();
	System.out.println(data);
	wb.close();
	

	}

}
