package Adactin;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Employee extends BaseClass {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		getdriver();
		loadUrl("http://adactinhotelapp.com/");
		maximize();
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("Done");
		// closeAllWindows();
	}

	@Test
	public void adactin() throws IOException, InterruptedException {
		AdactinLogin adactinlogin = new AdactinLogin();
		adactinlogin.Login();
		AdactinSearchPage searchHtl = new AdactinSearchPage();
		searchHtl.searchHotel();		
		AdactinSelectPage adactselect = new AdactinSelectPage();
		adactselect.select();
		AdactinBookHotelPage bookHtl = new AdactinBookHotelPage();
		bookHtl.book();
		Thread.sleep(5000);
		AdactinBookConfirmed bookconfirmed = new AdactinBookConfirmed();
		bookconfirmed.bookconfirm();
		CancelBooking cancel = new CancelBooking();
		cancel.adactincancel();	
	}
}