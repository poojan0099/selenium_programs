package page_object_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Find_By {

	@FindBy(id="searchboxinput") WebElement searchbox;
	@FindBy(xpath="//*[@id=\"searchbox-searchbutton\"]") WebElement searchbutton;
}
