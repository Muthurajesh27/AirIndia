package frameworkDay1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdactinSelectPage extends BaseClass{
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	@FindBy(id="coninue")
	private WebElement Continue;
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getContinue() {
		return Continue;
	}
	public void setRadio(WebElement radio) {
		this.radio = radio;
	}
	public void setContinue(WebElement continue1) {
		Continue = continue1;
	}
	
	public void select() {
		click(radio);
		click(Continue);
	}
	

}
