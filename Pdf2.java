package selenium_practise_all;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Pdf2 {

		@Test
		void check_actions(){
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Jarvis\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo");
		
		WebElement name = driver.findElement(By.name("first_name"));
		
		
		name.sendKeys("TESTINGG");
		
		WebElement email_enquiry = driver.findElement(By.xpath("//*[@id=\"address\"]"));
//		Select s = new Select(email_enquiry);
		
//		email_enquiry.sendKeys("a@email.com");
		WebElement btn = driver.findElement(By.className("btn"));
//		btn.click();
		
		Actions a = new Actions(driver);
		a.click(btn);
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		for (WebElement x : links)
		{
			String link_name = x.getText();
			if(link_name == " " )
				continue;
			System.out.println(link_name);
		}
//		System.out.println(links);
		
		
		//driver.close();
	}

}
