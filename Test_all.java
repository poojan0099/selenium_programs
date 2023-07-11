package java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_all {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Hello Eclipse");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jarvis\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement name = driver.findElement(By.id("user-name"));
		name.sendKeys("standard_user");
		
		WebElement pswd = driver.findElement(By.id("password"));
		pswd.sendKeys("secret_sauce");
		
		WebElement submit_button = driver.findElement(By.id("login-button"));
		submit_button.click();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
	}

}
