package selenium_practise_all;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Project {
	
	static WebDriver driver;
	
	@BeforeTest
	static void set_path() throws Exception
	{
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jarvis\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	}
	
	@Test(priority=1)
	static void set_file() throws Exception
	{
		String path = "D://eclipse-workspace//testnf.xlsx";
		FileInputStream f = new FileInputStream(path);  // FileInputStream to read file
		XSSFWorkbook wb = new XSSFWorkbook(f); //XSSFWorkbook object
		
		XSSFSheet s = wb.getSheet("Sheet1"); //XSFF Sheet Object - Sheetname inside Excel file(Workbbok)
		XSSFCell r = s.getRow(0).getCell(0); //XSSFCell get value of cell by specifying getRow() and getcell()
		String link = r.getStringCellValue(); // convert XSFFCell to string using - getStrinngValue()
		driver.get(link);  //access the link - 	https://test-nf.com/english.html
	}
	
	@Test
	static void check_elements()
	{
		
		// Using Page Object Model and calling all elements from FindBy_ProjectElements. @FindBy method is used 
		FindBy_ProjectElements p = PageFactory.initElements(driver, FindBy_ProjectElements.class);
		
		System.out.println(p.home1.getTagName());
		
		//Check is All Tab Buttons are Enabled or not
		boolean football = p.football1.isEnabled();
		boolean home = p.home1.isEnabled();
		boolean basketball = p.basketball1.isEnabled();
		boolean cricket = p.cricket1.isEnabled();
		boolean CyberSports = p.cyberSports1.isEnabled();

		System.out.println("Home tab is available :"+home);
		System.out.println("Football tab is available :"+football);
		System.out.println("Basketball tab is available :"+basketball);
		System.out.println("Cricket tab is available :"+cricket);
		System.out.println("Cyber Sports tab is available :"+CyberSports);
	}
	
	@Test
	static void check_assertion()
	{
		SoftAssert softassert = new SoftAssert();			// Soft Assertion is Used
		driver.navigate().to("https://test-nf.com/english.html");
		String home_url = driver.getCurrentUrl();
		String home_tab = "https://test-nf.com/home.html";
		softassert.assertEquals(home_url, home_tab);	//check the url with expected url using assertEquals method
		
		
		driver.navigate().to("https://test-nf.com/football.html");
		String football_tab = "https://test-nf.com/football.html";
		String check_football = driver.getCurrentUrl();
		Assert.assertEquals(check_football, football_tab,"Football URL does not contains the tab name");
		
		driver.navigate().to("https://test-nf.com/busketball.html");
		String expected_basketball_url = "https://test-nf.com/busketball.html";
		String check_basketball = driver.getCurrentUrl();
		Assert.assertEquals(check_basketball, expected_basketball_url,"Basketball URL does not contains the tab name");
		
		driver.navigate().to("https://test-nf.com/kriket.html");
		String expected_cricket_url = "https://test-nf.com/kriket.html";
		String check_cricket = driver.getCurrentUrl();
		Assert.assertEquals(check_cricket, expected_cricket_url,"Cricket URL does not contains the tab name");
		
		driver.navigate().to("https://test-nf.com/cibersport.html");
		String expected_cybersports = "https://test-nf.com/cibersport.html";
		String check_cybersports = driver.getCurrentUrl();
		Assert.assertEquals(check_cybersports, expected_cybersports, "Cyber sports  URL does not contains the tab name");
		System.out.println("Complete");
		softassert.assertAll(); 		// throw an error if in any assertion condition is not met
	}
	
	@AfterClass
	void quit()
	{
		driver.quit();
	}
	
	
//	public static void main(String[] args) throws Exception
//	{
//		set_path();
//		set_file();
//		check_elements();
//		check_assertion();
//		
//		driver.quit();
//		
//	}
}
