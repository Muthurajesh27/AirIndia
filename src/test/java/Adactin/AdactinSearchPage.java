package Adactin;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinSearchPage extends BaseClass{
	
	public AdactinSearchPage() {
		PageFactory.initElements(driver, this);
	}	
		
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
	
	public void searchHotel() throws IOException
	{
		selectOptionByText(getdDlocation(), getData("Orders", 1, 2));
		selectOptionByText(getdDhotels(), getData("Orders", 1, 3));
		selectOptionByText(getdDroomtype(), getData("Orders", 1, 4));
		selectOptionByText(getdDroomNo(), getData("Orders", 1, 5));
		sendKeys(getCheckInDate(), getData("Orders", 1, 17));
		sendKeys(getCheckOutDate(), getData("Orders", 1, 18));
		selectOptionByText(getAdultRoom(), getData("Orders", 1, 6));
		selectOptionByText(getChildRoom(), getData("Orders", 1, 7));
		click(submit);
	}
	
	
	
	
}
