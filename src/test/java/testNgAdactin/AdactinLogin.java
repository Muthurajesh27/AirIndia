package testNgAdactin;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLogin extends BaseClass{
	public AdactinLogin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtUser;
	@FindBy(id="password")
	private WebElement txtPass;
	@FindBy(id="login")
	private WebElement btnLogin;
	public WebElement getTxtUser() {
		return txtUser;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void Login() throws IOException {
		sendKeys(getTxtUser(), getData("Orders", 1, 0));
		sendKeys(getTxtPass(), getData("Orders", 1, 1));
		click(getBtnLogin());
	}
}
