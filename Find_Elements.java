package java_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Jarvis\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.chess.com/login");
		d.manage().window().maximize();
		
		List<WebElement> link_count = d.findElements(By.tagName("a"));
		
		for(WebElement s : link_count)
		{
			System.out.println(s.getTagName());
		}
	}

}
