package frameworkDay1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JUnitDay1 {
	static WebDriver driver;
		
@BeforeClass
public static void beforeClass() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("http://greenscart.in/#/login?returnUrl=%2F");
	driver.manage().window().maximize();
}
@AfterClass
public static void afterClass() {
	driver.quit();
}
@Before
public void beforeMethod() {
	long time = System.currentTimeMillis();
	System.out.println(time);
}
@After
public void afterMethod() {
	long time = System.currentTimeMillis();
	System.out.println(time);
}
@Test
public void login() {
	WebElement username = driver.findElement(By.id("loginEmailId"));
	username.sendKeys("muthurajesh");
	WebElement password = driver.findElement(By.id("loginPassword"));
	password.sendKeys("qwerty1234");
	WebElement txtLogin = driver.findElement(By.className("btnRegister form-control"));
	txtLogin.click();
}
}
