package frameworkDay1;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdactinTaskJunit extends BaseClass {
	static WebDriver driver;
		
@BeforeClass
public static void beforeClass() {
	getdriver();
	loadUrl("http://adactinhotelapp.com/");
	maximize();
}
@AfterClass
public static void afterClass() {
	//closeAllWindows();
}
@Test
public void login() throws IOException, InterruptedException {
	WebElement ExistingUser = xPath("//td[text()='Existing User Login - Build 1']");
	String Exist = ExistingUser.getText();
	Assert.assertEquals("Login","Existing User Login - Build 1", Exist);
		
	WebElement txtUser = findElementById("username");
	sendKeys(txtUser, getData("Orders", 1, 0, "D:\\MavenDay1\\excel\\Hotel.xlsx"));
	String attribute = getAttribute(txtUser);
	Assert.assertEquals("username", "muthurajesh", attribute);
	WebElement txtPass = findElementById("password");
	sendKeys(txtPass, getData("Orders", 1, 1, "D:\\MavenDay1\\excel\\Hotel.xlsx"));
	WebElement btnLogin = findElementById("login");
	click(btnLogin);
	
	WebElement Search = xPath("//td[text()='Welcome to Adactin Group of Hotels']");
	String searchHotel = Search.getText();
	Assert.assertEquals("Hotel", "Welcome to Adactin Group of Hotels", searchHotel);
	
	WebElement loc = findElementById("location");
	sendKeys(loc, getData("Orders", 1, 2,"D:\\MavenDay1\\excel\\Hotel.xlsx" ));
	WebElement hotel = findElementById("hotels");
	sendKeys(hotel, getData("Orders", 1, 3, "D:\\MavenDay1\\excel\\Hotel.xlsx"));
	WebElement roomType = findElementById("room_type");
	sendKeys(roomType, getData("Orders",1, 4,"D:\\MavenDay1\\excel\\Hotel.xlsx" ));
	WebElement roomNo = findElementById("room_nos");
	sendKeys(roomNo, getData("Orders",1, 5,"D:\\MavenDay1\\excel\\Hotel.xlsx"));
	WebElement adultRoom = findElementById("adult_room");
	sendKeys(adultRoom, getData("Orders",1,6,"D:\\MavenDay1\\excel\\Hotel.xlsx"));
	WebElement childRoom = findElementById("child_room");
	sendKeys(childRoom, getData("Orders",1, 7,"D:\\MavenDay1\\excel\\Hotel.xlsx"));
	WebElement btnSubmit = findElementById("Submit");
	click(btnSubmit);
	
	WebElement selectHotel = xPath("//strong[text()='Total Price (excl. GST) ']");
	String select = selectHotel.getText();
	Assert.assertEquals("Selecthotel page", "Total Price (excl. GST)", select);
	
	WebElement btnRadio = findElementById("radiobutton_0");
	click(btnRadio);
	WebElement btnContinue = findElementById("continue");
	click(btnContinue);
	
	WebElement book = xPath("//td[text()='Book A Hotel ']");
	String bookhot = book.getText();
	Assert.assertEquals("Book Hotel", "Book A Hotel", bookhot);
	
	WebElement firstname = findElementById("first_name");
	sendKeys(firstname, getData("Orders", 1, 8, "D:\\MavenDay1\\excel\\Hotel.xlsx"));
	WebElement lastname = findElementById("last_name");
	sendKeys(lastname, getData("Orders", 1, 9,"D:\\MavenDay1\\excel\\Hotel.xlsx"));
	WebElement add = findElementById("address");
	sendKeys(add, getData("Orders",1,10,"D:\\MavenDay1\\excel\\Hotel.xlsx"));
	WebElement creditcard = findElementById("cc_num");
	sendKeys(creditcard, getData("Orders",1, 11,"D:\\MavenDay1\\excel\\Hotel.xlsx" ));
	WebElement ccType = findElementById("cc_type");
	sendKeys(ccType, getData("Orders",1,12,"D:\\MavenDay1\\excel\\Hotel.xlsx"));
	WebElement ccMonth = findElementById("cc_exp_month");
	sendKeys(ccMonth, getData("Orders",1,13,"D:\\MavenDay1\\excel\\Hotel.xlsx"));
	WebElement ccYear = findElementById("cc_exp_year");
	sendKeys(ccYear, getData("Orders",1,14,"D:\\MavenDay1\\excel\\Hotel.xlsx"));
	WebElement cvvNo = findElementById("cc_cvv");
	sendKeys(cvvNo, getData("Orders",1,15,"D:\\MavenDay1\\excel\\Hotel.xlsx"));
	WebElement btnBooknow = findElementById("book_now");
	click(btnBooknow);
	Thread.sleep(10000);
	
	WebElement conf = xPath("//td[text()='Booking Confirmation ']");
	String confirmed = conf.getText();
	Assert.assertEquals("Order Confirmed","Booking Confirmation",confirmed);
	WebElement confirm = findElementById("order_no");
	String bookConfirmed = getAttribute(confirm);
	WriteData("Orders", 1, 16, bookConfirmed,"D:\\MavenDay1\\excel\\Hotel.xlsx");
	System.out.println(bookConfirmed);
	
}

}
