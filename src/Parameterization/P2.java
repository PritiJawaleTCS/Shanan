package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class P2 {
public static void main(String[] args) throws Throwable {
	
	FileInputStream File = new FileInputStream("C:\\Users\\Microsoft\\Documents\\B1.xlsx");
	String data = WorkbookFactory.create(File).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	System.out.println(data);
}
}
