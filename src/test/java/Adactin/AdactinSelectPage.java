package Adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinSelectPage extends BaseClass {

	public AdactinSelectPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radio;
	
	@FindBy(id = "continue")
	private WebElement Continue;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public void select() {
		click(getRadio());
		click(getContinue());
	}

}
