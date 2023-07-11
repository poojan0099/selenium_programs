package java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Jarvis\\\\Downloads\\\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://register.rediff.com/register/register.php?FormName=user_details");
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("XOXO");
		d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("XOXO_mail");
		d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
		d.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys("xoxo_password123###");
		d.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys("xoxo_password123###");
		d.findElement(By.xpath("//input[@type='checkbox']")).click();
		d.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[2]/td[3]/select")).click();
		
//		d.close();
	}

}
