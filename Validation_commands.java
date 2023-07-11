package java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_commands {
	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Jarvis\\\\Downloads\\\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.fynd.com/auth/login?redirectUrl=%2F");
		
		String url = d.getCurrentUrl();
		System.out.println("URL of the website: "+url);
		String title = d.getTitle();
		System.out.println("Title of the website: "+title);
		
//		
//		String source_code = d.getPageSource();
//		System.out.println("Source Code of the website: "+source_code);
		
		boolean register = d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/div[2]/ul/li[1]/div")).isDisplayed();
		if(register == true)
		{
			System.out.println("Register button is displayed");
		}
		else {
			System.out.println("Register button is not displayed");
		}
		
		boolean login = d.findElement(By.xpath("//li[@class='tab-button login-button selected']")).isEnabled();
		if(login == true)
		{
			System.out.println("Login button is clickable");
		}
		else {
			System.out.println("Login button is not clickable");
		}
		
		
		
		Dimension size = d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/div[1]/img[1]")).getSize();
		System.out.println(size);
		
		String text = d.findElement(By.xpath("//button[@class='login-button send-otp-btn secondary-btn']")).getText();
		System.out.println(text);
		
		
		d.close();
	}
}
