package java_selenium;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;

public class Testng {
	WebDriver driver;
	
	@Test
	public void m1()
	{
		System.out.println("hello TestNG");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("before method");
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Jarvis\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.fynd.com/auth/login?redirectUrl=%2F");
		
		String url = d.getCurrentUrl();
		System.out.println("URL of the website: "+url);
		String title = d.getTitle();
		System.out.println("Title of the website: "+title);
	}
	
}
