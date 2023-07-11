package java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jarvis\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://1.1.1.1/");
		driver.manage().window().maximize();
		
		Actions builder = new Actions(driver);
		WebElement windows_button = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/a[2]"));
		builder.moveToElement(windows_button).build().perform();
		builder.sendKeys(Keys.CONTROL+"t").build().perform();
		
		
		

	}

}
