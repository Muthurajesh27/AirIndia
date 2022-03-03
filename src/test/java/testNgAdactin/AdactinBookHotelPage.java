package testNgAdactin;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinBookHotelPage extends BaseClass {
	
	public AdactinBookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement firstName;
	@FindBy(id="last_name")
	private WebElement lastName;
	@FindBy(id="address")
	private WebElement Address;
	@FindBy(id="cc_num")
	private WebElement ccNum;
	@FindBy(id="cc_type")
	private WebElement dDccType;
	@FindBy(id="cc_exp_month")
	private WebElement ccMonth;
	@FindBy(id="cc_exp_year")
	private WebElement ccYear;
	@FindBy(id="cc_cvv")
	private WebElement cVV;
	@FindBy(id="book_now")
	private WebElement bookNow;
	
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getCcNum() {
		return ccNum;
	}
	
	public WebElement getdDccType() {
		return dDccType;
	}
	public WebElement getCcMonth() {
		return ccMonth;
	}
	public WebElement getCcYear() {
		return ccYear;
	}
	public WebElement getcVV() {
	return cVV;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
	
	
	
	
	public void book() throws IOException, InterruptedException
	{
		sendKeys(getFirstName(),getData("Orders", 1, 8) );
		sendKeys(getFirstName(), getData("Orders", 1, 8));
		sendKeys(getLastName(), getData("Orders", 1, 9));
		sendKeys(getAddress(), getData("Orders", 1, 10));
		sendKeys(getCcNum(), getData("Orders", 1, 11));
		selectOptionByText(getdDccType(), getData("Orders", 1, 12));
		selectOptionByText(getCcMonth(), getData("Orders", 1, 13));
		selectOptionById(getCcYear(), 12);
		sendKeys(getcVV(),getData("Orders", 1, 15));
		click(bookNow);	
		
		}
}