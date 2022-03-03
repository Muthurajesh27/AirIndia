package frameworkDay1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdactinLogin extends BaseClass{

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
	public void login(String username, String password) {
		
		sendKeys(getTxtUser(), username);
		sendKeys(getTxtPass(), password);
		click(btnLogin);
		}
}
