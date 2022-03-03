package frameworkDay1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdactinSearchPage extends BaseClass{
	
	@FindBy(id="location")
	private WebElement dDlocation;
	@FindBy(id="hotels")
	private WebElement dDHotels;
	@FindBy(id="room_type")
	private WebElement dDroomtype;
	@FindBy(id="room_nos")
	private WebElement dDroomNo;
	@FindBy(id="datepick_in")
	private WebElement checkInDate;
	@FindBy(id="datepick_out")
	private WebElement checkOutDate;
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	@FindBy(id="child_room")
	private WebElement childRoom;
	@FindBy(id="Submit")
	private WebElement submit;
	
	public WebElement getdDlocation() {
		return dDlocation;
	}
	public WebElement getdDhotels() {
		return dDHotels;
	}
	public WebElement getdDroomtype() {
		return dDroomtype;
	}
	public WebElement getdDroomNo() {
		return dDroomNo;
	}
	public WebElement getCheckInDate() {
		return checkInDate;
	}
	public WebElement getCheckOutDate() {
		return checkOutDate;
	}
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	public WebElement getChildRoom() {
		return childRoom;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public void setdDlocation(WebElement dDlocation) {
		this.dDlocation = dDlocation;
	}
	public void setdDhotels(WebElement dDhotels) {
		this.dDHotels = dDhotels;
	}
	public void setdDroomtype(WebElement dDroomtype) {
		this.dDroomtype = dDroomtype;
	}
	public void setdDroomNo(WebElement dDroomNo) {
		this.dDroomNo = dDroomNo;
	}
	public void setCheckInDate(WebElement checkInDate) {
		this.checkInDate = checkInDate;
	}
	public void setCheckOutDate(WebElement checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public void setAdultRoom(WebElement adultRoom) {
		this.adultRoom = adultRoom;
	}
	public void setChildRoom(WebElement childRoom) {
		this.childRoom = childRoom;
	}
	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}
	
	public void searchHotel(String location, String hotels, String roomType, String roomNo, String checkIn, String checkOut, String adultRoom, String childRoom)
	{
		selectOptionByText(getdDlocation(), location);
		selectOptionByText(getdDhotels(), hotels);
		selectOptionByText(getdDroomtype(), roomType);
		selectOptionByText(getdDroomNo(), roomNo);
		sendKeys(getCheckInDate(), checkIn);
		sendKeys(getCheckOutDate(), checkOut);
		selectOptionByText(getAdultRoom(), adultRoom);
		selectOptionByText(getChildRoom(), childRoom);
		click(submit);
	}
	
	
	
	
}
