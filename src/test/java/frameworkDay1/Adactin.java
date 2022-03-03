package frameworkDay1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Adactin extends BaseClass{
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		getdriver();
		loadUrl("http://adactinhotelapp.com/");
		maximize();
		WebElement findElementById = base.findElementById("username");
		String txtUsername = base.getData("Orders", 1, 0, "D:\\MavenDay1\\excel\\Hotel.xlsx");
		base.sendKeys(findElementById,txtUsername);
		WebElement findElementById2 = base.findElementById("password");
		String txtPassword = base.getData("Orders", 1, 1, "D:\\MavenDay1\\excel\\Hotel.xlsx");
		base.sendKeys(findElementById2, txtPassword);
		WebElement btnLogin = base.findElementById("login");
		base.click(btnLogin);
		
		WebElement location = base.findElementById("location");
		String loc = base.getData("Orders", 1, 2, "D:\\MavenDay1\\excel\\Hotel.xlsx");
		base.sendKeys(location, loc);
		WebElement hotels = base.findElementById("hotels");
		String hotel = base.getData("Orders", 1, 3, "D:\\MavenDay1\\excel\\Hotel.xlsx");
		base.sendKeys(hotels, hotel);
		WebElement roomType = base.findElementById("room_type");
		String room = base.getData("Orders",1, 4,"D:\\MavenDay1\\excel\\Hotel.xlsx" );
		base.sendKeys(roomType, room);
		WebElement roomNo = base.findElementById("room_nos");
		String roomno = base.getData("Orders",1, 5,"D:\\MavenDay1\\excel\\Hotel.xlsx");
		base.sendKeys(roomNo, roomno);
		WebElement adultRoom = base.findElementById("adult_room");
		String adultroom = base.getData("Orders",1,6,"D:\\MavenDay1\\excel\\Hotel.xlsx");
		base.sendKeys(adultRoom, adultroom);
		WebElement childRoom = base.findElementById("child_room");
		String childroom = base.getData("Orders",1, 7,"D:\\MavenDay1\\excel\\Hotel.xlsx");
		base.sendKeys(childRoom, childroom);
		WebElement btnSubmit = base.findElementById("Submit");
		base.click(btnSubmit);
		WebElement btnRadio = base.findElementById("radiobutton_0");
		base.click(btnRadio);
		WebElement btnContinue = base.findElementById("continue");
		base.click(btnContinue);
		WebElement firstName = base.findElementById("first_name");
		String txtFirstname = base.getData("Orders", 1, 8, "D:\\MavenDay1\\excel\\Hotel.xlsx");
		base.sendKeys(firstName, txtFirstname);
		WebElement lastName = base.findElementById("last_name");
		String txtLastname = base.getData("Orders", 1, 9,"D:\\MavenDay1\\excel\\Hotel.xlsx");
		base.sendKeys(lastName, txtLastname);
		WebElement Address = base.findElementById("address");
		String address = base.getData("Orders",1,10,"D:\\MavenDay1\\excel\\Hotel.xlsx");
		base.sendKeys(Address, address);
		WebElement creditCard = base.findElementById("cc_num");
		String creditcard = base.getData("Orders",1, 11,"D:\\MavenDay1\\excel\\Hotel.xlsx" );
		base.sendKeys(creditCard, creditcard);
		WebElement ccType = base.findElementById("cc_type");
		String cctype = base.getData("Orders",1,12,"D:\\MavenDay1\\excel\\Hotel.xlsx");
		base.sendKeys(ccType, cctype);
		WebElement ccMonth = base.findElementById("cc_exp_month");
		String ccmonth = base.getData("Orders",1,13,"D:\\MavenDay1\\excel\\Hotel.xlsx");
		base.sendKeys(ccMonth, ccmonth);
		WebElement ccYear = base.findElementById("cc_exp_year");
		String ccyear = base.getData("Orders",1,14,"D:\\MavenDay1\\excel\\Hotel.xlsx");
		base.sendKeys(ccYear, ccyear);
		WebElement cvvNo = base.findElementById("cc_cvv");
		String cvvno = base.getData("Orders",1,15,"D:\\MavenDay1\\excel\\Hotel.xlsx");
		base.sendKeys(cvvNo, cvvno);
		WebElement btnBook = base.findElementById("book_now");
		base.click(btnBook);
		Thread.sleep(10000);
		WebElement orderNo = base.findElementById("order_no");
		String orderno = base.getAttribute(orderNo);
		base.WriteData("Orders",1,16,orderno, "D:\\MavenDay1\\excel\\Hotel.xlsx");

	}
}
