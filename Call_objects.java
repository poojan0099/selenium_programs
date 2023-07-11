package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Call_objects {

	@Test
	void test_naukri() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo-store.seleniumacademy.com/");
		
		try {
		PageObjects p = new PageObjects();
		driver.findElement(p.search_input).sendKeys("shirt");
		driver.findElement(p.search_button).click();
		driver.wait(4000);}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
//		driver.quit();
		
	}
}
