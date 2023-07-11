package selenium_practise_all;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Test_demo_all{
	
	@Test
	void write_excel() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Jarvis\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://test-nf.com/english.html");
		
		String path = "D://eclipse-workspace//write.xlsx";
		FileInputStream f = new FileInputStream(path);  // FileInputStream to read file
		XSSFWorkbook wb = new XSSFWorkbook(f); //XSSFWorkbook object
		
		XSSFSheet s = wb.getSheetAt(0); //XSFF Sheet Object - Sheetname inside Excel file(Workbbok)
		Row row = s.createRow(0);
		Cell cell = row.createCell(0);
		driver.navigate().to("https://test-nf.com/football.html");
		String check_football = driver.getCurrentUrl();
		cell.setCellValue(check_football);
		
		driver.navigate().to("https://test-nf.com/busketball.html");
		String check_basketball = driver.getCurrentUrl();
		cell = row.createCell(1);
		cell.setCellValue(check_basketball);
		
		driver.navigate().to("https://test-nf.com/kriket.html");
		String check_cricket = driver.getCurrentUrl();
		cell = row.createCell(2);
		cell.setCellValue(check_cricket);
		
		driver.navigate().to("https://test-nf.com/cibersport.html");
		String check_cybersports = driver.getCurrentUrl();
		cell = row.createCell(3);
		cell.setCellValue(check_cybersports);
		
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		fos.close();
	}
	

}
