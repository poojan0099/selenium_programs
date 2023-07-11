package selenium_practise_all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// Pabje Object Moel - using second type (Using FindBy annotation) Page Factory Model.

public class FindBy_ProjectElements {
	
	@FindBy (xpath="/html/body/header/div/ul/li[2]/a") WebElement football1;
	@FindBy (xpath="/html/body/header/div/ul/li[1]/a") WebElement home1;
	@FindBy (xpath="//*[text()='Busketball']") WebElement basketball1;
	@FindBy (xpath="//*[text()='Kriket']") WebElement cricket1;
	@FindBy (css="a[href*='cibersport']") WebElement cyberSports1;
	
}
