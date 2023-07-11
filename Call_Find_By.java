package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Call_Find_By {

	@Test
	void call_find_by()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/maps/@19.2972558,73.0523224,15z");
		
		try {
		Find_By f = new Find_By();
		f.searchbox.sendKeys("Venice");
		f.searchbutton.click();
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
