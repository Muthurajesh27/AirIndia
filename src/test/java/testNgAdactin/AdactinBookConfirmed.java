package testNgAdactin;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinBookConfirmed extends BaseClass{
	
	public AdactinBookConfirmed() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement orderId;
	
	public WebElement getOrderId() {
		return orderId;
	}
	
	public void bookconfirm() throws InterruptedException, IOException {

	String attribute = getAttribute(getOrderId(), "value");
	System.out.println(attribute);
	WriteData("Orders", 1, 16, attribute);
	
}
}
