package selenium_practise_all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_project {
	
	@Test
	void test_project() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Jarvis\\\\Downloads\\\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://test-nf.com/english.html");
	
	WebElement home = driver.findElement(By.xpath("/html/body/header/div/ul/li[1]/a"));
	WebElement cyber = driver.findElement(By.cssSelector("a[href*='cibersport']"));
	
	System.out.println(home.getText());
	System.out.println(cyber.getText());
	
	try {
	FindBy_ProjectElements p = PageFactory.initElements(driver, FindBy_ProjectElements.class);
	WebElement hm = p.home1;
	System.out.println(hm.getText());
	System.out.println(p.cyberSports1.getText());
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}

}
