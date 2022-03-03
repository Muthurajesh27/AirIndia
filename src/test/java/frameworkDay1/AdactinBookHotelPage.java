package frameworkDay1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdactinBookHotelPage extends BaseClass {
	
	@FindBy(id="first_name")
	private WebElement firstName;
	@FindBy(id="last_name")
	private WebElement lastName;
	@FindBy(id="address")
	private WebElement Address;
	@FindBy(id="cc_num")
	private WebElement ccNum;
	@FindBy(id="cc_type")
	private WebElement ccType;
	@FindBy(id="cc_exp_month")
	private WebElement ccMonth;
	@FindBy(id="cc_exp_year")
	private WebElement ccYear;
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
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getCcMonth() {
		return ccMonth;
	}
	public WebElement getCcYear() {
		return ccYear;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}
	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}
	public void setAddress(WebElement address) {
		Address = address;
	}
	public void setCcNum(WebElement ccNum) {
		this.ccNum = ccNum;
	}
	public void setCcType(WebElement ccType) {
		this.ccType = ccType;
	}
	public void setCcMonth(WebElement ccMonth) {
		this.ccMonth = ccMonth;
	}
	public void setCcYear(WebElement ccYear) {
		this.ccYear = ccYear;
	}
	public void setBookNow(WebElement bookNow) {
		this.bookNow = bookNow;
	}
	
	public void book(String firstname, String lastname, String address, String ccnum, String cctype, String ccmonth, String ccyear )
	{
		selectOptionByText(getFirstName(), firstname);
		selectOptionByText(getLastName(), lastname);
		selectOptionByText(getAddress(), address);
		selectOptionByText(getCcNum(), ccnum);
		selectOptionByText(getCcType(), cctype);
		selectOptionByText(getCcMonth(), ccmonth);
		selectOptionByText(getCcYear(), ccyear);
		click(bookNow);		
	}
}