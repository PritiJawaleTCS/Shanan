package Parameterization;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class P1 {
		public static void main(String[] args) throws Throwable {
		FileInputStream file = new FileInputStream("C:\\Users\\Microsoft\\Documents\\B1.xlsx");
		 RichTextString data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getRichStringCellValue();

System.out.println(data);
		
		
	}
	}


