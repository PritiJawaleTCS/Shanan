package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class P3 {
public static void main(String[] args) throws Throwable {
	
	FileInputStream File = new FileInputStream("C:\\Users\\Microsoft\\Documents\\B1.xlsx");
	 double data = WorkbookFactory.create(File).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
	 System.out.println(data);
}
}
