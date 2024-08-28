package Data_Drivern_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Login_by_DDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Selenium_Basics\\DDT\\rajan.xlsx");

		Workbook w1 = WorkbookFactory.create(f1);
		String un = w1.getSheet("login").getRow(0).getCell(0).getStringCellValue();
		String pass = w1.getSheet("login").getRow(0).getCell(1).getStringCellValue();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("(//div[.=\"Login\"])[2]"));
		login.click();
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input[@class=\"r4vIwl BV+Dqf\"]"));
		username.sendKeys(un);
		Thread.sleep(2000);
		WebElement otp = driver.findElement(By.xpath("//button[.=\"Request OTP\"]"));
		otp.click();

		WebElement otp_val = driver.findElement(By.xpath("//input[@class=\"r4vIwl IX3CMV\"]"));
		otp_val.sendKeys("222222");

	}

}
