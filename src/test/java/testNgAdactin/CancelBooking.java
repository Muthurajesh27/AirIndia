package testNgAdactin;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CancelBooking extends BaseClass{
	public CancelBooking() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="my_itinerary")
	private WebElement bookedId;
	@FindBy(id="order_id_text")
	private WebElement searchId;
	@FindBy(id="search_hotel_id")
	private WebElement hotelId;
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement btnCancel;
	public WebElement getBookedId() {
		return bookedId;
	}
	public WebElement getSearchId() {
		return searchId;
	}
	public WebElement getHotelId() {
		return hotelId;
	}
	public WebElement getBtnCancel() {
		return btnCancel;
	}
	public void adactincancel() throws InterruptedException, IOException {
		click(getBookedId());
		sendKeys(getSearchId(), getData("Orders", 1, 16));
		click(getHotelId());
		click(getBtnCancel());
		alertAccept();	
}
}