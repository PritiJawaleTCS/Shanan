package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class P4 {
public static void main(String[] args) throws Throwable {
	FileInputStream File = new FileInputStream("C:\\Users\\Microsoft\\Documents\\B1.xlsx");
	boolean data = WorkbookFactory.create(File).getSheet("Sheet1").getRow(0).getCell(3).getBooleanCellValue();
	System.out.println(data);
}
}
