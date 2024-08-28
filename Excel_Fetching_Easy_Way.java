package Data_Drivern_Testing;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Fetching_Easy_Way {

	public static void main(String[] args) throws IOException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Selenium_Basics\\DDT\\rajan.xlsx");

		Workbook w1 = WorkbookFactory.create(f1);
		String un=w1.getSheet("login").getRow(0).getCell(0).getStringCellValue();
		String pass=w1.getSheet("login").getRow(0).getCell(1).getStringCellValue();
		System.out.println(un);
		System.out.println(pass);

	}

}
