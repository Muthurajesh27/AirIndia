package frameworkDay1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable extends BaseClass{
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> allRow = table.findElements(By.tagName("tr"));
		for (int i = 0; i < allRow.size(); i++) {
			WebElement webElement = allRow.get(i);
			List<WebElement> data = driver.findElements(By.tagName("td"));
			for (int j = 0; j < data.size(); j++) {
				WebElement webElement2 = data.get(j);
				String text = webElement2.getText();
				System.out.println(text);
			}			
			System.out.println();
		}
		
	}
}
