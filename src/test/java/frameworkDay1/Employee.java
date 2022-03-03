package frameworkDay1;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Employee extends BaseClass{
	
	static WebDriver driver;
	
@BeforeClass
public static void beforeClass() {
//	getdriver();
//	loadUrl("http://adactinhotelapp.com/");
//	String title = getTitle();
//	Assert.assertTrue(title, true);
//	maximize();
}
@AfterClass
public static void afterClass() {
	//closeAllWindows();
}

	@Test
	public void test1() {
		System.out.println("Start");
		Assert.assertTrue("Verify Password", true);
		Assert.assertTrue("Verify Password", true);
		Assert.assertTrue("Verify Password", true);
		Assert.assertTrue("Verify Password", true);
		System.out.println("end");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
}
