package Data_Drivern_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Excel_Fetching_For_Numeric {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\hp\\eclipse-workspace\\Selenium_Basics\\DDT_Numeric\\Numeric_value.xlsx");

		Workbook w1 = WorkbookFactory.create(f1);
		String number = NumberToTextConverter.toText(w1.getSheet("login2").getRow(0).getCell(0).getNumericCellValue());

		String password = NumberToTextConverter
				.toText(w1.getSheet("login2").getRow(0).getCell(1).getNumericCellValue());
		System.out.println(number);
		System.out.println(password);
	}

}
