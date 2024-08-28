package Data_Drivern_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Fetching_Data_01 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Selenium_Basics\\DDT\\rajan.xlsx");

		Workbook w1 = WorkbookFactory.create(f1);
		Sheet s1 = w1.getSheet("login");
		Row r1 = s1.getRow(0);
		Cell c1 = r1.getCell(0);
		String un=c1.getStringCellValue();
		System.out.println(un);
		
		
		System.out.println("------For password we have to repead the code----- ");
		
		Sheet s2 = w1.getSheet("login");
		Row r2 = s2.getRow(0);
		Cell c2 = r2.getCell(1);
		String pass=c2.getStringCellValue();
		System.out.println(pass);

	}

}
