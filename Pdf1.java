package selenium_practise_all;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Pdf1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jarvis\\Downloads\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
//		driver.manage().window().maximize();
		
//		WebElement class is used to store all the elements on the htmls.		
		WebElement email =  driver.findElement(By.name("reg_email__"));
		WebElement password =  driver.findElement(By.id("password_step_input"));
		WebElement button =  driver.findElement(By.linkText("Sign Up"));
//		driver.findElement(By.linkText(linkText));
		WebElement name =  driver.findElement(By.name("firstname"));
//		driver.findElement(By.partialLinkText(partialLinkText));
		WebElement date_day = driver.findElement(By.tagName("select"));
		WebElement month = driver.findElement(By.name("birthday_month"));
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		
//		Select class is used to select or deselect an element present in the html page
		Select select_day = new Select(date_day);
		Thread.sleep(3000);
		select_day.selectByIndex(4);
		
		Thread.sleep(3000);
		Select select_month = new Select(month);
		select_month.selectByVisibleText("Jul");
		
		Thread.sleep(3000);
		Select select_year = new Select(year);
		select_year.selectByValue("2001");
		
		name.sendKeys("JACK");
		Thread.sleep(3000);
		password.sendKeys("1234ABCD##");
		Thread.sleep(3000);
		email.sendKeys("jack@bing.com");
		Thread.sleep(3000);
		button.click();
		Thread.sleep(3000);
		
		List<WebElement>  all_elements = driver.findElements(By.tagName("input"));
		for (WebElement i : all_elements)
		{
			System.out.println(i);
		}
		
//		System.out.println(button.getText());
////		System.out.println(button.isEnabled());
//		System.out.println(button.isDisplayed());
		
		driver.close();
		

	}

}
