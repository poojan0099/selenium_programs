package page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class PageObjects {
	
	//Using By class
	
	By search_button = By.xpath("//*[@id=\"search_mini_form\"]/div[1]/button");
	By search_input = By.name("q");
	
}
