package Data_Drivern_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login_by_DDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream f1 = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Selenium_Basics\\DDT\\rajan.xlsx");

		Workbook w1 = WorkbookFactory.create(f1);
		String un = w1.getSheet("login").getRow(0).getCell(0).getStringCellValue();
		String pass = w1.getSheet("login").getRow(0).getCell(1).getStringCellValue();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys(un);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(pass);

	}

}
