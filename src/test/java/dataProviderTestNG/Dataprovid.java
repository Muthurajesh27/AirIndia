package dataProviderTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Dataprovid{
	
	@Test(dataProvider="loginfeature")
	public void test(String user, int pass) {
		String s = String.valueOf(pass);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys(user);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(s);
		driver.quit();			
	}
	
	@DataProvider(name="loginfeature")
	public Object[][] data(){
		return new Object[][] {
			{"muthu@gmail.com",123456789},
			{"muthu",12345},
			{"muthu@gmail.com",12345},
			{"muthu",123456789}
		};
	}
}
